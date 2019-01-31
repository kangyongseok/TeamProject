package com.co.wedding.info.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * USER Dao
 *
 * @author  Chopin
 * @date    2019-01-27
 * @since   1.0
 */
@Repository
public class UserDao {
	
	@Autowired
	SqlSession sqlSession;

	/**
	 * 유저목록
	 * @param userBean
	 * @return
	 */
	public List<UserBean> list(UserBean bean) {
		return sqlSession.selectList("_user.list", bean);
	}

	/**
	 * 유저상세
	 * @param userBean
	 * @return
	 */
	public UserBean view(UserBean bean) {
		return sqlSession.selectOne("_user.view", bean);
	}

	/**
	 * 유저등록
	 * @param userBean
	 * @return
	 */
	public int insertAction(UserBean bean) {
		return sqlSession.insert("_user.insert", bean);
	}

	/**
	 * 유저수정
	 * @param userBean
	 * @return
	 */
	public int updateAction(UserBean bean) {
		return sqlSession.update("_user.update", bean);
	}

	/**
	 * 유저삭제
	 * @param userBean
	 * @return
	 */
	public int deleteAction(UserBean bean) {
		return sqlSession.delete("_user.delete", bean);
	}
}