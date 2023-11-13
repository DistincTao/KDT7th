-- DML : 테이블에 데이터를 추가, 수정, 삭제
-- CRUD : CREATE READ UPDATE DELETE

CREATE TABLE EMP01 
      (EMPNO NUMBER(4),
       ENAME VARCHAR2(16),
       JOB VARCHAR2(12),
       HIREDATE DATE,
       SAL NUMBER(6));

-- (1) INSERT INTO : 데이터를 테이블에 추가
-- 컬렴명을 생략하면 테이블의 모든 컬럼에 대해서 값을 주어야 한다.
--(이때, 순서는 테이블을 만들때 설정한 컬럼 순서대로 주어야 한다.)
--
--컬럼명을 기입하면 기입한 컬럼명 순소대로 값을 주면 된다,.
--컬럼 값에 NULL을 기입하여면 VALUES 절의 값 부분에 BNULL을 넣으면 된다.
--NULL이 들어갈 컬럼 값을 아예 입력하지 않는다. (암시적 입력)
--(단, 컬럼의 제약조건이 NULL 가능일 때만)
INSERT INTO EMP01
VALUES ('1000', '고길동', '사장님', SYSDATE, 100000);

INSERT INTO EMP01
VALUES ('1001', '도우너', '사원', SYSDATE, 50000);

INSERT INTO EMP01
VALUES ('1002', '둘리', '사원', SYSDATE, 40000);

-- (2) UPDATE : 테이블의 데이터를 수정
-- UPDATE 테이블명 [SET 컬럼명1 = 값1, 컬럼명2 = 값2, ....]
-- [WHERE 조건식]

--> WHERE 절 조건식을 생략하면 테이블의 모든 행이 수정 (주의!!!)

UPDATE EMP01
   SET SAL = 200000;
   
UPDATE EMP01
   SET SAL = 400000
 WHERE EMPNO = 1000;
 
UPDATE EMP01
   SET SAL = 300000, ENAME = '마이콜'
 WHERE EMPNO = 1001;
 
-- 문제1) 둘리 사원의 월급을 마이콜 사원의 월급과 같게 수정( 서브쿼리 이용)
UPDATE EMP01
   SET SAL = (SELECT SAL FROM EMP01 WHERE ENAME = '마이콜')
 WHERE EMPNO = 1002;

-- 문제2) 사번이 1002인 사원의 급여를 1001번 사원 월급의 2배로 수정
UPDATE EMP01
   SET SAL = (SELECT SAL FROM EMP01 WHERE EMPNO = 1001) * 2
 WHERE EMPNO = 1002;

-- 문제3) 사번이 1003인 사원: 또치 입사!! 오늘!! 월급 - 마이콜의 1.5배
INSERT INTO EMP01
VALUES( 1003, '또치', '사원', SYSDATE, (SELECT SAL FROM EMP01 WHERE EMPNO = 1001) * 1.5);

-- (3) DELETE : 데이터의 행을 삭제
-- DELETE FROM 테이블명 [WHERE 조건식]
DELETE FROM EMP01
 WHERE EMPNO = 1002;
 
DELETE FROM EMP01; --> WHERE 절이 없으면 전체 데이터들이 삭제됨 (틀은 남음)
ROLLBACK;

--DML문 연습문제
--1. EMP01 테이블을 제거한 후 다음과 같은 구조로 EMP01테이블을 생성
--    1) EMPNO NUMBER(4)
--    2) ENAME VARCHAR2(10)
--    3) JOB VARCHAR2(9)
--    4) MGR NUMBER(4)
--    5) HIREDATE DATE
--    6) SAL NUMBER(7, 2)
--    7) COMM NUMBER(7, 2)
--    8) DEPTNO NUMBER(2)
CREATE TABLE EMP01
      (EMPNO NUMBER(4), 
       ENAME VARCHAR2(10),
       JOB VARCHAR2(9),
       MGR NUMBER(4),
       HIREDATE DATE,
       SAL NUMBER(7, 2),
       COMM NUMBER(7, 2),
       DEPTNO NUMBER(2));
       
--2. EMP01 테이블에 다음과 같은 데이터를 추가하세요
--* 7369 smith cleak 7839 80/12/17 800 null 20
--* 7499 allen salesman 7369 87/12/20 1600 300 30
--* 7839 king president null null 5000 null null
INSERT INTO EMP01
VALUES (7369, 'smith', 'cleak', 7839, '80/12/17', 800, NULL, 20);

INSERT INTO EMP01
VALUES (7499, 'allen', 'salesman', 7369, '87/12/20', 1600, 300, 30);

INSERT INTO EMP01
VALUES (7839, 'king', 'president', null, null, 5000, null, null);

--3. EMP01 테이블의 모든 사원의 급여를 10% 인상하기
UPDATE EMP01
   SET SAL = SAL * 1.1;
   
--4. EMP01 테이블에서 KING의 입사 일을 오늘 날짜로 수정
UPDATE EMP01
   SET HIREDATE = SYSDATE
 WHERE ENAME = LOWER ('KING') AND EMPNO = 7839;
-- EMPNO가 기본키(PRIMANRY KEY)라면 EMPNO로 찾는 것이 더 좋다
 
--5. EMP01 테이블에서 1985년 이후에 입사한 모든 직원를 삭제
DELETE FROM EMP01
WHERE HIREDATE >= '85/01/01';

--6. EMP01 테이블에서 커미셔을 받지 못하는 모든 직원을 삭제
DELETE FROM EMP01
WHERE COMM IS NULL;
