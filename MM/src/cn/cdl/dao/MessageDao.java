package cn.cdl.dao;

import java.util.List;

import cn.cdl.domain.Message;


public interface MessageDao {
	//添加消息
	public void save(Message message);
	//查询所有消息
	public List<Message> findAll();
}
