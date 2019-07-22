drop table "SCOTT"."STRUTS06";
  CREATE TABLE "SCOTT"."STRUTS06" 
   (	"NUM" NUMBER, 
	"NAME" VARCHAR2(20 BYTE), 
	"SUB" VARCHAR2(20 BYTE), 
	"CONTENT" VARCHAR2(2000 BYTE), 
	"NALJA" DATE,
	CONSTRAINT STRUTS06_PK PRIMARY KEY
	(NUM)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "SYSTEM" ;
  CREATE SEQUENCE struts06_SEQ;
  --dummy
  insert into "SCOTT"."STRUTS06" values (struts06_seq.nextval,'tester1','test1','content',sysdate);
  insert into "SCOTT"."STRUTS06" values (struts06_seq.nextval,'tester2','test2','content',sysdate);
  insert into "SCOTT"."STRUTS06" values (struts06_seq.nextval,'tester3','test3','content',sysdate);
  insert into "SCOTT"."STRUTS06" values (struts06_seq.nextval,'tester4','test4','content',sysdate);
 
