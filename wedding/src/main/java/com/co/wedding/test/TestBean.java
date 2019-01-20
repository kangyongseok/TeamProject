package com.co.wedding.test;

import org.apache.ibatis.type.Alias;

/**
 * TEST Bean
 *
 * @author  Chopin
 * @date    2018-12-29
 * @since   1.0
 */
@Alias("testBean")
public class TestBean  {

    /* 유저_일련번호 */
	private String userSeq;
    /* 유저_아이디 */
	private String userId;
	/* 유저_패스워드 */
	private String userPwd;
	/* 유저_구분 */
	private String userDiv;
	
	public String getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(String userSeq) {
		this.userSeq = userSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
    public String getUserDiv() {
		return userDiv;
	}
	public void setUserDiv(String userDiv) {
		this.userDiv = userDiv;
	}
}
