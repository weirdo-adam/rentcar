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

import cn.edu.imufe.bean.Car;
import cn.edu.imufe.bean.Car;
import cn.edu.imufe.bean.vo.CarDetail;
import cn.edu.imufe.service.impl.CarServiceImpl;

@Controller
@RequestMapping(value="/car")
public class CarController {
	@Autowired
	private CarServiceImpl carServiceImpl;
	/**
	 * 获取所有车辆信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllCar")
    public void getAllCar(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
        List<Car> lists = carServiceImpl.selectAll();
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
	 * 获取所有车辆详细信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllCarDetail")
    public void getAllCarDetail(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
        List<CarDetail> lists = carServiceImpl.selectAllCarDetail();
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
	 * 根据车辆ID获取车辆详细信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectCarDetail")
    public void selectCarDetail(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String id=request.getParameter("id");
       CarDetail temp=carServiceImpl.selectCarDetailById(Integer.parseInt(id));
       JSONObject jsonObject = new JSONObject();
		jsonObject.put("listData", temp);
		System.out.println(jsonObject);
		response.setContentType("text/json"); 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;character=UTF-8");
		response.getWriter().write(jsonObject.toString());
    }
	/**
	 * 新增车辆
	 * 图片上传待完成
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/addCar")
    public String addCar(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String typeid=request.getParameter("typeid");//车型
       String name=request.getParameter("name");//名称
       String brandid=request.getParameter("brandid");//品牌
       String seatcnt=request.getParameter("seatcnt");//座位数
       String gear=request.getParameter("gear");//档位类型
       String trunkcnt=request.getParameter("trunkcnt");//行李箱数
       String ridecnt=request.getParameter("ridecnt");//建议乘坐人数
       String price=request.getParameter("price");//日租价
       String surplusnum=request.getParameter("surplusnum");//剩余车辆数
       Car temp=new Car();
       temp.setCartypeid(Integer.parseInt(typeid));
       temp.setName(name);
       temp.setBrandid(Integer.parseInt(brandid));
       temp.setHot(0);
       temp.setSeatcnt(Integer.parseInt(seatcnt));
       temp.setGear(gear);
       temp.setTrunkcnt(Integer.parseInt(trunkcnt));
       temp.setRidecnt(Integer.parseInt(ridecnt));
       temp.setPrice(Integer.parseInt(price));
       temp.setSurplusnum(Integer.parseInt(surplusnum));
       carServiceImpl.addCar(temp);
       return "redirect:../management/car_list.html";
      
    }
	/**
	 * 修改车辆信息
	 * 图片上传待完成
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateCar")
    public String updateCar(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
		String id=request.getParameter("id"); 
		String typeid=request.getParameter("typeid");//车型
	       String name=request.getParameter("name");//名称
	       String brandid=request.getParameter("brandid");//品牌
	  
	       String seatcnt=request.getParameter("seatcnt");//座位数
	       String gear=request.getParameter("gear");//档位类型
	       String trunkcnt=request.getParameter("trunkcnt");//行李箱数
	       String ridecnt=request.getParameter("ridecnt");//建议乘坐人数
	       String price=request.getParameter("price");//日租价
	       String surplusnum=request.getParameter("surplusnum");//剩余车辆数
	       Car temp=new Car();
	       temp.setCartypeid(Integer.parseInt(typeid));
	       temp.setName(name);
	       temp.setBrandid(Integer.parseInt(brandid));
	       temp.setSeatcnt(Integer.parseInt(seatcnt));
	       temp.setGear(gear);
	       temp.setTrunkcnt(Integer.parseInt(trunkcnt));
	       temp.setRidecnt(Integer.parseInt(ridecnt));
	       temp.setPrice(Integer.parseInt(price));
	       temp.setSurplusnum(Integer.parseInt(surplusnum));
 
       temp.setId(Integer.parseInt(id));
       carServiceImpl.updateCar(temp);
       return "redirect:../management/car_list.html";
      
    }
}
