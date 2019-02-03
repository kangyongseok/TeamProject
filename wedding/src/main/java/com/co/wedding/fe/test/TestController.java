package com.co.wedding.fe.test;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.co.wedding.fe.FeConstant;
import com.co.wedding.info.test.TestBean;
import com.co.wedding.info.test.TestService;
import com.co.wedding.info.user.UserBean;
import com.co.wedding.info.user.UserService;


/**
 * TEST Controller
 *
 * @author  Chopin
 * @date    2018-12-29
 * @since   1.0
 */
@Controller
@RequestMapping(value=FeConstant.FE_TEST_URL)
public class TestController {
	
	@Resource
	TestService service;
	
	/**
	 * 샘플 페이지
	 * @param model
	 */
	@RequestMapping(value="/NR_index.do")
    public void test(Model model) {
    	List<TestBean> dataList = service.list();
    	model.addAttribute("dataList", dataList);
    }
    
    /**
     * 테스트 목록 (json 타입)
     */
	@ResponseBody
    @RequestMapping(value="/JR_list.do", method=RequestMethod.GET)
    public List<TestBean> list(ModelMap model) {
    	List<TestBean> dataList = service.list();
        return dataList;
    }
	
	/**
	 * 샘플 페이지
	 * @param model
	 */
	@RequestMapping(value="/NR_index2.do")
    public void test2(Model model) {
    	
    }
	
}
