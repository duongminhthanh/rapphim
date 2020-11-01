drop database if exists cgv;
create database cgv;
use cgv;
/*table*/
create table theater(
id int,
location varchar(255) not null,
name varchar(255) not null,
primary key (id)
);
create table film(
film_id int,
film_name varchar(255) not null,
film_duration int,
film_sub boolean,
film_type varchar(255),
film_age_limit int,
film_status varchar(255),
primary key(film_id)
);
create table ticket(
id int,
amount int,
type varchar(255),
status varchar(255),
foodanddrink boolean,
voucher varchar(255),
numberroom int,
seat varchar(255),
primary key(id)
);
create table membershipcard(
id int,
catagorize varchar(255),
name_customer varchar(255),
phonenumber int,
point int,
bonuspoint varchar(255),
primary key(id)
);
create table customer(
fullname varchar(255),
phonenumber int,
card boolean,
primary key(fullname)
);
create table staff(
id int,
fullname varchar(255),
lastname varchar(255),
birthday varchar(255),
contractdate varchar(255),
phonenumber int,
address varchar(255),
role varchar(255),
primary key(id),
foreign key(id) references theater(id)
);
create table phongchieu(
id int,
tenphong varchar(255),
ghethuong int,
ghevip int,
ghedoi int,
rap int,
primary key(id),
foreign key(rap) references theater(id)
);

create table xuatchieu(
id int,
phongid int,
phimid int,
giobatdau varchar(255),
gioketthuc varchar(255),
ngaybatdau varchar(255),
ngayketthuc varchar(255),
primary key(id),
foreign key(phongid) references phongchieu(id),
foreign key(phimid) references film(film_id)
);
/*values*/
insert into theater values(1,"561A Dien Bien Phu","CGV Pearl Plaza");
insert into theater values(2,"79/81 Nguyen Xi","CGV Nguyen Xi");
insert into theater values(3,"216 Vo Van Ngan ","CGV Vincom Thu Duc");
insert into theater values(4,"772 Dien Bien Phu","CGV Landmark Center");
insert into theater values(5,"356 Pham Van Dong","CGV Gigamall Thu Duc");
insert into theater values(6,"12 Quoc Huong","CGV Pearl Thao Dien");

insert into film values(1,'avengers end game',3 ,true,'sci fi',12,'available');
insert into film values(2,'mission impossible 6',2,true,'action',16,'available');
insert into film values(3,'fifty shade of grey',2,true,'aldult',18,'available');
insert into film values(4,'naruto the last',2,true,'sci fi',12,'available');
insert into film values(5,'shazam',2,true,'sci fi',12,'available');
insert into film values(6,'train to bussain',3,true,'thriler',16,'available');

insert into customer values('duong minh thanh',0357018090,true);
insert into customer values('do cong chi',0123456789,true);
insert into customer values('nguyen thanh tung',0135467832,true);
insert into customer values('nguyen thanh ha',01354883548,true);
insert into customer values('pham phuoc thinh',0456512334,true);
insert into customer values('duong tran son long',0453153445,true);

insert into ticket values(001,2,'2d','available',true,'twenty percent',10,'z');
insert into ticket values(002,5,'3d','available',true,'ten percent',1,'a');
insert into ticket values(003,1,'2d','available',true,'thirdthteen percent',5,'c');
insert into ticket values(004,2,'mimax','available',true,'twenty percent',7,'b');
insert into ticket values(005,2,'2d','available',true,'two percent',3,'f');
insert into ticket values(006,2,'3d','available',true,'twenty percent',2,'e');

insert into membershipcard values(01,'vip','do cong chi',0123456789,150,'twenty');
insert into membershipcard values(02,'vip','duong tran son long',0453153445,150,'twenty');
insert into membershipcard values(05,'vip','pham phuoc thinh',0456512334,200,'twenty');
insert into membershipcard values(04,'vip','nguyen thanh ha',01354883548,200,'twenty');
insert into membershipcard values(03,'vip','nguyen thanh tung',0135467832,250,'twenty');
insert into membershipcard values(06,'vip','duong minh thanh',0357018090,500,'fifty');

insert into staff values (1,'tran','van a','25/12/1999','20/4/2019',0542115462,'456 xo viet nghe tinh','quan ly');
insert into staff values (2,'pham','van loc','11/2/1995','20/4/2019',0156132435,'355 pham van dong','nhan vien');
insert into staff values (3,'nguyen','thi nga','11/2/1991','20/4/2015',0542115462,'123 donh bo linh','giam doc');
insert into staff values (4,'tran','kieu linh','11/2/1995','20/4/2015',0545464212,'456 vo van ngan','nhan vien');
insert into staff values (5,'do','tuan khang','11/2/1999','20/4/2019',0542115462,'456 dien bien phu','bao ve');
insert into staff values (6,'tran','thi vy','11/2/2000','20/4/2019',0464564268,'456 kha van can','bao ve');

insert into phongchieu values(1,'phong 1',40,10,4,1);
insert into phongchieu values(2,'phong 7',40,12,4,2);
insert into phongchieu values(3,'phong 10',40,10,4,3);
insert into phongchieu values(4,'phong 2',40,15,4,4);
insert into phongchieu values(5,'phong 5',40,17,4,5);
insert into phongchieu values(6,'phong 3',40,11,4,6);

insert into xuatchieu values(1,1,1,'8','10','20/6','27/6');
insert into xuatchieu values(2,2,2,'10','12','1/6','8/6');
insert into xuatchieu values(3,3,3,'13','15','2/6','9/6');
insert into xuatchieu values(4,4,4,'15','17','3/7','1/7');
insert into xuatchieu values(5,5,5,'17','19','5/5','25/5');
insert into xuatchieu values(6,6,6,'21','23','6/6','26/6');
select * from theater order by name asc;
select * from theater order by location asc;
select * from film order by film_age_limit asc;
select * from film order by film_duration asc;
select * from film order by film_name asc;
select * from ticket order by numberroom asc;
select * from ticket order by seat asc;
select * from ticket order by type desc;
select * from customer order by fullname asc;
select * from customer order by fullname desc;