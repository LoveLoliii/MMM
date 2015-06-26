package cn.cdl.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.cdl.dao.UserDao;
import cn.cdl.domain.User;
import cn.itcast.jdbc.TxQueryRunner;

public class UserDaoImpl implements UserDao {
	private QueryRunner qr = new TxQueryRunner();
	//添加用户
	public void save(User user) {
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?)";
		Object[] params = {user.getUsername(),user.getUserpassword(),
				user.getGrade(),user.getProfessional(),user.getTruename(),
				user.getSex(),user.getPhone(),
				user.getQqmun(),user.getAge(),user.getDepartment()};
		try {
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//查询所有用户
	public List<User> findAll() {
		String sql = "select * from user";
		try {
			return qr.query(sql,new BeanListHandler<User>(User.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//查询用户（用户名 密码）
	public User find(String name, String password) {
		String sql = "select * from user where username=? and userpassword=?";
		try {
			return qr.query(sql, new BeanHandler<User>(User.class),name,password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//删除用户
	public void delete(String id) {
		String sql = "delete from user where username=?";
		try {
			qr.update(sql,id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	@Override
	public void update(User user) {
		String sql = "update ";
		
	}
	

}
