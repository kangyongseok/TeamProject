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
	List<UserBean> list(UserBean userBean);
	// 유저상세
	UserBean view(UserBean userBean);
	// 유저등록
	int insertAction(UserBean userBean);
	// 유저수정
	int updateAction(UserBean userBean);
	// 유저삭제
	int deleteAction(UserBean userBean);
	
}
