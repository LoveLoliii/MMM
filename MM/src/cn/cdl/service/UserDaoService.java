package cn.cdl.service;

import java.util.List;

import cn.cdl.dao.impl.UserDaoImpl;
import cn.cdl.domain.User;

public class UserDaoService {
	private UserDaoImpl userDaoImpl = new UserDaoImpl();
	
	public void save(User user){
		userDaoImpl.save(user);
	}
	//查询所有用户
	public List<User> findAll(){
		return userDaoImpl.findAll();
	}
	//查询用户（用户名 密码）
	public User find(String name,String password){
		return userDaoImpl.find(name, password);
	}
}
