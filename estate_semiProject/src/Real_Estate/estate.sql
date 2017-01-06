drop table locCode purge;
drop table housing purge;
drop table company purge;

create table locCode(
lccode int primary key, -- 지역코드
loc varchar(50) not null  -- 지역명 (서울시/구만 존재)
);

insert into locCode values(11110,'종로구');
insert into locCode values(11140,'중구');
insert into locCode values(11170,'용산구' );  
insert into locCode values(11200,'성동구' );  
insert into locCode values(11215,'광진구' );  
insert into locCode values(11230,'동대문구');	   
insert into locCode values(11260,'중랑구' );  
insert into locCode values(11290,'성북구' );  
insert into locCode values(11305,'강북구' );  
insert into locCode values(11320,'도봉구' );  
insert into locCode values(11350,'노원구' );  
insert into locCode values(11380,'은평구' );  
insert into locCode values(11410,'서대문구');	   
insert into locCode values(11440,'마포구' );  
insert into locCode values(11470,'양천구' );  
insert into locCode values(11545,'금천구' );  
insert into locCode values(11500,'강서구' );  
insert into locCode values(11530,'구로구' );  
insert into locCode values(11560,'영등포구');	   
insert into locCode values(11590,'동작구' );  
insert into locCode values(11620,'관악구' );  
insert into locCode values(11650,'서초구' );  
insert into locCode values(11680,'강남구' );  
insert into locCode values(11710,'송파구' );  
insert into locCode values(11740,'강동구' );

create table company(
cpcode int primary key,     -- 업체코드
name varchar(100) not null,   -- 업체명
phone varchar(20) not null,   -- 업체전화번호
address varchar(100),         -- 업체 주소
cpimage varchar(100)          --업체 이미지경로
);


create table housing(
hscode int primary key,  --매물 코드
constyear int,           --건축년도
regdate date,	         --매물등록날짜
seldate date,             --매물판매 날짜 
bdname varchar(30),       --매물명
bdtype varchar(10),       --매물타입(아파트, 빌라, 단독, 오피스텔)
condition varchar(20),    --매물조건(월세,전세, 매매)
dong varchar(20) not null,  -- 매물이 위치한 동
gu varchar(10) not null,    -- 매물이 위치한 구
deposit int,                -- 보증금
monfee int,                 -- 월세
price int,                  -- 매매 가격
area int,                   -- 면적
floor int,                  -- 층
selyn varchar(2) not null,  -- 판매여부
image varchar(50),          -- 이미지경로
op varchar(100),            -- 옵션 서술형 (ex 방2개, 주차 가능, 역세권)
detail varchar(200),        -- 상세 설명
lccode int not null,        -- 지역코드
cpcode int not null,        -- 부동산 업체코드
foreign key(lccode) references locCode(lccode),
foreign key(cpcode) references company(cpcode)
);

drop sequence hscode_seq;
create sequence hscode_seq increment by 1 start with 1;   -- 매물코드 시퀀스 

insert into company values(1,'수호부동산중개(정연진)','02-555-2249','서울특별시 강남구 역삼동 696-11번지 지하 1층','b1.jpg');
insert into company values(2,'박사공인중개사(민병성)','070-8187-4155','서울특별시 강북구 수유2동 254-2번지','b2.jpg');
insert into company values(3,'대지공인중개사(최경목)','02-484-0111','서울특별시 강동구 성안로 159 101호 (천호동)','b3.gif');
insert into company values(4,'두산OK공인중개사(이영희)','02-477-2489','서울특별시 강동구 성안로 155 102호(천호동,강동역두산위브센티움)','b4.gif');
insert into company values(5,'sk공인중개사(심윤경)','010-6860-0089','서울특별시 강동구 천호대로 1092 에스케이허브진108호','b5.jpg');
insert into company values(6,'위브공인중개사(이학묵)','010-2674-1510','서울특별시 강동구 올림픽로70길 61 두산위브센티움 1층 105호','b6.jpg');
insert into company values(7,'노블공인중개사(서시은)','02-554-6411','서울특별시 강남구 논현로63길 16 서해더블루 상가 119호','b1.jpg');
insert into company values(8,'청담공인중개사(곽은숙)','02-567-8863','서울특별시 강남구 테헤란로4길 6 414호(역삼동, 센트럴푸르지오시티)','b2.jpg');
insert into company values(9,'매일부동산공인중개사(이현정)','02-992-2100','서울특별시 강북구 도봉로89길 10 1층','b3.gif');
insert into company values(10,'까치부동산공인중개사(이철용)','02-990-3500','서울특별시 강북구 오패산로78길 13, 101호 (번동)','b4.gif');
insert into company values(11,'수유탑공인중개사(이영이)','02-906-0088','서울특별시 강북구 수유동 172-176','b5.jpg');
insert into company values(12,'부자공인중개사(한기남)','010-5364-9545','서울특별시 도봉구 창동 581-12','b6.jpg');
insert into company values(13,'금성공인중개사(이길자)','02-2661-7900','서울특별시 강서구 마곡동 743-4 마곡엠벨리7단지 712-104호','b1.jpg');
insert into company values(14,'마곡신도시부동산공인중개사(김경기)','02-3663-0101','서울특별시 강서구 마곡동 794번지 문영 비즈웍스 104호','b2.jpg');
insert into company values(15,'마곡아르디에공인중개사(석지은)','02-2605-8900','서울특별시 강서구 마곡동 784-13,104호','b3.gif');
insert into company values(16,'스마트공인중개사(김일문)','010-5850-4988','서울특별시 강서구 강서로 161-10','b4.gif');
insert into company values(17,'미래공인중개사(오길호)','02-888-2520','서울특별시 관악구 봉천동 866-11 관악맥스텔 1층','b5.jpg');
insert into company values(18,'열린공인중개사(유희순)','010-6624-1188','서울특별시 관악구 봉천동 1611-23 1층','b6.jpg');
insert into company values(19,'미소공인중개사(김승용)','02-874-4949','서울특별시 관악구 관악로15길 23-10 (봉천동)','b3.gif');
insert into company values(20,'한솔부동산공인중개사(김민재)','02-872-4777','서울특별시 관악구 봉천동 1665-2 1충','b4.gif');

insert into housing values(hscode_seq.nextval,'',sysdate,sysdate,'','다세대건물','매매','강일동','강동구',0,0,340000000,102,4,'n','GA-1.png','가스레인지, 신발장, 싱크대','☆☆매물주요설명 ☆☆ 신축건물-첫입주 빠른입주가능-전세자금대출가능 ',11740,3);
insert into housing values(hscode_seq.nextval,'',sysdate,sysdate,'','오피스텔','월세','고덕동','강동구',3000000,4000000,0,17,2,'n','GA-2.png','에어컨, 냉장고, 세탁기, 인덕션, 책상, 책장, 옷장, 신발장, 싱크대','신축1년된 깔끔한 오피스텔입니다.',11740,4);
insert into housing values(hscode_seq.nextval,'',sysdate,sysdate,'','다세대건물','월세','길동','강동구',70000000,500000,0,46,2,'n','GA-3.png','가스레인지, 신발장, 싱크대','강동역,강동구청역 역세권으로 교통이 편리하고~ 지은지 얼마 안된 신축급으로 깔끔 합니다 ',11740,4);
insert into housing values(hscode_seq.nextval,'',sysdate,sysdate,'푸르지오','원룸','월세','둔촌동','강동구',5000000,600000,0,26,15,'n','Gn-Da.jpg','에어컨, 냉장고, 세탁기, 인덕션, 옷장, 신발장, 싱크대','♥ 편리하고 안전한 100% 자주식주차, 태양광 발전시스템 등 에너지 절감 시스템 적용',11740,5);
insert into housing values(hscode_seq.nextval,'',sysdate,sysdate,'','원룸','월세','명일동','강동구',60000000,0,0,16,2,'n','Gn-Do.jpg','에어컨, 냉장고, 세탁기, 인덕션, 침대, 옷장, 신발장, 싱크대','#명일역1분 거리 이며 버스등 대중교통 최적지 #주변에 이마트 홈플러스 GS마트가 있어 생활편리합니다',11740,5);
-- 하니 꺼
insert into housing values(hscode_seq.nextval,'',sysdate,sysdate,'','단독','월세','남현동','관악구',60000000,430000,0,26.45,8,'n','Gn-Ja.jpg','방1개,주차가능,역세권','상세설명~~~',11620,20);
insert into housing values(hscode_seq.nextval,2015,sysdate,sysdate,'대치클래시아','오피스텔','월세','봉천동','관악구',10000000,1000000,0,39.67,12,'n','Gn-no.jpg','방1개,주차가능,역세권','상세설명~~~',11620,19);

insert into housing values(hscode_seq.nextval,'',sysdate,sysdate,'','빌라','월세','신림동','관악구',900000,2900000,0,16.53,2,'n','Gn-yo.jpg','방1개,주차불가능,역세권','상세설명~~~',11620,18);
insert into housing values(hscode_seq.nextval,2016,sysdate,sysdate,'마곡아이파크','오피스텔','월세','가양동','강서구',5000000,500000,0,49.59,8,'n','GS-6.png','방1개,주차가능,역세권','상세설명~~~',11500,13);
insert into housing values(hscode_seq.nextval,2004,sysdate,sysdate,'','빌라','월세','개화동','강서구',20000000,600000,0,50,2,'n','GS-7.png','방2개,주차가능,역세권','상세설명~~~',11500,14);
insert into housing values(hscode_seq.nextval,2003,sysdate,sysdate,'','단독','월세','공항동','강서구',10000000,250000,0,22,15,'n','GS-8.png','방1개,주차불가능','상세설명~~~',11500,15);
insert into housing values(hscode_seq.nextval,1999,sysdate,sysdate,'','단독','전세','과해동','강서구',60000000,0,0,52,1,'n','GS-9.png','방1개,주차가능','상세설명~~~',11500,13);
insert into housing values(hscode_seq.nextval,2003,sysdate,sysdate,'','단독','월세','내발산동','강서구',10000000,250000,0,49.86,15,'n','GS-10.png','방1개,주차불가능','상세설명~~~',11500,14);
insert into housing values(hscode_seq.nextval,2002,sysdate,sysdate,'','빌라','매매','등촌동','강서구',0,0,265000000,65.52,3,'n','GS-11.png','방3개,화장실2개,주차가능','상세설명~~~',11500,15);
insert into housing values(hscode_seq.nextval,2016,sysdate,sysdate,'','빌라','매매','마곡동','강서구',0,0,235000000,36.37,6,'n','GS-2.png','방2개,화장실1개,주차가능','상세설명~~~',11500,16);
insert into housing values(hscode_seq.nextval,2003,sysdate,sysdate,'정우','오피스텔','전세','방화동','강서구',80000000,0,0,25.21,4,'n','GA-2.png','방1개,주차가능','상세설명~~~',11500,13);
insert into housing values(hscode_seq.nextval,2003,sysdate,sysdate,'시원트레빌','아파트','월세','염창동','강서구',180000000,500000,0,88.45,2,'n','GA-2.png','방2개,화장실1개,주차가능','상세설명~~~',11500,15);
insert into housing values(hscode_seq.nextval,2009,sysdate,sysdate,'크라운뷰','아파트','월세','화곡동','강서구',10000000,850000,0,44.75,14,'n','GA-2.png','방1개,화장실1개,주차가능','상세설명~~~',11500,14);
--아름씨
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'대청','아파트','월세','개포동','강남구',0,0,650000000,56,15,'n','이미지경로','방3개,역세권','대청역 인접, 학교 인접', 11680,7);
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'미소빌','오피스텔','월세','논현동','강남구',1250000, 1250000,0,59,4,'n','이미지경로','방2개, 역세권','신논현역 도보 이용, 편의시설', 11680,1);
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'대우아이빌명문가7차','오피스텔','매매','대치동','강남구',0,0,220000000,33,6,'n','이미지경로','방1개, 주차가능, 역세권','선릉역 도보 5분 거리, 주차 1대 무료', 11680,8);
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'현대비전21','오피스텔','월세','도곡동','강남구',20000000, 800000,0,36,10,'n','이미지경로','방1개, 남향 발코니','개별 난방, 주차 1대 무료', 11680,7);
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'소버린스테이트','오피스텔','월세','삼성동','강남구',50000000,2500000,0,52,9,'n','이미지경로','방1개, 자주식 주차, 풀옵션, 역세권','청담역 도보 2분 거리', 11680,1);
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'세곡리엔파크1단지','아파트','매매','세곡동','강남구',0,0,580000000,75,13,'n','이미지경로','방3개, 자연친화적','대모산, 세곡천 인접 ', 11680,8);
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'신동아','아파트','전세','수서동','강남구', 530000000,0,0,75,5,'n','이미지경로','방3개, 역세권','일원역 도보 3분 거리', 11680,7) ;
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'가람','아파트','전세','신사동','강남구', 10000000, 1000000,0,33,16,'n','이미지경로','방1개, 주차 가능','주차비 저렴', 11680,1);
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'대림역삼','아파트','매매','역삼동','강남구',0,0,650000000,78,18,'n','이미지경로','방3개, 역세권, 학교 인접','한티역 도보 10분 거리', 11680,1);
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'강남지웰홈스','오피스텔','월세','자곡동','강남구',10000000, 700000,0,30,10,'n','이미지경로','방1개, 원룸 분리형, 역세권','수서역 도보 3분 거리, 휘트니스 센터', 11680,1);
insert into housing values(hscode_seq.nextval,2010,sysdate,sysdate,'경원','오피스텔','월세','청담동','강남구', 1900000, 1900000,0,75,18,'n','이미지경로','방1개, 원룸 분리형, 역세권','편의시설 다양', 11680,1) ;

update housing set image='GA-2.png' where hscode = 21;
update housing set image='GA-1.png' where hscode = 22;
update housing set image='GA-3.png' where hscode = 23;
update housing set image='Gn-Da.jpg' where hscode = 24;
update housing set image='Gn-Ja.jpg' where hscode = 25;
update housing set image='GA-1.png' where hscode = 26;
update housing set image='GA-2.png' where hscode = 27;
update housing set image='GA-3.png' where hscode = 28;
update housing set image='Gn-Da.jpg' where hscode = 29;
update housing set image='Gn-Ja.jpg' where hscode = 30;


select * from housing;
work commit;



