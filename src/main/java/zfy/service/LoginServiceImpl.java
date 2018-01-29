package zfy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zfy.dao.LoginMapper;
import zfy.model.Login;

@Service("loginService")
public class LoginServiceImpl implements LoginServiceI {

	private LoginMapper loginMapper;

	public LoginMapper getLoginMapper() {
		return loginMapper;
	}

	@Autowired
	public void setLoginMapper(LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}
	
	public Login login(String loginName,String passWord)
	{
		return  loginMapper.Login(loginName, passWord);
		
	}
	
}
