package cn.edu.imufe.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import cn.edu.imufe.bean.Location;
import cn.edu.imufe.bean.Users;
import cn.edu.imufe.service.impl.UserServiceImpl;

@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	/**
	 * 管理员登录
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 */
	 @RequestMapping(value = "/login")
	    public String login(HttpServletRequest request, Model model, HttpServletResponse response){
	        
	        String name=request.getParameter("uname");
	        String password=request.getParameter("upassword");
	        System.out.println("uname= "+name);
	        Users user = userServiceImpl.login(name,password);
	        if(user!=null) {
	        request.getSession().setAttribute("loginUser", user);
	 	      return "redirect:../management/index.html";  
	 	       
	        }
	       
	        return "redirect:../management/loginUser.html";  
	    }
	 /**
	  * 获取所有管理员信息
	  * @param request
	  * @param model
	  * @param response
	  * @throws IOException
	  */
	 @RequestMapping(value = "/getAllUsers")
	    public void getAllUsers(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
	        List<Users> lists = userServiceImpl.selectAllUsers();
	        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(lists));  
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("listData", jsonArray);
			System.out.println(jsonObject);
			response.setContentType("text/json"); 
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json;character=UTF-8");
			response.getWriter().write(jsonObject.toString());
	    }
}
