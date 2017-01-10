create table goods(
code int primary key,
name varchar(50) not null,
image varchar(25) not null
);

insert into GOODS values(1, '사과', 'apple.jpg');
insert into GOODS values(2, '바나나', 'banana.jpg');
insert into GOODS values(3, '체리', 'cherry.jpg');
insert into GOODS values(4, '감', 'persimmon.jpg');

select * from goods;
commit work;


