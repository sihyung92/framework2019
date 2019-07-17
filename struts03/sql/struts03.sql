create table struts03(
   num number primary key,
   sub varchar2(50),
   content varchar2(1024)
);
create sequence struts03_seq;

insert into struts03 values(struts03_seq.nextVal,'test1','test01');
insert into struts03 values(struts03_seq.nextVal,'test2','test02');
insert into struts03 values(struts03_seq.nextVal,'test3','test03');
insert into struts03 values(struts03_seq.nextVal,'test4','test04');
insert into struts03 values(struts03_seq.nextVal,'test5','test05');
insert into struts03 values(struts03_seq.nextVal,'test6','test06');
insert into struts03 values(struts03_seq.nextVal,'test7','test07');
insert into struts03 values(struts03_seq.nextVal,'test8','test08');
insert into struts03 values(struts03_seq.nextVal,'test9','test09');
insert into struts03 values(struts03_seq.nextVal,'test10','test10');
insert into struts03 values(struts03_seq.nextVal,'test11','test11');

commit

select num, sub from struts03 order by num desc;
--select num, sub, content from struts03 where num=?;
--insert into struts03 values (struts03_seq.nextVal,?,?);