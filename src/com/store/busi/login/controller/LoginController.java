package com.store.busi.login.controller;

import com.store.busi.login.model.*;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.store.busi.login.service.ILoginService;

@RestController
public class LoginController {
	
	@Autowired
	private ILoginService loginService;
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public boolean login(@RequestParam("phone") String phone, @RequestParam("dtoken")String dtoken) {
		if (null == phone || null == dtoken) {
			return false;
		}
		return loginService.doLogin(phone, dtoken);
	}
	@RequestMapping(value="logout",method=RequestMethod.GET)
	public boolean logout(@RequestParam("sessionId")String sessionId) {
		if (null == sessionId || "".equals(sessionId)) {
			return false;
		}
		return loginService.doLogout(sessionId);
	}
	@RequestMapping(value="regist",method=RequestMethod.POST)
	public boolean regist(@RequestParam("RegModel")RegistModel registModel) {
		if (null == registModel) {
			return false;
		}
		return loginService.regist(registModel);
	}
	@RequestMapping(value="getDyCode",method=RequestMethod.GET)
	public String getDynamiCode() {
		return loginService.getDynamiCode();
	}
	@RequestMapping(value="update", method=RequestMethod.POST)
	public boolean updateInfo(@RequestParam("modList") Map<String,String> modList) {
		return loginService.doUpdateService(modList);
	}
	@RequestMapping(value="getDetail", method=RequestMethod.GET)
	public Map<String,String> getDetail(@RequestParam("phoneNum") String phoneNum){
		return loginService.getDetail(phoneNum);
	}
	
	public ILoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}
}
