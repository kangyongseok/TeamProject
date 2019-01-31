package com.co.wedding.info.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * USER ServiceImpl
 *
 * @author  Chopin
 * @date    2019-01-27
 * @since   1.0
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	UserDao dao;

	/**
	 * 유저목록
	 */
	@Override
	public List<UserBean> list(UserBean bean) {
		return dao.list(bean);
	}

	/**
	 * 유저상세
	 */
	@Override
	public UserBean view(UserBean bean) {
		return dao.view(bean);
	}

	/**
	 * 유저등록
	 */
	@Override
	public int insertAction(UserBean bean) {
		return dao.insertAction(bean);
	}

	/**
	 * 유저수정
	 */
	@Override
	public int updateAction(UserBean bean) {
		return dao.updateAction(bean);
	}

	/**
	 * 유저삭제
	 */
	@Override
	public int deleteAction(UserBean bean) {
		return dao.deleteAction(bean);
	}
}
