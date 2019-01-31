package com.co.wedding.info.hall;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * HALL ServiceImpl
 *
 * @author  Chopin
 * @date    2019-01-31
 * @since   1.0
 */
@Service
public class HallServiceImpl implements HallService {
	
	@Resource
	HallDao dao;

	/**
	 * 웨딩홀목록
	 */
	@Override
	public List<HallBean> list(HallBean bean) {
		return dao.list(bean);
	}

	/**
	 * 웨딩홀상세
	 */
	@Override
	public HallBean view(HallBean bean) {
		return dao.view(bean);
	}

	/**
	 * 웨딩홀등록
	 */
	@Override
	public int insertAction(HallBean bean) {
		return dao.insertAction(bean);
	}

	/**
	 * 웨딩홀수정
	 */
	@Override
	public int updateAction(HallBean bean) {
		return dao.updateAction(bean);
	}

	/**
	 * 웨딩홀삭제
	 */
	@Override
	public int deleteAction(HallBean bean) {
		return dao.deleteAction(bean);
	}
}
