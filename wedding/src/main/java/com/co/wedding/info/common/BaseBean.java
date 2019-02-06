package com.co.wedding.info.common;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;

/**
 * BASE Bean
 *
 * @author  Chopin
 * @date    2019-02-04
 * @since   1.0
 */
@Alias("BaseBean")
@Getter @Setter
public class BaseBean  {
	/* 검색_파라미터 */
	private String searchParam;
	/* 액션구분 */
	private String cmd;
}
