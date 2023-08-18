/*
프로시저 
-일련의 쿼리를 마치 하나의 함수처럼 실행하기 위한 쿼리의 집합
-예시
-대학생 학번을 생성하기 위한 프로시저 : 입학년도 , 학과 번호를 이용하여 학번을 생성할 수 있다

			함수 	vs  프로시저
매개변수 		여러개 		여러개(입출력)
리턴값 		1개,필수		여러개, 선택
select문 	사용 가능 	사용불가능
처리장소 		클라이언트 	서버

프로시저 정의
delimiter//

create procedure 프로시저명(
[ (in | out | inout)  매개변수명 타입

]
)
begin 
	   - 프로시저구현		
변수선언
decleare 변수명 타입
delcare 변수명 

set 변수명 = 값 
조건문 : case when
case 
	when 조건식1 then
		실행문1;
	when 조건식2 then 
		실행문2;
        else 
			실행문3
		end;
        -- 조건문: if
        if 조건식 then
			실행문1
		else 
			실행문2
            end if;
	end//

프로시저 호출
call 프로시저명 (매개변수들);


delimiter; 종료
*/

DELIMITER  //
create procedure reservation_movie(
	IN _MS_NUM INT, -- 스케쥴 번호
	IN _ID VARCHAR(15),	-- 예약 아이디명
	IN _ADULT_COUNT INT,-- 성인수
	IN _TEENAGER_COUNT TEXT-- 청소년 수
    
)
BEGIN
	DECLARE _ADULT_TOTAL_PRICE INT DEFAULT 0;
	DECLARE _TEENAGER_COUNT INT DEFAULT 0;
	DECLARE _ADULT_TOTAL_PRICE INT DEFAULT 0;
	DECLARE _IS_DISCOUNT char(1);
	
    DECLARE _SE_NUM INT;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET DONE =1; 
    
    /*
    CURSOR은 SQL 결과 집합을 가르키는 데이터 타입 . 프로시저나 함수내에서 사용
    -결과를 반복처리할 떄 사용
    -결과를 한번에 가져오는게 아니라 하나씩 가져와서 처리
    
    */
    -- 좌석 리스트를 CURSOR로 선언 
    DECLARE CUR cursor for
		select SEAT_NAME
        FROM json_table(_SEAT_LIST, '$[*]'
			columns(SE_NAME VARCHAR(4) PATH '$.SEAT_NAME')
            );
    -- 예약 테이블에 정보를 추가 
    --  조조할인 여부에 따라 성인 전체요금과 청소년 전체 요금을 계산
    SET _IS_DISCOUNT = ( SELECT MS_DISCOUNT FROM movie_schedule WHERE MS_NUM = _MS_NUM);
    IF _IS_DISCOUNT = 'Y' THEN 
		SET _ADOULT_TOTAL_PRICEE = (SELECT PR_DISCOUNT_PRICE from PRICE WHERE PR_TYPE='성인')*_ADULT_COUNT;
        SET _TEENAGER_TOTAL_PRICE  = (SELECT PR_DISCOUNT_PRICE from PRICE WHERE PR_TYPE='청소년')*_TEENAGER_COUNT;
    ELSE
		SET _ADOULT_TOTAL_PRICEE = (SELECT PR_PRICE from PRICE WHERE PR_TYPE='성인');
        SET _TEENAGER_TOTAL_PRICE  = (SELECT PR_PRICE from PRICE WHERE PR_TYPE='청소년');
    END IF;
    -- 전체 요금을 계산 
    SET _TOTAL_PRICE =_ADULT_COUNT + _TEENAGER_COUNT;
    -- 예약 테이블에 정보를 추가
    INSERT INTO RESERVATION ( RV_MS_NUM , RV_ME_ID , RV_ADULT, RV_TEENAGER ,RV_PRICE)
    VALUE( _MS_NUM, _ID, _ADULT_COUNT , _TEENAGER_COUNT, _TOTAL_PRICE);
	-- 예약 리스트에 좌석 정보를 추가
	-- CURSOR를 열음
    OPEN CUR;
    READ_LOOP:LOOP 
		FETCH CUR INTO SE_NAME;
        -- 반복을 멈추는 작업
        IF DONE then
			LEAVE READ_LOOP;
		-- 좌석정보를 이용하여 예약 리스트에 추가하는 작업
        -- 영화 스케쥴과 좌석이름을 이용하여 좌석번호를 가져옴
        
        
        
        SET _SE_NUM = (
        select SE_NUM FROM SEAT
			JOIN SCREEN ON SE_SC_NUM = SC_NUM
			JOIN movie_schedule ON ms_sc_num = SC_NUM
			WHERE MS_NUM =_MS_NUM AND SE_NAME=SE_NAME
            ); 
        
        END LOOP;
        CLOSE CUR;
    -- 영화 스케쥴에 예약 가능좌석을 업데이트
    
    
    -- 모든 영화 에매율을 업데이트 


END //
DELIMITER ;

SELECT * FROM MOVIE_SCHEDULE;
SELECT * FROM PRICE;
CALL reservation_movie( 1, 'admin',1,1,'[{"SEAT_NAME : A1},{"SEAT_NAME : A2}]');
/*
{
"속성명" : 값 , 
"속성명" : 값 
}
*/
select SE_NUM FROM SEAT
	JOIN SCREEN ON SE_SC_NUM = SC_NUM
    JOIN movie_schedule ON ms_sc_num = SC_NUM
    WHERE MS_NUM =1 AND SE_NAME='A1';