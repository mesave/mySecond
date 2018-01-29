package zfy.controller;




import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zfy.model.User;
import zfy.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {

	private UserServiceI userServiceI;

	protected UserServiceI getUserServiceI() {
		return userServiceI;
	}
     
	/*
	 * 注入
	 */
	@Autowired
	protected void setUserServiceI(UserServiceI userServiceI) {
		this.userServiceI = userServiceI;
	}
	
	
	
	@RequestMapping("/showUser")
	public String showUser(int id,HttpServletRequest request) {
		User user=userServiceI.getUserById(id);
		request.setAttribute("user", user);
		return "index";
	}
	
	
	
}
