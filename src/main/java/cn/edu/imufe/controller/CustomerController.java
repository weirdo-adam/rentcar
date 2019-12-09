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

import cn.edu.imufe.bean.Customer;
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
}
