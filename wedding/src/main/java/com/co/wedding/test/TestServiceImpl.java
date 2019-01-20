package com.co.wedding.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * TEST ServiceImpl
 *
 * @author  Chopin
 * @date    2018-12-29
 * @since   1.0
 */
@Service
public class TestServiceImpl implements TestService {
	
	@Resource
	TestDao dao;

	@Override
	public List<TestBean> list() {
		return dao.list();
	}

}
