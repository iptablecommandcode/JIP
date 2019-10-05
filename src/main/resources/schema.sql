create table student
(
   id integer not null,
   name varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id)
);

-- 그룹/조직/부서 구조도
CREATE TABLE CIP_ORGANIZATION
(
	-- 조직 일련번호
	ORGANIZATION_SEQ varchar(50) NOT NULL COMMENT '조직 일련번호',
	-- 명칭
	NAME varchar(1000) NOT NULL COMMENT '명칭',
	-- 대표 전화번호
	TELEPHONE varchar(40) COMMENT '대표 전화번호',
	-- 정렬순서
	ORDER_NUMBER decimal COMMENT '정렬순서',
	-- 상위 조직 일련번호
	PARENT_ORGANIZATION_SEQ varchar(50) COMMENT '상위 조직 일련번호',
	CONSTRAINT PK_ORGANIZATION PRIMARY KEY (ORGANIZATION_SEQ)
) COMMENT = '그룹/조직/부서 구조도';

CREATE TABLE ACCOUNT
(
    ID            VARCHAR2(20)    NOT NULL, 
    PWD           VARCHAR2(20)    NOT NULL, 
    EMAIL         VARCHAR2(20)    NULL, 
    TEL1          INT            NULL, 
    TEL2          INT            NULL, 
    TEL3          INT            NULL, 
    NAME          VARCHAR2(20)    NOT NULL, 
    ADDRESS       VARCHAR2(20)    NULL, 
    PETKINDS      VARCHAR2(20)    NULL, 
    PETAGE        INT             NULL, 
    NICKNAME      VARCHAR2(20)    NULL, 
    RANK          VARCHAR2(20)    NULL, 
    MILEAGE       INT             NULL, 
    DAYYEAR       INT             NULL, 
    DAYMONTH      INT             NULL, 
    DAYDAY        INT             NULL, 
    DAYCOMMENT    VARCHAR2(20)    NULL, 
    CONSTRAINT ACCOUNT_PK PRIMARY KEY (ID)
)