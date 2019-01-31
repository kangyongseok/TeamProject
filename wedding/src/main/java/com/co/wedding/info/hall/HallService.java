package com.co.wedding.info.hall;

import java.util.List;

/**
 * HALL Service
 *
 * @author  Chopin
 * @date    2019-01-31
 * @since   1.0
 */
public interface HallService {

	// 웨딩홀목록
	List<HallBean> list(HallBean bean);
	// 웨딩홀상세
	HallBean view(HallBean bean);
	// 웨딩홀등록
	int insertAction(HallBean bean);
	// 웨딩홀수정
	int updateAction(HallBean bean);
	// 웨딩홀삭제
	int deleteAction(HallBean bean);
	
}
