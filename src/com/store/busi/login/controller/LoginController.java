package com.store.busi.login.controller;

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
	public boolean login(@RequestParam("username") String username,@RequestParam("password")String password) {
		return loginService.doLogin();
	}
	@RequestMapping(value="logout",method=RequestMethod.GET)
	public boolean logout() {
		
		return loginService.doLogout();
	}
	@RequestMapping(value="regist",method=RequestMethod.POST)
	public boolean regist() {
		
		return loginService.regist();
	}

	public ILoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(ILoginService loginService) {
		this.loginService = loginService;
	}
}
