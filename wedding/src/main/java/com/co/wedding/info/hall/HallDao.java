package com.co.wedding.info.hall;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * HALL Dao
 *
 * @author  Chopin
 * @date    2019-01-31
 * @since   1.0
 */
@Repository
public class HallDao {
	
	@Autowired
	SqlSession sqlSession;

	/**
	 * 웨딩홀목록
	 * @param userBean
	 * @return
	 */
	public List<HallBean> list(HallBean bean) {
		return sqlSession.selectList("_hall.list", bean);
	}

	/**
	 * 웨딩홀상세
	 * @param userBean
	 * @return
	 */
	public HallBean view(HallBean bean) {
		return sqlSession.selectOne("_hall.view", bean);
	}

	/**
	 * 웨딩홀등록
	 * @param userBean
	 * @return
	 */
	public int insertAction(HallBean bean) {
		return sqlSession.insert("_hall.insert", bean);
	}

	/**
	 * 웨딩홀수정
	 * @param userBean
	 * @return
	 */
	public int updateAction(HallBean bean) {
		return sqlSession.update("_hall.update", bean);
	}

	/**
	 * 유저삭제
	 * @param userBean
	 * @return
	 */
	public int deleteAction(HallBean bean) {
		return sqlSession.delete("_hall.delete", bean);
	}
}