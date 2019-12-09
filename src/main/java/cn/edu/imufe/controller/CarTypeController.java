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

import cn.edu.imufe.bean.CarType;
import cn.edu.imufe.service.impl.CarTypeServiceImpl;

@Controller
@RequestMapping(value="/carType")
public class CarTypeController {
	@Autowired
	private CarTypeServiceImpl carTypeServiceImpl;
	
	/**
	 * 获取所有类型信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllCarType")
    public void getAllcarType(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
        List<CarType> lists = carTypeServiceImpl.selectAll();
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
	 * 根据汽车类型ID获取汽车类型信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectCarType")
    public void selectcarType(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String id=request.getParameter("typeid");
       CarType temp=carTypeServiceImpl.selectById(Integer.parseInt(id));
       JSONObject jsonObject = new JSONObject();
		jsonObject.put("listData", temp);
		System.out.println(jsonObject);
		response.setContentType("text/json"); 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;character=UTF-8");
		response.getWriter().write(jsonObject.toString());
    }
	/**
	 * 新增汽车类型信息
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/addCarType")
    public String addcarType(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String name=request.getParameter("typename");
       if(name.isEmpty()) {
    	   return "redirect:../management/carType_list.html";
    	      
       }
       CarType temp=new CarType();
       temp.setTypename(name);
       carTypeServiceImpl.addCarType(temp);
       return "redirect:../management/carType_list.html";
      
    }
	/**
	 * 修改汽车类型信息
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateCarType")
    public String updatecarType(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
       String id=request.getParameter("typeid");
       String name=request.getParameter("typename");
       CarType temp=new CarType();
       temp.setTypename(name);
       temp.setTypeid(Integer.parseInt(id));
       carTypeServiceImpl.updateCarType(temp);
       return "redirect:../management/carType_list.html";
      
    }
}
