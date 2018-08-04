package com.store.busi.login.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.store.busi.login.model.RegistModel;

@Repository
public interface ILoginDao {

	public boolean execLogin(String phone, String dtoken);
	
	public boolean execLogout(String sessionId);
	
	public boolean execRegist(RegistModel registModel);

	public boolean execInfo(Map<String, String> modList);

	public Map<String, String> execGetDetail(String phoneNum);
	
}
