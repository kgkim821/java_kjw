-- qwe123  회원이 구매(환불, 반품을 제외한) 제품명과 옵션명 목록을 확인하는 쿼리
 
SELECT 
    or_me_id as 주문아이디
   ,pr_name as 제품명 
   ,op_name as 옵션명
   ,pr_price as 제품가격
   ,ol_amount as 구매수량
FROM
    `order`
    join order_list on ol_or_num = or_num
    join `option` on ol_op_num = op_num
    join product on op_pr_code = pr_code
where or_state not IN ('환불', '반품') AND or_me_id = 'qwe123';


-- abc123 회원이 장바구니에 담은 제품명과 옵션명 , 수량을 확인하는 쿼리
SELECT 
    ba_me_id as 회원아이디,
    pr_name as 회원아이디,
	op_name as 회원아이디,
    ba_amount as 수량
FROM
    basket
    join `option`
    on ba_op_num = op_num
    join 
    product
    on op_pr_code = pr_code
    
WHERE
    ba_me_id = 'abc123';
    
-- abc123 회원이 등록한 배송지 정보를 조회하는 쿼리
SELECT 
    ad_addr
FROM
    address
WHERE
    ad_me_id = 'abc123';
    
-- 등록된 모든 제품을 검색하는 쿼리
select * from product; 

-- kh가 제품명에 포함된 제품들을 검색하는 쿼리
select * from product where pr_name LIKE concat('%','KH','%');

-- kh가 제품명에 포함된 제품들 중에서 1페이지에 해당하는 제품들을 검색하는쿼리 (한페이지는 최대 5개)
SELECT 
    *
FROM
    product
WHERE
    pr_name LIKE CONCAT('%', 'KH', '%')
    limit 0 , 5;
 
-- kh가 제품명에 포함된 제품들 중에서 2페이지에 해당하는 제품들을 검색하는쿼리 (한페이지는 최대 5개)
SELECT 
    *
FROM
    product
WHERE
    pr_name LIKE CONCAT('%', 'KH', '%')
    limit 5 , 5;
    
    select * from shoppingmall.order;
    update `order` set or_state = '구매 확정' where or_ad_num = '1';
    
-- 주문에 구매확정으로 수정alter

 -- abc123회원이 구매 확정한 abc001 제품중 무선인 제품에 '좋은 마우스입니다.'라고 리뷰를 등록했을때 쿼리
 select * from review; 
 insert into review(re_content , re_thumb , re_op_num, re_me_id)
 values('좋은 마우스입니다.' , null, 1 , 'abc123');
 
 -- abc123회원이 작성한 리뷰가 있는 제품명을 조회
 select * from product;
 
SELECT 
    pr_name as 리뷰제품
FROM
    review
        JOIN `option` ON re_op_num = op_num
        JOIN product ON pr_code = op_pr_code
WHERE
    re_me_id = 'abc123';   
    
 select re_content as 리뷰명 
 from
    review
    JOIN `option` ON re_op_num = op_num
    JOIN product ON pr_code = op_pr_code
where 
	op_pr_code = 'abc001' and
	op_name = '무선';
    
-- 제품명이 kh무선마우스인 제품의 리뷰 개수를 조회하는 쿼리
select count(*) AS '리뷰수' 
from review 
	join `option` on op_num = re_op_num
    join product on pr_code = op_pr_code
    where pr_name = 'KH무선마우스' ;
    
    -- 제품별 리뷰 개수 를 조회하는 쿼리
    select * from product;
    SELECT 
     op_pr_code, COUNT(re_num) AS 리뷰수
FROM
    review
        RIGHT JOIN
    `option` ON op_num = re_op_num
GROUP BY op_pr_code;


select pr_name as 제품명, count(*) from product join `option` on pr_code = op_pr_code group by pr_code;
