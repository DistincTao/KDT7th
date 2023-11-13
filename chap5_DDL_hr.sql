-- 서브쿼리를 이용하여 테이블 복사 
create table copyEMP
as (select * from employees);

select * from copyEMP;

create table copyEMP1
as select employee_id, first_name, salary, hire_date, department_id from employees where department_id = 30;

insert into copyEMP1 values(300, '김삼백', 3000, '2001/01/01', 30);
insert into copyEMP1 values(301, '김삼백일', 3100, '2001-01-01', 30);
insert into copyEMP1 values(302, '김삼백이', 3200, '02-01-2002', 30);
insert into copyEMP1 values(302, '김삼백이', 3200, to_date('02-01-2002','dd-mm-yyyy'), 30);
insert into copyEMP1 values(303, '김삼백삼', 3300, sysdate, 30);

select * from copyEMP1;

-- 테이블 구조만 복사 (where조건절에 맞는 행이 하나도 없으므로, 데이터는 복사가 안됨)
create table copyEMP3
as select * from employees
where 1 = 0;

select * from copyEMP3;

-- 서브쿼리를 사용하여 한번에 여러 데이터 추가
-- 단, values절은 사용하지 않는다.
-- 컬럼갯수와 자료형이 일치해야 한다.
insert into copyEMP3(employee_id, first_name, last_name, email, job_id, hire_date, salary, department_id)
    select employee_id, first_name, last_name, email, job_id, hire_date, salary, department_id from employees;

-- 테이블 삭제 
drop table copyEMP3;

-- (1) create table로 테이블의 구조 정의
-- CREATE TABLE 테이블명 (
--	컬럼명1 데이터타입 표현식,
--	컬럼명2 데이터타입 표현식,
--	......,
--	컬럼명n 데이터타입표현식);

create table member01 (
    userId varchar2(12),
    pwd varchar2(16),
    name varchar2(10),
    tel varchar2(13),
    birthday date,
    gender char(1) );

-- insert into문으로 데이터 저장
-- insert into 테이블명 [(컬럼명1, 컬럼명2, ...)] values(값1, 값2,....)
-- 컬럼명은 생략 가능 (생략시, 모든 컬럼에 저장하겠다는 의미. 컬럼 순서대로 넣어줘야 함)
insert into member01 values('dooly', '1234', '둘리', '010-1234-5555', '1998-01-01', 'M');
insert into member01 values('dooly', '1234', '둘리', '010-1234-5555', '1998-01-01', 'M', 'F');
--위문장은 에러: ORA-00913: too many values
insert into member01 values('doner', '1234', '도우너', '010-1111-2222', '2001-01-01');
-- 위문장은 에러: ORA-00947: not enough values
insert into member01 values('doner', '1234', '도우너', '010-1111-2222', '2001-01-01', 'M');
insert into member01 values('huidong', '1234', '희동이', '010-1111-3333', '2010-01-01', 'M');
insert into member01 values('michol', '1234', '마이콜콜콜콜콜', '010-1111-4444', '2002-01-01', 'M');
-- 위문장은 에러: ORA-12899: value too large for column "HR"."MEMBER01"."NAME" (actual: 21, maximum: 10)

insert into member01 (userId, pwd, name) values('gildong', '1234', '고길동'); -- 암시적 null추가
insert into member01 (userId, name, pwd) values('ddochi', '또치', null); -- 명시적 null추가

-- (2) alter table구문으로 테이블 구조 수정하기
--- 1) add  : 새로운 컬럼 추가
alter table member01
add (job varchar2(10));

alter table member01
add hobby varchar2(50);

--- 2) modify : 기존 컬럼 수정
----- a. 해당 컬럼에 데이터가 없는 경우 : 데이터 타입, 사이즈 모두 변경 가능
----- b. 해당 컬럼에 데이터가 있는 경우 : 데이터 타입 변경 불가, 사이즈는 업만 가능
alter table member01
modify (name varchar2(20) );

alter table member01
modify (tel varchar2(10)); -- 사이즈 다운 불가능 : 에러 ORA-01441: cannot decrease column length because some value is too big

alter table member01
modify (tel varchar2(15));

alter table member01
modify (birthday varchar2(15)); -- 에러: 데이터가 존재하므로 컬럼데이터타입 변경은 불가능.
-- 위문장은 에러: ORA-01439: column to be modified must be empty to change datatype

--- 3) drop column : 기존 컬럼 삭제
alter table member01
drop column birthday;

alter table member01
drop column hobby;

--- 4) rename column으로 컬럼 이름 변경
alter table members
rename column userId to memberId;

--- (3) truncate table로 테이블의 데이터 삭제하기
truncate table member01;

--- (4) renameto 로 테이블 이름 변경하기
rename member01 to members;

--- (5) drop table로 테이블 삭제하기
drop table members;



select * from member01;
select * from members;
desc member01;







