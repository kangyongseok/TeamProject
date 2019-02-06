package com.co.wedding.bo.user;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	 * @param model
	 * @param bean
	 */
	@RequestMapping(value="/NR_form.do")
    public void form(ModelMap model, UserBean bean) {
		
		UserBean dataBean = new UserBean();
		
		// 등록
		if ( bean.getUserId() == null ) {
			dataBean.setCmd("I");
		}
		// 수정
		else {
			dataBean.setCmd("U");
			dataBean = userService.view(bean);
		}
		
		model.addAttribute("dataBean", dataBean);
	}

	/**
	 * 유저 등록
	 * @param bean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/AR_insertAction.do")
	public String insertAction(UserBean bean) {
		int affected = userService.insertAction(bean);
		if (affected == 1) return BoConstant.REQ_SUCCESS_CODE;
		return BoConstant.REQ_FAIL_CODE;
	}

	/**
	 * 유저 수정
	 * @param bean
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/AR_updateAction.do")
	public String updateAction(UserBean bean) {
		int affected = userService.updateAction(bean);
		if (affected == 1) return BoConstant.REQ_SUCCESS_CODE;
		return BoConstant.REQ_FAIL_CODE;
	}
	
}
