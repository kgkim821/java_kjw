/*
join 문법
-- 테이블1의 외래키가 테이블2의 기본키를 참조하는 경우 
-- join 은 일반적으로 외래키와 기본키를 연결하지만, 상황에 따라서는 외래키가 아닌 속성을 기본키와 연결 할 수 있다.
 
select 테이블.속성명1 , 테이블1. 속성명2,...테이블2.속성명1, 테이블2. 속성명2....

FROM 
    테이블1
inner join | left join | right join -- inner 조인과 outer 조인 둘다 가능 
join
	테이블2
on
	테이블1.외래키 = 테이블2.기본키 
    
on
	[테이블1.외래키 = 테이블3.기본키]
[where절]
[group by 절]
[having 절]
[order by 절]
[limit절]
*/
select course.* ,title
from course
join subject
on course.subject_code = subject.code;

-- 대학물리를 수강하는 학생들 수를 조회하는 쿼리
select subject_code as 과목코드 , count(*) as 수강생수 from course where subject_code in 
(select subject_code from subject where title = '대학물리') group by subject_code;

select subject_code as 과목코드, count(*) as 수강생 
from course
join subject 
on subject_code = code 
where title='대학물리'
group by subject_code;

-- 유재석 학생이 수강하는 과목의 수를 조회하는 쿼리
 
select student_num as 유재석학번, count(*) as 수강과목수 from course where student_num = (select num from student where name = '유재석')
group by student_num;

-- 유재석 학생이 수강하는 과목명을 조회하는 쿼리
select name as 이름 , title as 수강과목
from course
join student on student_num = student.num
join subject on subject_code = code
where name = '유재석'; 

select distinct subject.title as 과목명
from course
join subject on subject_code = code
where course.professor_name='이순신';

