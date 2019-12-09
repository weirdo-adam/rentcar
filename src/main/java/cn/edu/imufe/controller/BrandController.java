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

import cn.edu.imufe.bean.Brand;
import cn.edu.imufe.service.impl.BrandServiceImpl;

@Controller
@RequestMapping(value="/brand")
public class BrandController {
	@Autowired
	private BrandServiceImpl brandServiceImpl;
	
	/**
	 * 获取所有品牌信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllBrand")
    public void getAllBrand(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
        List<Brand> lists = brandServiceImpl.selectAll();
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
	 * 根据品牌ID获取品牌信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectBrand")
    public void selectBrand(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String id=request.getParameter("brandid");
       Brand temp=brandServiceImpl.selectById(Integer.parseInt(id));
       JSONObject jsonObject = new JSONObject();
		jsonObject.put("listData", temp);
		System.out.println(jsonObject);
		response.setContentType("text/json"); 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;character=UTF-8");
		response.getWriter().write(jsonObject.toString());
    }
	/**
	 * 新增汽车品牌信息
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/addBrand")
    public String addBrand(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String name=request.getParameter("brandname");
       if(name.isEmpty()) {
    	   return "redirect:../management/brand_list.html";
    	      
       }
       Brand temp=new Brand();
       temp.setBrandname(name);
       brandServiceImpl.addBrand(temp);
       return "redirect:../management/brand_list.html";
      
    }
	/**
	 * 修改汽车品牌信息
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateBrand")
    public String updateBrand(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
       String id=request.getParameter("brandid");
       String name=request.getParameter("brandname");
       Brand temp=new Brand();
       temp.setBrandname(name);
       temp.setBrandid(Integer.parseInt(id));
       brandServiceImpl.updateBrand(temp);
       return "redirect:../management/brand_list.html";
      
    }
}
