package com.co.wedding.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * TEST Controller
 *
 * @author  Chopin
 * @date    2018-12-29
 * @since   1.0
 */
@Controller
@RequestMapping(value="/test")
public class TestController {
	
	@Resource
	TestService service;
	
	@RequestMapping(value="/test.do")
    public void test(Model model) {
    	List<TestBean> dataList = service.list();
    	model.addAttribute("dataList", dataList);
    }
}
