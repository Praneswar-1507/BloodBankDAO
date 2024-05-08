create database BloodBank;
use BloodBank;
create table Bank(
donor_id  varchar(20) PRIMARY KEY ,
donor_name varchar(20),
blood_type varchar(20),
quantity int(10),
donatedBefore boolean
 
);
insert into Bank(donor_id,donor_name,blood_type,quantity,donatedBefore) values(1,"sachin","A+ve",1,true);
insert into Bank(donor_id,donor_name,blood_type,quantity,donatedBefore) values(2,"virat","Ab+ve",2,false);
insert into Bank(donor_id,donor_name,blood_type,quantity,donatedBefore) values(3,"kholi","A-ve",3,false);
insert into Bank(donor_id,donor_name,blood_type,quantity,donatedBefore) values(4,"gill","O-ve",4,true);
select * from Bank;
alter table Bank
drop column Noofday;
alter table Bank
drop column donatedBefore;