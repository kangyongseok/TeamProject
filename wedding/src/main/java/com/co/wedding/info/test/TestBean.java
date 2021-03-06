package com.co.wedding.info.test;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

/**
 * TEST Bean
 *
 * @author  Chopin
 * @date    2018-12-29
 * @since   1.0
 */
@Alias("testBean")
@Getter @Setter
public class TestBean  {

    /* 유저_아이디 */
	private String userId;
	/* 유저_패스워드 */
	private String userPwd;
	/* 유저_구분 */
	private String userDiv;
	/* 이름 */
	private String name;
	/* 우편번호 */
	private String post;
	/* 주소1 */
	private String addr1;
	/* 주소2 */
	private String addr2;
	/* 소셜_구분 */
	private String snsDiv;
	/* 소셜_코드 */
	private String snsCd;
	/* 사용_여부 */
	private String useYn;
	/* 등록_일시 */
	private String regDt;
	/* 수정_일시 */
	private String modiDt;
}
