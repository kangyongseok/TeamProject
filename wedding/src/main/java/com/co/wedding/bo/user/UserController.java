package com.co.wedding.bo.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.co.wedding.bo.BoConstant;
import com.co.wedding.info.user.UserBean;
import com.co.wedding.info.user.UserService;


/**
 * USER Controller
 *
 * @author  Chopin
 * @date    2019-02-03
 * @since   1.0
 */
@Controller
@RequestMapping(value=BoConstant.BO_USER)
public class UserController {
	
	@Resource
	UserService userService;
	
	/**
	 * 유저 목록
	 * @param model
	 * @param bean
	 */
	@RequestMapping(value="/NR_index.do")
    public void index(ModelMap model, UserBean bean) {
		List<UserBean> dataList = userService.list(bean);
		model.addAttribute("dataList", dataList);
	}
	
	/**
	 * 유저 폼
	 */
	@RequestMapping(value="/NR_form.do")
    public void form() {}
	
	
	
}
