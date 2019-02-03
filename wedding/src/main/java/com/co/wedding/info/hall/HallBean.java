package com.co.wedding.info.hall;

import org.apache.ibatis.type.Alias;

import com.co.wedding.info.common.BaseBean;

import lombok.Getter;
import lombok.Setter;

/**
 * HALL Bean
 *
 * @author  Chopin
 * @date    2019-01-31
 * @since   1.0
 */
@Alias("hallBean")
@Getter @Setter
public class HallBean extends BaseBean  {

	/* 웨딩홀_일련번호 */
	private String hallSeq;
	/* 유저_아이디 */
	private String userId;
	/* 웨딩홀_명 */
	private String hallNm;
	/* 우편번호 */
	private String post;
	/* 기본주소 */
	private String addr1;
	/* 상세주소 */
	private String addr2;
	/* 연락처 */
	private String tel;
	/* 파일_번호 */
	private String fileNo;
	/* 등록_일시 */
	private String regDt;
	/* 등록_일자 */
	private String regDd;
	/* 등록_아이디 */
	private String regId;
	/* 수정_일시 */
	private String modiDt;
	/* 수정_아이디 */
	private String modiId;
}
