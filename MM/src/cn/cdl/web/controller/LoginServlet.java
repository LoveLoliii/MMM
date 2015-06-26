package cn.cdl.web.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import cn.cdl.domain.User;
import cn.cdl.service.UserDaoService;
import cn.itcast.servlet.BaseServlet;
import cn.itcast.utils.CommonUtils;

public class LoginServlet extends BaseServlet {
	private UserDaoService userDaoService = new UserDaoService();
	
	//注册
	public void regist(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = CommonUtils.toBean(request.getParameterMap(), User.class);
		userDaoService.save(user);
		//给出提示
		response.getWriter().write("注册成功！1秒后转向登陆页面");
		response.setHeader("Refresh", "1;URL="+request.getContextPath()+"/index.html");
System.out.println(request.getContextPath());
	}
	
	public void test(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = CommonUtils.toBean(request.getParameterMap(), User.class);
		System.out.println(user.toString());
	}
	
	//查找系别（将系别返回给下拉列表框）
	public void department(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		try {
			SAXReader reader = new SAXReader();
			InputStream input = this.getClass().getResourceAsStream("/hfuu.xml");
			Document doc = reader.read(input);
			
			/*
			 * 查询所有province的name属性，得到一堆的属性对象
			 * 循环遍历，把所有的属性值连接成一个字符串，发送给客户端
			 */
			List<Attribute> arrList = doc.selectNodes("//department/@name");
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < arrList.size(); i++) {
				sb.append(arrList.get(i).getValue());//把每个属性的值存放到sb中。
				if(i < arrList.size() - 1) {
					sb.append(",");
				}
			}
			response.getWriter().print(sb);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void professional(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/xml;charset=utf-8");//注意：发送xml这里要修改！！！
		
		/*
		 * 获取省份名称，加载该省对应的<province>元素！
		 * 把元素转换成字符串发送给客户端
		 */
		/*
		 * 1. 获取省份的名称
		 * 2. 使用省份名称查找到对应的<province>元素
		 * 3. 把<province>元素转换成字符串，发送！
		 */
		try {
			/*
			 * 得到Document
			 */
			SAXReader reader = new SAXReader();
			InputStream input = this.getClass().getResourceAsStream("/hfuu.xml");
			Document doc = reader.read(input);
			
			/*
			 * 获取参数
			 */
			String pname = request.getParameter("pname");//获取省份名称
			Element proEle = (Element) doc.selectSingleNode("//department[@name='" + pname + "']");
			String xmlStr = proEle.asXML();//把元素转换成字符串
			response.getWriter().print(xmlStr);
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
