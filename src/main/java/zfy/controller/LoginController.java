package zfy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zfy.model.Login;
import zfy.service.LoginServiceI;

@Controller
@RequestMapping("/loginController")
public class LoginController {
	private LoginServiceI loginServiceI;

	public LoginServiceI getLoginServiceI() {
		return loginServiceI;
	}

	@Autowired
	public void setLoginServiceI(LoginServiceI loginServiceI) {
		this.loginServiceI = loginServiceI;
	}
	
	@RequestMapping("/login")
	public String login(String loginName,String passWord,HttpServletRequest request) {
		
		Login login=loginServiceI.login(loginName, passWord);
		if(login!=null)
		{
		request.setAttribute("login", login);
		return "Welcome";
		}
		else
		{
			return "login";
			
		}
		
	}
	
	@RequestMapping("/Load")
	public String Load()
	{
		return "Login";
	}
	

}
