package com.co.wedding.test;

import org.apache.ibatis.type.Alias;

/**
 * 테스트 Bean
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
	/* 유저_비밀번호 */
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
	
	
	private String USER_SEQ;
	private String USER_ID;
	private String USER_PWD;
	private String USER_DIV;

	public String getUSER_SEQ() {
		return USER_SEQ;
	}
	public void setUSER_SEQ(String uSER_SEQ) {
		USER_SEQ = uSER_SEQ;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getUSER_PWD() {
		return USER_PWD;
	}
	public void setUSER_PWD(String uSER_PWD) {
		USER_PWD = uSER_PWD;
	}
	public String getUSER_DIV() {
		return USER_DIV;
	}
	public void setUSER_DIV(String uSER_DIV) {
		USER_DIV = uSER_DIV;
	}
	
	
}
