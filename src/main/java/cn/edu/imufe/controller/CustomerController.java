package cn.edu.imufe.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

import cn.edu.imufe.bean.Customer;
import cn.edu.imufe.bean.Users;
import cn.edu.imufe.service.impl.CustomerServiceImpl;

@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	/**
	 * 获取所有客户信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllCustomer")
    public void getAllCustomer(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
        List<Customer> lists = customerServiceImpl.selectAll();
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(lists));  
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("listData", jsonArray);
		System.out.println(jsonObject);
		response.setContentType("text/json"); 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;character=UTF-8");
		response.getWriter().write(jsonObject.toString());
    }
	/**
	 * 客户登录
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 */
	 @RequestMapping(value = "/login")
	    public String login(HttpServletRequest request, Model model, HttpServletResponse response){
	        
	        String name=request.getParameter("cname");
	        String password=request.getParameter("cpassword");
	        System.out.println("uname= "+name);
	        Customer temp = customerServiceImpl.selectByCname(name);
	        if(temp!=null) {	        	
	        		if(temp.getCpassword().equals(password)) {
	        			request.getSession().setAttribute("loginCustomer", temp);
	        			return "redirect:../client/index.html";  
	        		}	        	        
	        		return "redirect:../client/signin.html";  	 	       
	        }	       
	        return "redirect:../client/signin.html";  
	    }
	 /**
		 * 客户注册
		 * @param request
		 * @param model
		 * @param response
		 * @return
	 * @throws Exception 
		 */
		 @RequestMapping(value = "/register")
		    public String register(HttpServletRequest request, Model model, HttpServletResponse response) throws Exception{
			 String contextPath = request.getContextPath();
				PrintWriter out = response.getWriter();
		        String cname=request.getParameter("cname");
		        String cpassword=request.getParameter("cpwd");
		        String cusername=request.getParameter("cusername");
		        String cage=request.getParameter("cage");
		        String csex=request.getParameter("csex");
		        String cphone=request.getParameter("cphone");
		        String cemail=request.getParameter("cemail");

		        Customer temp = customerServiceImpl.selectByCname(cname);
		        if(temp!=null) {	        	        	        
		        	out.print("<script type='text/javascript'>"
							+ "alert('User name already exists');"+"location.href='"+contextPath + "/client/signup.html';"
							+ "</script>");
					out.flush();
					out.close();      
		        }
		        Customer customer=new Customer();
		        customer.setCname(cname);
		        customer.setCpassword(cpassword);
		        customer.setCusername(cusername);
		        customer.setCage(Integer.parseInt(cage));
		        customer.setCsex(csex);
		        customer.setCphone(cphone);
		        customer.setCemail(cemail);
		        customerServiceImpl.addCustomer(customer);
		        return "redirect:../client/signin.html";  
		    }
}
