package com.store.busi.login.service;

import java.util.Map;

import com.store.busi.login.model.*;

public interface ILoginService {

	public boolean doLogin(String phone, String dtoken);
	
	public boolean doLogout(String sessionId);
	
	public boolean regist(RegistModel registModel);

	public String getDynamiCode();

	public boolean doUpdateService(Map<String, String> modList);

	public Map<String, String> getDetail(String phoneNum);
	
	
}
