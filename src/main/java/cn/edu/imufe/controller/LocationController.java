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
import cn.edu.imufe.service.impl.LocationServiceImpl;

@Controller
@RequestMapping(value="/location")
public class LocationController {
	@Autowired
	private LocationServiceImpl locationServiceImpl;
	/**
	 * 获取所有办事信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllLocation")
    public void getAllLocation(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
        List<Location> lists = locationServiceImpl.selectAll();
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
	 * 根据办事处ID获取办事处信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectLocation")
    public void selectLocation(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String id=request.getParameter("locationid");
       Location temp=locationServiceImpl.selectById(Integer.parseInt(id));
       JSONObject jsonObject = new JSONObject();
		jsonObject.put("listData", temp);
		System.out.println(jsonObject);
		response.setContentType("text/json"); 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;character=UTF-8");
		response.getWriter().write(jsonObject.toString());
    }
	/**
	 * 新增办事处
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/addLocation")
    public String addLocation(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String name=request.getParameter("locationname");
       if(name.isEmpty()) {
    	   return "redirect:../management/location_list.html";
    	      
       }
       Location temp=new Location();
       temp.setLocationname(name);
       locationServiceImpl.addLocation(temp);
       return "redirect:../management/location_list.html";
      
    }
	/**
	 * 修改办事处信息
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateLocation")
    public String updateLocation(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
       String id=request.getParameter("locationid");
       String name=request.getParameter("locationname");
       Location temp=new Location();
       temp.setLocationname(name);
       temp.setLocationid(Integer.parseInt(id));
       locationServiceImpl.updateById(temp);
       return "redirect:../management/location_list.html";
      
    }
}
