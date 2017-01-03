drop table student purge;

create table Student(
snum int primary key,
name varchar(20) not null,
major varchar(50) not null,
score int not null
);

commit work;
