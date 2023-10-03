-- 기종별 총 좌석 수 조회 (A148,A158,A320,A333,A388,B737,B738,B763,B78X,T204)
SELECT AM_MODEL AS 기종, COUNT(*) AS 좌석수
	FROM SEAT
		JOIN
	AIRPLANE_MODEL ON SE_AM_MODEL = AM_MODEL
GROUP BY AM_MODEL;

-- 기종별 퍼스트 좌석 수 조회
SELECT AM_MODEL AS 기종, COUNT(*) AS 퍼스트
	FROM SEAT
		JOIN
	AIRPLANE_MODEL ON SE_AM_MODEL = AM_MODEL
WHERE SE_SC_NAME = '퍼스트'
GROUP BY AM_MODEL;

-- 기종별 비지니스 좌석 수 조회
SELECT AM_MODEL AS 기종, COUNT(*) AS 비지니스
	FROM SEAT
		JOIN
	AIRPLANE_MODEL ON SE_AM_MODEL = AM_MODEL
WHERE SE_SC_NAME = '비지니스'
GROUP BY AM_MODEL;

-- 기종별 이코노미 좌석 수 조회
SELECT AM_MODEL AS 기종, COUNT(*) AS 이코노미수
	FROM SEAT
		JOIN
	AIRPLANE_MODEL ON SE_AM_MODEL = AM_MODEL
WHERE SE_SC_NAME = '이코노미'
GROUP BY AM_MODEL;

select count(*) 
	from
		seat
	join
		airplane_model on se_am_model = am_model
where am_model = 'B737';