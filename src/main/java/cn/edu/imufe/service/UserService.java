package cn.edu.imufe.service;

import java.util.List;

import cn.edu.imufe.bean.Users;

public interface UserService {
      Users login(String name,String password);
      List<Users> selectAllUsers();
}
