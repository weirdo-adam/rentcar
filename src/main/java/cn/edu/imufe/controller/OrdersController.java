package cn.edu.imufe.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
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

import cn.edu.imufe.bean.Car;
import cn.edu.imufe.bean.Customer;
import cn.edu.imufe.bean.Orders;

import cn.edu.imufe.bean.Users;
import cn.edu.imufe.bean.vo.CarDetail;
import cn.edu.imufe.bean.vo.OrderDetail;
import cn.edu.imufe.service.impl.CarServiceImpl;
import cn.edu.imufe.service.impl.OrdersServiceImpl;

@Controller
@RequestMapping(value="/orders")
public class OrdersController {
	@Autowired private OrdersServiceImpl orderServiceImpl;
	@Autowired private CarServiceImpl carServiceImpl;
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
    	  if(!location.equals("-1")) {
    		  temp.setExtractlocation(location);
    	  }
    	  
      }
      if(state.equals("已还车")) {
    	  temp.setStilluid(loginUser.getUid());
    	  temp.setStilldate(new java.sql.Date(time.getTime()));  	 
          if(!location.equals("-1")) {
	      temp.setStilllocation(location);
    	  }
      }
       orderServiceImpl.updateOrders(temp);
       return "redirect:../management/orders_list.html";
      
    }
	/**
	 * 根据客户ID获取所有订单
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllOrderDetailByCId")
    public void getAllOrderDetailByCId(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
		Customer temp=(Customer) request.getSession().getAttribute("loginCustomer");
		List<OrderDetail> lists = orderServiceImpl.selectAllOrderDetailByCId(temp.getCid());
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
	 * 添加订单
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 * @throws Exception 
	 */
	@RequestMapping(value = "/addOrder")
    public void addOrder(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException, Exception{
		String contextPath = request.getContextPath();
		 PrintWriter out = response.getWriter();
		Customer temp=(Customer) request.getSession().getAttribute("loginCustomer");
		if(temp==null) {
			out.print("<script type='text/javascript'>"
					+ "alert('Login expired');"+"location.href='"+contextPath + "/client/signin.html';"
					+ "</script>");
			out.flush();
			out.close();
		}
		String carid=request.getParameter("carid");
		String starttime=request.getParameter("starttime");
		String endtime=request.getParameter("endtime");
		String location1=request.getParameter("location1");
		String location2=request.getParameter("location2");
		Orders order=new Orders();
		order.setExtractlocation(location1);
		order.setStilllocation(location2);
		order.setCarid(Integer.parseInt(carid));
		order.setCid(temp.getCid());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate=sdf.parse(starttime);
		Date endDate=sdf.parse(endtime);
		order.setStarttime(startDate);
		order.setEndtime(endDate);
		order.setState("已预约");
		CarDetail car=carServiceImpl.selectCarDetailById(Integer.parseInt(carid));
		long stateTimeLong = startDate.getTime();
		long endTimeLong = endDate.getTime();
		// 结束时间-开始时间 = 天数
		
		int price=(int) (car.getPrice()*((endTimeLong-stateTimeLong)/(24*60*60*1000)));
		order.setPricecnt(price);
		boolean flag=orderServiceImpl.addOrders(order);
		
		 
		if(flag) {	
			out.print("<script type='text/javascript'>"
					+ "alert('Success');"+"location.href='"+contextPath + "/client/index.html';"
					+ "</script>");
			out.flush();
			out.close();
		}
		if(flag) {	
			out.print("<script type='text/javascript'>"
					+ "alert('Error');"+"location.href='"+contextPath + "/client/index.html';"
					+ "</script>");
			out.flush();
			out.close();
		}
    }
}
