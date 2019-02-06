package com.co.wedding.bo;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.co.wedding.info.test.TestService;


/**
 * BO Controller
 *
 * @author  Chopin
 * @date    2019-02-03
 * @since   1.0
 */
@Controller
@RequestMapping(value=BoConstant.BO_MAIN)
public class BoController {
	
	@Resource
	TestService service;
	
	/**
	 * 대시보드
	 * @param model
	 */
	@RequestMapping(value="/NR_index.do")
    public void index() {}
	
	@RequestMapping(value="/")
    public String index2() {
		return "redirect:NR_index.do";
	}
	
}
