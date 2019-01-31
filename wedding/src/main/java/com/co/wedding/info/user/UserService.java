package com.co.wedding.info.user;

import java.util.List;

/**
 * USER Service
 *
 * @author  Chopin
 * @date    2019-01-27
 * @since   1.0
 */
public interface UserService {

	// 유저목록
	List<UserBean> list(UserBean bean);
	// 유저상세
	UserBean view(UserBean bean);
	// 유저등록
	int insertAction(UserBean bean);
	// 유저수정
	int updateAction(UserBean bean);
	// 유저삭제
	int deleteAction(UserBean bean);
	
}
