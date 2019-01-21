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

    /* 유저_일련번호 */
	private String userSeq;
    /* 유저_아이디 */
	private String userId;
	/* 유저_패스워드 */
	private String userPwd;
	/* 유저_구분 */
	private String userDiv;
	
}
