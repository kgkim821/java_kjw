-- 영화 오펜하이머에 출연한 감독과 배우들을 조회하는 쿼리 
SELECT 
    MO_TITLE AS '영화제목',
    FP_NAME AS '영화인',
    RO_ROLE AS '역할'
FROM
    FILM_PERSON
        JOIN
    ROLE ON FP_NUM = RO_FP_NUM
        JOIN
    MOVIE ON MO_NUM = RO_MO_NUM
WHERE
	MO_TITLE = '오펜하이머';
-- 영화 오펜하이머 기본 정보를 조회하는 쿼리(제목, 제목(영문), 개봉일, 런링타임, 줄거리, 연령제한, 예매율
SELECT 
    MO_TITLE AS 제목,
    MO_TITLE_ENG AS '제목(영문)',
    MO_OPENING_DATE AS 개봉일,
    MO_RUNNING_TIME AS 런닝타임,
    MO_PLOT AS 줄거리,
    MO_AG_NAME AS 연령제한,
    CONCAT(MO_RESERVATION_RATE,'%') AS 예매율
FROM
    MOVIE
WHERE
    MO_TITLE = '오펜하이머';
-- 영화 오펜하이머의 트레일러와 스틸컷 파일의 개수를 조회하는 쿼리
SELECT 
	MO_TITLE AS '영화제목',
	FI_STATE AS '타입',
    COUNT(*) AS '개수'
FROM
    FILE
        JOIN
    MOVIE_FILE ON MF_FI_NUM = FI_NUM
        JOIN
    MOVIE ON MF_MO_NUM = MO_NUM
WHERE
    MO_TITLE = '오펜하이머'
GROUP BY FI_STATE;


-- CGV강남 영화관에서 콘크리트 유토피아 20:50에 예매 가능한 좌석을 조회하는 쿼리(OUTER JOIN 이용)
SELECT 
    se_name as '좌석번호' , case 
    when rl_se_num is null then 'o'
    else 'n' 
    end as '예약 가능 여부'
FROM
    SEAT
        JOIN
    SCREEN ON SE_SC_NUM = SC_NUM
		JOIN
	MOVIE_SCHEDULE ON MS_SC_NUM = SC_NUM
		JOIN
	RESERVATION ON RV_MS_NUM = MS_NUM
		LEFT JOIN -- 예약과 예약 리스트를 JOIN하는게 아니라 예약 리스트와 좌석을 JOIN
	RESERVATION_LIST ON SE_NUM = RL_SE_NUM
WHERE
	MS_NUM = 8 AND RL_SE_NUM IS NULL;


-- abc123 회원이 관람했던 영화 목록을 조회하는 쿼리
 
SELECT 
    mo_title as '관람영화'
FROM
    reservation 
    join movie_schedule 
    on ms_num = rv_ms_num
    join movie 
    on ms_mo_num = mo_num
WHERE
    rv_me_id = 'abc123'
    and now() < concat(ms_date,' ',ms_start_time)
    group by mo_num;
-- 같은 영화를 여러번 봐도 관람 영화 목록에는 1번만 출력 

-- 예약 가능한 모든 상영 영화정보를 조회하는 쿼리
 select  distinct mo_title as 영화제목 , mo_date as 상영일 , mo_start_time as 상영시간, mo_ag_name as 연령제한 
 from movie_schedule 
 join movie on mo_num = ms_mo_num
 where now() < concat(ms_date,' ',ms_start_time) and ms_possible_seat > 0;
 
 -- cvg 에서 이벤트로 한영화를 여러번 회원중에 가장 많이 본 회원 3명을 뽑으려고 한다
-- 각 영화를 각 회원이 몇번봤는지 조회하는 쿼리

SELECT 
    mo_title as 영화 , rv_me_id as 아이디, count(rv_num) as 횟수 
    FROM
    reservation 
    join movie_schedule 
    on ms_num = rv_ms_num
    join movie
    on ms_mo_num = mo_num
WHERE now() >= concat(ms_date,' ',ms_start_time)
group by rv_me_id,ms_mo_num;

-- 회원들 중 금액 사용이 가장 많은 3명의 회원을 조회하는 쿼리
 
SELECT * FROM (
	SELECT 
		ME_ID AS 아이디,
		누적금액,
		RANK() OVER(ORDER BY 누적금액 DESC) AS 순위
	FROM
		(SELECT *, IFNULL(SUM(CASE
					WHEN NOW() >= CONCAT(MS_DATE, ' ', MS_START_TIME) THEN RV_PRICE
					ELSE 0
				END),
				0) AS 누적금액 FROM
		RESERVATION
			JOIN
		MOVIE_SCHEDULE ON RV_MS_NUM = MS_NUM
			RIGHT JOIN
		MEMBER ON RV_ME_ID = ME_ID
		GROUP BY RV_ME_ID
		) AS A
	) AS B
WHERE 순위 <= 3;


-- 영화인별로 배우로 참여한 영화 개수
select fp_name as 영화인 ,ifnull( count(ro_num),0) as '참여영화수'  
from film_person
 left join
 (select * from role where ro_role = '배우') as role2 on ro_fp_num = fp_num
 group by fp_num;
 
 -- 각 스케쥴별 예약한 좌석 수를 조회하는 쿼리
 
 select mo_title as 영화
 ,ms_date as 상영일
 ,ms_start_time as 상영시간
 ,sc_total_seat - ms_possible_seat as 에약좌석수
 
 from movie_schedule join
 screen on ms_sc_num=sc_num
 join
 movie on mo_num=ms_mo_num;
 -- 영화관별 상영 영화 목록을 보여주는 쿼리
 select * from theater;
 select * from movie_schedule;
 
 select th_name as 영화관,mo_title as 영화 from movie_schedule
	join screen on ms_sc_num = sc_num -- 영화관과 연결을 위해 먼저 상영관과 연결 
	join theater on th_num=sc_th_num
    join movie on ms_mo_num = mo_num
	WHERE now() < concat(ms_date,' ',ms_start_time)
     group by th_num , ms_mo_num
;


-- 오펜하이머를 상영하는 영화관을 조회하는 쿼리
select * from theater 
join movie_schedule
on th_num=mo_th_num;
 