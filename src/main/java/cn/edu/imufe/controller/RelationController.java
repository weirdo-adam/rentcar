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

import cn.edu.imufe.bean.Relation;
import cn.edu.imufe.bean.vo.RelationDetail;
import cn.edu.imufe.service.impl.RelationServiceImpl;

@Controller
@RequestMapping(value="/relation")
public class RelationController {
	@Autowired
	private RelationServiceImpl relationServiceImpl;
	
	/**
	 * 根据办事处ID获取所有办事处的车辆
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/getAllRelation")
    public void getAllRelation(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
        String id=request.getParameter("locationid");
		List<RelationDetail> lists = relationServiceImpl.selectAllRealtionDetail(Integer.parseInt(id));
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
	 * 根据关系ID获取办事处车辆关系信息
	 * @param request
	 * @param model
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/selectRelationDetail")
    public void selectRelationDetail(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String id=request.getParameter("relationid");
       RelationDetail temp=relationServiceImpl.selectRelationDetailById(Integer.parseInt(id));
       JSONObject jsonObject = new JSONObject();
		jsonObject.put("listData", temp);
		System.out.println(jsonObject);
		response.setContentType("text/json"); 
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json;character=UTF-8");
		response.getWriter().write(jsonObject.toString());
    }
	/**
	 * 新增办事处车辆关系信息
	 * 先判断该办事处是否已存在该车辆，如果存在则在原来的基础上增加，如果没有新增一条记录
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/addRelation")
    public String addRelation(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
     
       String carid=request.getParameter("carid");
       String locationid=request.getParameter("locationid");
       String cnt=request.getParameter("cnt");
       Relation flag=relationServiceImpl.selectByCarIdAndLocationId(Integer.parseInt(carid), Integer.parseInt(locationid));
       if(flag!=null) {
    	   flag.setCnt(flag.getCnt()+Integer.parseInt(cnt));
    	   relationServiceImpl.updateRelation(flag);
       }else {
    	   Relation temp=new Relation();
           temp.setCarid(Integer.parseInt(carid));
           temp.setCnt(Integer.parseInt(cnt));
           temp.setLocationid(Integer.parseInt(locationid));
           relationServiceImpl.addRelation(temp);
       }
       
       return "redirect:../management/relation_list.html";
      
    }
	/**
	 * 修改办事处车辆数量信息
	 * @param request
	 * @param model
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/updateRelation")
    public String updateRelation(HttpServletRequest request, Model model, HttpServletResponse response) throws IOException{
       String id=request.getParameter("relationid");
       String cnt=request.getParameter("cnt");
       Relation temp=new Relation();
       temp.setCnt(Integer.parseInt(cnt));
       temp.setId(Integer.parseInt(id));
       relationServiceImpl.updateRelation(temp);
       return "redirect:../management/relation_list.html";
      
    }
}
