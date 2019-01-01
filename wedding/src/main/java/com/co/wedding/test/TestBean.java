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
}
