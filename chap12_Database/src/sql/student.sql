-- student.sql

drop table student purge;
-- 학생 테이블 생성
create table student(
num int primary key,
name varchar(20) not null,
score int not null,
phone varchar(25),
email varchar(50),
regdate date
);
-- 시퀀스 생성
create sequence st_seq increment by 1 start with 2017000;

-- 레코드 추가
insert into student values(st_seq.nextval,'홍길동',89,'010-111-1111','hong@naver.com',sysdate);
insert into student values(st_seq.nextval,'이순신',89,'010-222-2222','lee@naver.com',sysdate);
insert into student values(st_seq.nextval,'유관순',89,'010-333-3333','yoo@naver.com',sysdate);
-- 레코드 조회
select * from student;

---DB 반영
commit work;

"delete from student where num = ?"
