 -- 조인
-- 사번이 100번인 사원 정보 (사번, 이름, 부서번호)와 그가 소속된 부서의 부서명?까지 출력

SELECT EMPLOYEE_ID,
       FIRST_NAME, 
       EMPLOYEES.DEPARTMENT_ID, 
       DEPARTMENTS.DEPARTMENT_NAME
  FROM EMPLOYEES, DEPARTMENTS; -- => CARTESIAN PRODUCT
 
SELECT EMPLOYEE_ID,
       FIRST_NAME, 
       EMPLOYEES.DEPARTMENT_ID, 
       DEPARTMENTS.DEPARTMENT_NAME
  FROM EMPLOYEES, DEPARTMENTS
 WHERE EMPLOYEES.DEPARTMENT_ID = DEPARTMENTS.DEPARTMENT_ID;
 
SELECT E.EMPLOYEE_ID,
       E.FIRST_NAME, 
       E.DEPARTMENT_ID, 
       D.DEPARTMENT_NAME
  FROM EMPLOYEES E, DEPARTMENTS D
 WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID;
 
-- CEO가 모든 직원에게 선물을 택배로 보내려 한다.
-- 모든 직원들이 택배를 무사히 받을 수 있도로그 사무실의 주소, 사원 정보를 출력
SELECT E.FIRST_NAME || ' ' || E.LAST_NAME,
       E.PHONE_NUMBER,
       L.STREET_ADDRESS,
       L.POSTAL_CODE,
       L.CITY,
       L.STATE_PROVINCE,
       C.COUNTRY_NAME,
       R.REGION_NAME
  FROM EMPLOYEES E,
       DEPARTMENTS D, 
       LOCATIONS L, 
       COUNTRIES C, 
       REGIONS R
 WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID 
   AND D.LOCATION_ID = D.LOCATION_ID 
   AND C.COUNTRY_ID = L.COUNTRY_ID 
   AND R.REGION_ID = C.REGION_ID;
   
-- SCOTT --
--1. 전체 사원 중 ALLEN과 같은 직책(JOB)인 사원들의 
--   직무, 사원 번호, 사원이름, 월급. 부서번호 부서이름을 출력
SELECT E.JOB,
       E.EMPNO,
       E.ENAME,
       E.SAL,
       D.DEPTNO,
       D.DNAME
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
   AND E.JOB = (SELECT JOB FROM EMP WHERE ENAME = UPPER('ALLEN')); 
 
--2. 전체 사원의 평균 급여보다 높은 급여를 받는 사원들의 
--   사원 정보, 부서정보, 급여 등급 정보(SALGRADE)를 출력
--   단, 출력할 때 급여가 많은 순으로 정렬하되 급여가 같은 경우 
--   사원 번호를 기준으로 오름차순 정렬
SELECT E.EMPNO,
       E.ENAME,
       E.DEPTNO,
       D.DNAME,
       E.SAL,
       S.GRADE
--       CASE WHEN E.SAL BETWEEN 700 AND 1200
--            THEN 1
--            WHEN E.SAL BETWEEN 1201  AND 1400
--            THEN 2
--            WHEN E.SAL BETWEEN 1401 AND 2000
--            THEN 3
--            WHEN E.SAL BETWEEN 2001 AND 3000
--            THEN 4
--            WHEN E.SAL BETWEEN 3001 AND 9999
--            THEN 5
--        END AS SALGRADE
  FROM EMP E, DEPT D, SALGRADE S
 WHERE E.DEPTNO = D.DEPTNO 
   AND E.SAL > (SELECT AVG(SAL) FROM EMP)
   AND E.SAL BETWEEN S.LOSAL AND S.HISAL
 ORDER BY E.SAL DESC, E.EMPNO;
   
--3. 10번 부서에서 근무하는 사원 중 
--   30번 부서에는 존재하지 않는 직무를 가진 사원들의 
--   사원번호 이름 직무 부서 번호 부서이름 loc를 출력
SELECT E.EMPNO,
       E.ENAME,
       E.JOB,
       E.DEPTNO,
       D.DNAME,
       D.LOC
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
   AND E.DEPTNO = 10
--   AND JOB NOT IN (SELECT JOB FROM EMP WHERE DEPTNO = 30);
   AND JOB NOT IN (SELECT DISTINCT JOB FROM EMP WHERE DEPTNO = 30);

   
--4. 직무가 SALESMAN인 사람들의 최고 급여보다 높은 급여를 받는 사원들의 
--   사원번호, 이름, 월급, GRADE(SALGRADE)를 출력
SELECT E.EMPNO,
       E.ENAME,
       E.SAL,
       S.GRADE
--       CASE WHEN E.SAL > 700 AND SAL <= 1200
--            THEN 1
--            WHEN SAL >= 1201  AND SAL <= 1400
--            THEN 2
--            WHEN SAL >= 1401 AND SAL <= 2000
--            THEN 3
--            WHEN SAL >= 2001 AND SAL <= 3000
--            THEN 4
--            WHEN SAL >= 3001 AND SAL < 9999
--            THEN 5
--        END AS GRADE
  FROM EMP E, SALGRADE S
 WHERE E.SAL > ALL (SELECT SAL FROM EMP WHERE JOB = UPPER('SALESMAN'))
   AND E.SAL BETWEEN S.LOSAL AND S.HISAL;

-- ==========================================================
-- -- 조인 (JOIN)
-- ==========================================================
-- 1) 크로스 조인 (CROSS JOIN) : 의미 없는 단순 조인 -> 단순하게 두개 이상의 테이블을 곱연산
SELECT E.EMPLOYEE_ID, E.FIRST_NAME, D.DEPARTMENT_ID, D.DEPARTMENT_NAME
  FROM EMPLOYEES E, DEPARTMENTS D;
--  
-- 2) 동등 조인 (EQUI-JOIN) : 가장 많이 사용됨 
---> 조인대상이 되는 테이블에서 공통적으로 존재하는 컬럼을 연결( "="로 연결)하여 결과를 조인
--  WHERE절에 조인 조건 서술 => 조인 조건 수 = 테이블 갯수 - 1
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
  FROM EMPLOYEES E, DEPARTMENTS D
 WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID;

-- 3) 비동등 조인 (NON-EUQI JOIN) : 조인할 테이블 사이의 컬럼값이 직접적으로 일치하지 않을 떄 사용하는 조인
-- "=" 연산자를 제외한 연산자를 사용
-- SCOTT계정에서 SALGRADE에 해당
-- 사원 호봉이 얼마인지, 사번, 이름, 급여, 호봉(GRADE)를 출력
SELECT E.EMPNO, E.ENAME, E.SAL, S.GRADE
  FROM EMP E, SALGRADE S
 WHERE E.SAL BETWEEN S.LOSAL AND S.HISAL;
-- HR 계정 (EMPLOYEES, JOBS TABLE)
SELECT *
  FROM EMPLOYEES E, JOBS J
 WHERE E.SALARY BETWEEN J.MIN_SALARY AND J.MAX_SALARY;

-- 4) OUTER JOIN (+)
-- 행이 조인 조건에 만족하지 않을 경우 그 행은 JOIN 결과에 나타나지 않는다.
-- => 누락된 내용을 포함하기 위해 사용 
-- (하나의 테이블에만 적용 가능 => ORA-01468: a predicate may reference only one outer-joined table)
-- 그러나 가끔 조인 조건에 만족하지 않는 행들도 나타내기 위해  OUTER JOIN을 사용할 때가 있음
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
  FROM EMPLOYEES E, DEPARTMENTS D
 WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID(+) ; -- 부서가 NULL인 사원의 정보까지 출력
 
-- 아무 매니저도 배치되지 않은 부서를 보고 싶을 때
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
  FROM EMPLOYEES E, DEPARTMENTS D
 WHERE E.DEPARTMENT_ID(+) = D.DEPARTMENT_ID;
 
-- 5) SELF JOIN
-- 하나의 테이블 내에서 종니하여 원하는 데이터를 얻는 조인
-- FROM 절에 동일한 테이블 이름을 주고 조인 조건을 주어야 하는데
-- 이때 서로 다른 테이블인것 처럼하기 위해 반드시 테이블 별칭을 준다.

SELECT WORKER.FIRST_NAME ||'의 직속 상사는 ' || MANAGER.FIRST_NAME, MANAGER.MANAGER_ID
  FROM EMPLOYEES WORKER, EMPLOYEES MANAGER
 WHERE WORKER.MANAGER_ID = MANAGER.EMPLOYEE_ID;

-- 사원의 사번, 사원의 이름의 직속상사는 매니저이름 입니다, 사원의 사원 번호로 정렬
SELECT WORKER.EMPLOYEE_ID, WORKER.FIRST_NAME ||' 사원의 직속 상사는 ' || MANAGER.FIRST_NAME || '입니다'
  FROM EMPLOYEES WORKER, EMPLOYEES MANAGER
 WHERE WORKER.MANAGER_ID = MANAGER.EMPLOYEE_ID
 ORDER BY WORKER.EMPLOYEE_ID;
 
---------------------------------------------------------------------------
-- ANSI JOIN 
-- => (ANSI/미국 표준 연구소) 에서 제정한 다른 DBMS와의 호환성을 위해 만든 것
---------------------------------------------------------------------------
-- 1) ANSI CROSS JOIN
SELECT COUNT(*)
  FROM EMPLOYEES
 CROSS JOIN DEPARTMENTS;
 
-- 2) ANSI INNER JOIN => EQUI JOIN 과 동일
-- JOIN의 조건을 WHERE 절이 아니라 !!! ON !!!!절에 기술!!
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
  FROM EMPLOYEES E 
       INNER JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID;

-- 일반 조건은 WHERE절에 기술 (EX/ 이름이 N으로 끝나는 사원의 정보 출력
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
  FROM EMPLOYEES E INNER JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
 WHERE E.FIRST_NAME LIKE '%n';

-- USING 절을 이용해서 JOIN 조건을 지정
-- -> JOIN이 되는 컬럼명이 동일해야 하고, USING 절에는 테이블 별칭을 사용하지 못함
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
  FROM EMPLOYEES E INNER JOIN DEPARTMENTS D
 USING (DEPARTMENT_ID);
 
-- SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
--   FROM EMPLOYEES E INNER JOIN DEPARTMENTS D
--  USING (D.DEPARTMENT_ID); 

-- 별칭(D) 작성 시 ERROR : ORA-01748: only simple column names allowed here
 
-- NATURAL JOIN
-- JOIN이 되는 컬럼명은 반드시 동일해야 한다.
-- DBMS가 알아서 테이블을 살펴보고 동일 컬럼으로 INNER JOIN진행
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
  FROM EMPLOYEES E NATURAL JOIN DEPARTMENTS D;
-- 동일한 컬럼명이 2개이상 나오면 AND 조건으로 INNER JOIN 진행

SELECT D.DEPARTMENT_NAME, L.CITY
  FROM DEPARTMENTS D NATURAL JOIN LOCATIONS L;
  
-- 3) ANSI OUTTER JOIN
-- LEFT OUTER JOIN | RIGHT OUTER JOIN | FULL OUTER JOIN
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
  FROM EMPLOYEES E LEFT OUTER JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID; -- > 왼쪽 테이블에서 누락된 정보를 확인
    
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
  FROM EMPLOYEES E RIGHT OUTER JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID; -- > 오른쪽 테이블에서 누락된 정보를 확인
    
SELECT E.FIRST_NAME, D.DEPARTMENT_NAME
  FROM EMPLOYEES E FULL OUTER JOIN DEPARTMENTS D
    ON E.DEPARTMENT_ID = D.DEPARTMENT_ID; -- > 양쪽 테이블에서 누락된 정보를 확인