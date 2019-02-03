package com.co.wedding.bo.hall;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.co.wedding.bo.BoConstant;
import com.co.wedding.info.hall.HallBean;
import com.co.wedding.info.hall.HallService;


/**
 * HALL Controller
 *
 * @author  Chopin
 * @date    2019-02-03
 * @since   1.0
 */
@Controller
@RequestMapping(value=BoConstant.BO_HALL)
public class HallController {
	
	@Resource
	HallService hallService;
	
	/**
	 * 웨딩홀 목록
	 * @param model
	 * @param bean
	 */
	@RequestMapping(value="/NR_index.do")
    public void index(ModelMap model, HallBean bean) {
		List<HallBean> dataList = hallService.list(bean);
		model.addAttribute("dataList", dataList);
	}
	
	/**
	 * 웨딩홀 폼
	 */
	@RequestMapping(value="/NR_form.do")
    public void form() {}
}
