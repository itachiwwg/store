package com.store.busi.login.service.impl;

import com.store.busi.login.dao.*;
import com.store.busi.login.model.*;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.store.busi.login.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService{

	@Autowired
	private ILoginDao loginDao;
	@Override
	public boolean doLogin(String phone, String dtoken) {
		// TODO Auto-generated method stub
		return loginDao.execLogin(phone, dtoken);
	}

	@Override
	public boolean doLogout(String sessionId) {
		// TODO Auto-generated method stub
		return loginDao.execLogout(sessionId);
	}

	@Override
	public boolean regist(RegistModel registModel) {
		// TODO Auto-generated method stub
		return loginDao.execRegist(registModel);
	}

	@Override
	public String getDynamiCode() {
		// TODO Auto-generated method stub
		return execGetDyCode();
	}

	private String execGetDyCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean doUpdateService(Map<String, String> modList) {
		// TODO Auto-generated method stub
		return loginDao.execInfo(modList);
	}

	@Override
	public Map<String, String> getDetail(String phoneNum) {
		// TODO Auto-generated method stub
		return loginDao.execGetDetail(phoneNum);
	}

}
