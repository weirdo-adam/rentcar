package cn.edu.imufe.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

import cn.edu.imufe.bean.Orders;

import cn.edu.imufe.bean.Users;
import cn.edu.imufe.bean.vo.OrderDetail;

import cn.edu.imufe.service.impl.OrdersServiceImpl;

@Controller
@RequestMapping(value="/orders")
public class OrdersController {
	@Autowired private OrdersServiceImpl orderServiceImpl;
	/**
	 * 获取所有订单
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllOrderDetail")
    public void getAllOrderDetail(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
		List<OrderDetail> lists = orderServiceImpl.selectAllOrderDetail();
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
	 * 根据ID获取订单详情
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectOrderDetail")
    public void selectOrderDetail(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String id=request.getParameter("oid");
       OrderDetail temp=orderServiceImpl.selectOrderDetailById(Integer.parseInt(id));
       JSONObject jsonObject = new JSONObject();
		jsonObject.put("listData", temp);
		System.out.println(jsonObject);
		response.setContentType("text/json"); 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;character=UTF-8");
		response.getWriter().write(jsonObject.toString());
    }
	/**
	 * 修改订单状态 
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateOrder")
    public String updateRelation(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
       String id=request.getParameter("oid");
       String state=request.getParameter("state");
       String location=request.getParameter("location");
       Users loginUser=(Users) request.getSession().getAttribute("loginUser");
       Orders temp=new Orders();
      temp.setOid(Integer.parseInt(id));
      temp.setState(state);
      Date time = new Date(System.currentTimeMillis());
      if(loginUser==null) {
    	  return "redirect:../management/orders_list.html";
      }
      if(state.equals("已取车")) {
    	  temp.setExtractuid(loginUser.getUid());
    	  temp.setExtractdate(new java.sql.Date(time.getTime()));
    	  temp.setExtractlocation(location);
      }
      if(state.equals("已还车")) {
    	  temp.setStilluid(loginUser.getUid());
    	  temp.setStilldate(new java.sql.Date(time.getTime()));
    	  temp.setStilllocation(location);
      }
       orderServiceImpl.updateOrders(temp);
       return "redirect:../management/orders_list.html";
      
    }
}
