create table Goodsinfo(
code char(5) primary key,
name varchar(30) not null,
price int not null,
maker varchar(20) not null
);

create sequence cd_seq increment by 1 start with 10000
insert into Goodsinfo values(cd_seq.nextval,'AAAAA',800000,'SM');
insert into Goodsinfo values(cd_seq.nextval,'BBBBB',900000,'LG');
insert into Goodsinfo values(cd_seq.nextval,'CCCCC',700000,'AP');

commit work;