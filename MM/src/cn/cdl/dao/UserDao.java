package cn.cdl.dao;

import java.util.List;

import cn.cdl.domain.User;

public interface UserDao {
	//添加用户
	public void save(User user);
	//查询所有用户
	public List<User> findAll();
	//查询用户（用户名 密码）
	public User find(String name,String password);
	//删除用户
	public void delete(String id);
	//修改用户
	public void update(User user);
}
