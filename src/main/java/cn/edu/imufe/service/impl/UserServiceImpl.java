package cn.edu.imufe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.imufe.bean.Users;
import cn.edu.imufe.dao.UsersMapper;
import cn.edu.imufe.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired UsersMapper usersDao;
	@Override
	public Users login(String name, String password) {
		Users user=usersDao.login(name, password);
		return user;
	}

	@Override
	public List<Users> selectAllUsers() {
		List<Users> list=usersDao.selectByExample(null);
		return list;
	}

}
