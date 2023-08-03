/*
select 속성명, ..., 속성명n from 테이블명;
=>테이블에서 속성명1, .... , 속성명n의 값들을 조회
=>전체를 조회하려면 *을 이용
as : 속성 또는 테이블명을 일시적으로 변경해서 사용할 때 쓰는 키워드
속성명1 as 속성명 2 => 속성명1을 일시적으로 속성명2로 사용
*/
use course;
-- 등록된 모든 학생의 모든 정보를 조회하는 쿼리
select * from student;

-- 등록된 모든 학생의 모든 학번을 조회하는 쿼리
select num as '학번' from student;

/*
select 속성명1 ... 속성명 n from 테이블명 where 조건식;
=> 조건식을 만족하는 행 (튜플)들만 검색해서 해당 행의 속성1, ... 속성 n의 정보를 조회
where 
속성명1 = 값1 or 속성명 2 = 값2 and  속성명 3 = 값3
= : 같다 null과 비교과 안됨
!= : 같지 않다 null과 비교과 안됨
<> : 같지 않다
and :~하고 , 자바의 && 연산자
or : ~하거나 , 자버의 || 연산자
*/
-- 컴퓨터공학과 학생들을 조회하는 쿼리
/*
is null : null 인지 확인
is not null : null이 아닌지 확인
like : 와일드카드와 함께 사용되며 , 값이 주어진 와일드가 포함된 문자열과 같은지를 비교할때 사용
_ : 한글자를 의미하는 와일드 카드
% : 0글자이상을 의미하는 와일드 카드
속성명 between a and b : 속성의 값이 a 이상 b 이하인 조건을 만족할 떄 사용
속성명 in (값1,값2,값3, .....) 속성의 값이 값1이거나 값2이거나  값n인 조건을 만족할 때 사용
=> 속성명 = 값1 or 속성명 값2 ...속성명 n = 값n

where 속성명 any (서브쿼리);
=> 속성이 서브쿼리 결과 중 하나라도 만족하면 조회
where 속성명 비교연산자( >= , <= ,!= <,>) all(서브쿼리);

정렬 : order by
order by 는 where 절과 group by 절 뒤에 나와야 함
order by 속성명 1 정렬방법, 속성명 2 정렬방법, ...
=> 속성명1을 정렬방법을 기준으로 정렬하고 ,송성명1의 값이 같으면 속성명2를 정렬방법을 기준으로 정렬함 
	-정렬방법
    -asc : 오름차순 기본값 / 행이아래로 갈수록 값이 커짐
    -desc : 내림차순 / 행이 아래로 갈수록 값이 작아짐 

*/
/*
limit : 행(튜플)을 원하는 위치부터 원하는 개수를 가져오기 위한 방법
	-위치가 order by 절뒤 . 제일 마지막에 위치해야 함.
    -전체 검색 결과가 아닌 일부를 가져올 때 사용
limit A;
=>0번지부터 A개를 가져옴
limit A , B;
=>A 번지부터 B개를 가져옴

*/

/*
group by : 같은 값을 가지는 행들을 묶어서 평균을 내거나 개수를 세는 등의 작업(집계함수)을 할 때 사용
having절 : 집계함수에 조건
- 위치는 where 절 다음 . order by 앞
자주 사용하는 집계함수
-avg(속성 또는 식): 평균
-min(속성 또는 식): 최소값
-max(속성 또는 식): 최대값
-count(속성): 행 (튜플)의 개수
-count(distinct 속성) : 중복을 배제한 행의 개수
-sum(속성 또는 식): 합
*/
SELECT 
    *
FROM
    student
WHERE
    major = '컴퓨터공학과';

select * from student where major <> '컴퓨터공학과';
select * from student where major != '컴퓨터공학과';

-- 학번이 2023135001 인 학생이 듣는 수강정보를 조회하는 쿼리

select * from course where student_num='2023135001';
select title from subject where point = '3';
-- 이름이 3자인 학생 정보를 조회하는 쿼리
select * from student where name like '___';
-- 성이 유씨인 학생 정보를 조회하는 쿼리 
select * from student where name like '유__';-- 성이 유씨이고 3글자 

select * from student where name like '유%'; -- 성이 유씨
-- 학생의 학번은 입학년도 4자 + 학과코드 3자 + 번호 3자
-- 23학번 학생을 조회하는 쿼리
select * from student where num like'2023%';
-- 방송학과 코드는 135이다.
select * from student where num like'%135%';
 -- 학점이 2학점 이상 3학점 이하인 과목을 조회하는 쿼리
select * from subject where point between '2' and '3';

select * from course where professor_name in ('이순신','한석봉');

/*
distinct : 중복된 결과를 제거 하고 조회
select distinct 속성명 from 테이블명;
*/

-- 2023년에  수강하는 과목들의 과목코드를 조회 하는 쿼리
select distinct subject_code from course where year ='2023';

-- 과목명이 글쓰기인 과목의 수강정보를 조회하는 쿼리
 select * from course where subject_code =( select code from subject where title = '글쓰기');
 -- 학점이 2학점 또는 3학점 이상인 과목의 과목의 수강정보를 조회
 select * from course where subject_code = any(select * from subject where point in(2,3));
 
 select * from subject where point in(2,3)	;
 
 -- 글쓰기와 영어가 아닌 모든 과목의 수강 정보를 조회
 select * from course 
	where subject_code != all(select code from subject where title in ('글쓰기','영어'));
 -- 학생정보를 이름순으로 오름차순 정렬하여 조회
 select * from student order by name ;
 -- 학생 정보를 이름순으로 내림차순 정렬하여 조회
 select * from student order by name desc;

-- 학생정보를 전공, 이름순으로 오름차순으로 정렬아여 조회
select * from student order by major ,name asc;
-- 학생들이 소소된 과를 조회하는 쿼리
select distinct major from student;

-- 학생들 정보를 학번순으로 오름차순 정렬 후 위에서 2명의 학생 정보를 조회하는 쿼리
select * from student order by num asc limit 2;  
-- 학생들 정보를 학번순으로 오름차순 정렬 후 3번째 4번째 학생 정보를 조회하는 쿼리
select * from student limit 2,2; 
-- 학생들 정보를 학번순으로 오름차순 정렬 후 , 2명씩 보여줄떄 3번째 페이지에 있는 학생 정보를 조회하는 쿼리
select * from student limit 4,2;

-- 각 과별 학생수를 조회
SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
-- 각 과별 학생수를 조회 
select major as 학과,count(num) as 학생수 from student group by major; 
-- 과목별 수강 학생수를 과목코드, 수강생수로 조회하는 쿼리 
select subject_code as 과목코드 ,count(*) as 수강생수 from course group by subject_code;
-- 과목별 수강생 수가 4명 이상인 과목의 과목코드를 조회하느 쿼리
select subject_code as 과목코드 ,count(*) as 수강생수 from course group by subject_code having 수강생수 >= 4;





 