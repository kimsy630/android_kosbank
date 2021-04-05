package com.material.components.kosbank;

/**
 * Created by psn on 2018-01-23.
 */

public class Web {

    // 0. cafe : android : 카페 소스 다운

    // 1. 이클립스 톰캣 실행 : Ex14 프로젝트
    // 2. servlet-context.xml
    //    <beans:property name="jndiName" value="java:comp/env/jdbc/mybatis_76" 로 수정
    //    context.xml  id: mybatis_76   /   password : tiger


    // 3. 크롬 실행 : http://localhost:8081/android/
    // ipconfig 확인 .. 연결이 끊김 으로 되어있으면 연결불가
    public static String ip = "192.168.219.131"; //본인 IP
    public static String servletURL = "http://" + ip + "/android_kosbank/"; //연결할 JSP URL

    // 5. AVD 실행

    /*
    6 . 테이블 생성(android_member_tbl)

    android65/tiger

    CREATE TABLE android_member_tbl
(
    member_id          VARCHAR2(30)     NOT NULL,
    member_pwd         VARCHAR2(30)     NOT NULL,
    member_name        VARCHAR2(20)     NOT NULL,
    member_tel         VARCHAR2(13)     NULL,
    member_email       VARCHAR2(50)     NOT NULL,
    member_birth       VARCHAR2(30)     NOT NULL,
    member_sex         VARCHAR2(10)     NOT NULL,
    member_address     VARCHAR2(100)    NULL,
    member_point       NUMBER           NULL,
    member_step        NUMBER           NOT NULL,
    member_cumPoint    NUMBER           NULL,
    member_reg_date    TIMESTAMP        NOT NULL,
    member_img         VARCHAR(100)     NULL,
    CONSTRAINT MEMBER_TBL_PK PRIMARY KEY (member_id)
)

Insert into ANDROID_MEMBER_TBL (MEMBER_ID,MEMBER_PWD,MEMBER_NAME,MEMBER_TEL,MEMBER_EMAIL,MEMBER_BIRTH,MEMBER_SEX,MEMBER_ADDRESS,MEMBER_POINT,MEMBER_STEP,MEMBER_CUMPOINT,MEMBER_REG_DATE,MEMBER_IMG) values ('gockd','123','문재인','010-1010-1010','gjrjrem123@naver.com','19940101','남','서울 금천구 가산디지털2로 123(가산동,월드메르디앙2차) 410',0,9,0,to_timestamp('18/01/24 16:16:29.617000000','RR/MM/DD HH24:MI:SSXFF'),null);
Insert into ANDROID_MEMBER_TBL (MEMBER_ID,MEMBER_PWD,MEMBER_NAME,MEMBER_TEL,MEMBER_EMAIL,MEMBER_BIRTH,MEMBER_SEX,MEMBER_ADDRESS,MEMBER_POINT,MEMBER_STEP,MEMBER_CUMPOINT,MEMBER_REG_DATE,MEMBER_IMG) values ('kis','123','김일성','010-0625-0625','kis@korea.love','19450625','남','경기 파주시 탄현면 필승로 369(성동리,오두산통일전망대)',0,9,0,to_timestamp('18/01/24 16:19:50.644000000','RR/MM/DD HH24:MI:SSXFF'),null);
Insert into ANDROID_MEMBER_TBL (MEMBER_ID,MEMBER_PWD,MEMBER_NAME,MEMBER_TEL,MEMBER_EMAIL,MEMBER_BIRTH,MEMBER_SEX,MEMBER_ADDRESS,MEMBER_POINT,MEMBER_STEP,MEMBER_CUMPOINT,MEMBER_REG_DATE,MEMBER_IMG) values ('kji','123','김정일','010-0625-0625','kji@korea.love','19560625','남','강원 고성군 현내면 통일전망대로 26(제진리)',0,9,0,to_timestamp('18/01/24 16:21:03.710000000','RR/MM/DD HH24:MI:SSXFF'),null);
Insert into ANDROID_MEMBER_TBL (MEMBER_ID,MEMBER_PWD,MEMBER_NAME,MEMBER_TEL,MEMBER_EMAIL,MEMBER_BIRTH,MEMBER_SEX,MEMBER_ADDRESS,MEMBER_POINT,MEMBER_STEP,MEMBER_CUMPOINT,MEMBER_REG_DATE,MEMBER_IMG) values ('kje','123','김정은','010-0625-0625','kje@korea.love','19810625','남','강원 고성군 현내면 통일전망대로 223-1(송현리)',0,9,0,to_timestamp('18/01/24 16:21:51.873000000','RR/MM/DD HH24:MI:SSXFF'),null);
Insert into ANDROID_MEMBER_TBL (MEMBER_ID,MEMBER_PWD,MEMBER_NAME,MEMBER_TEL,MEMBER_EMAIL,MEMBER_BIRTH,MEMBER_SEX,MEMBER_ADDRESS,MEMBER_POINT,MEMBER_STEP,MEMBER_CUMPOINT,MEMBER_REG_DATE,MEMBER_IMG) values ('obama','123','버락오바마','010-0512-0512','obama@yahoo.net','19640512','남','서울 강북구 삼각산로 43(수유동,서울 영어마을 수유캠프)',0,9,0,to_timestamp('18/01/24 16:23:04.521000000','RR/MM/DD HH24:MI:SSXFF'),null);
Insert into ANDROID_MEMBER_TBL (MEMBER_ID,MEMBER_PWD,MEMBER_NAME,MEMBER_TEL,MEMBER_EMAIL,MEMBER_BIRTH,MEMBER_SEX,MEMBER_ADDRESS,MEMBER_POINT,MEMBER_STEP,MEMBER_CUMPOINT,MEMBER_REG_DATE,MEMBER_IMG) values ('trump','123','트럼프','010-1212-1212','trump@yahoo.net','19601212','남','서울 강서구 초록마을로22길 24(화곡동,영어나라어린이집)',0,9,0,to_timestamp('18/01/24 16:24:14.827000000','RR/MM/DD HH24:MI:SSXFF'),null);

    7. 톰캣 : http://localhost/gsonEx/
    8. 안드로이드 로그인  : park/123


----- 이클립스 컨트롤러 로그  -------------

INFO : spring.mvc.gsonEx.HomeController - Welcome home! The client locale is ko_KR.
INFO : spring.mvc.gsonEx.AndroidController - androidSignIn()
INFO : spring.mvc.gsonEx.AndroidController - 로그인 성공: 9
INFO : spring.mvc.gsonEx.AndroidController - androidMyPageMain()
id : park
dao m : spring.mvc.gsonEx.vo.Member@39bf60c9
m : spring.mvc.gsonEx.vo.Member@39bf60c9
     */


}
