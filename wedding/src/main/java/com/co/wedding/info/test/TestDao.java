package com.co.wedding.info.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * TEST Dao
 *
 * @author  Chopin
 * @date    2018-12-29
 * @since   1.0
 */
@Repository
public class TestDao {
	
	@Autowired
	SqlSession sqlSession;

	public List<TestBean> list() {
		List<TestBean> dataList = sqlSession.selectList("test.test");
		System.out.println(dataList);
		return dataList;
	}
	
}
