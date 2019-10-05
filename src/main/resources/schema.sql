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
);

CREATE TABLE HOSPITAL
(
    HOSPITALNAME    VARCHAR2(20)    NULL, 
    DAYTIME         VARCHAR2(20)    NULL, 
    SATTIME         VARCHAR2(20)    NULL, 
    HOLYTIME        VARCHAR2(20)    NULL, 
    TELEPHONE       VARCHAR2(20)    NULL   
);