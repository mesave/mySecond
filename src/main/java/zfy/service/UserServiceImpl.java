package zfy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zfy.dao.UserMapper;
import zfy.model.User;

@Service("userService")
public class UserServiceImpl  implements UserServiceI {

	private UserMapper userMapper;

	protected UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	protected void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	
}
