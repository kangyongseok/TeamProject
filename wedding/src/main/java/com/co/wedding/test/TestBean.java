package com.co.wedding.test;

import org.apache.ibatis.type.Alias;

/**
 * �׽�Ʈ Bean
 *
 * @author  Chopin
 * @date    2018-12-29
 * @since   1.0
 */
@Alias("testBean")
public class TestBean  {

    /* ����_�Ϸù�ȣ */
	private String userSeq;
    /* ����_���̵� */
	private String userId;
	/* ����_��й�ȣ */
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
