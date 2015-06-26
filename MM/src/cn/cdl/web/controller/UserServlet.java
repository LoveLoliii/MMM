package cn.cdl.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cdl.domain.User;
import cn.cdl.service.UserDaoService;
import cn.itcast.servlet.BaseServlet;

public class UserServlet extends BaseServlet {
	private UserDaoService userDaoService = new UserDaoService();
	
	public String findAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<User> userList = userDaoService.findAll();
		request.setAttribute("userList", userList);
		return "f:/showuser.jsp";
	}
}
