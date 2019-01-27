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
	public List<UserBean> list(UserBean userBean) {
		return sqlSession.selectList("user.list", userBean);
	}

	/**
	 * 유저상세
	 * @param userBean
	 * @return
	 */
	public UserBean view(UserBean userBean) {
		return sqlSession.selectOne("user.view", userBean);
	}

	/**
	 * 유저등록
	 * @param userBean
	 * @return
	 */
	public int insertAction(UserBean userBean) {
		return sqlSession.insert("user.insert", userBean);
	}

	/**
	 * 유저수정
	 * @param userBean
	 * @return
	 */
	public int updateAction(UserBean userBean) {
		return sqlSession.update("user.update", userBean);
	}

	/**
	 * 유저삭제
	 * @param userBean
	 * @return
	 */
	public int deleteAction(UserBean userBean) {
		return sqlSession.delete("user.delete", userBean);
	}
}