/*
inner join : 두 테이블이 외래키로 연결 되었을때 , 양쪽다 데이터가 있는경우
outer join : 두 테이블이 외래키로 연결 되었을때 , 한테이블을 기준으로 연결할때 사용
- 상품별 리뷰수를 조회하는 경우, 리뷰가 등록이 안된 상품들은 inner join을 이용하여 리뷰수를 알수 없음

-outer join 문법 : 기준 테이블이 매우 중요 , inner join 은 a join b, b join a 가 같지만
outer join 은 a outer join b 와 bouter join a는 결과가 다르다
-종류 : left , right 
- left join : 기준 테이블을 기준으로 연결
- right join : 참조 테이블을 기준으로 연결

a left join b == b right join a 
 
select * from 기준테이블 
	join 참조테이블 
     on 기준테이블.외래키 = 참조텡이블.기본키
     [WHERE절]
     [GROUP BY 절]
     [HAVING절]
     [ORDER BY 절]
     [LIMIT절]
     
*/
-- 제품별 옵션의 개수를 조회하는 쿼리 (제품명, 옵션수)
 
SELECT 
     op_pr_code, COUNT(re_num) AS 리뷰수
FROM
    review
        RIGHT JOIN
    `option` ON op_num = re_op_num
GROUP BY op_pr_code;

 
