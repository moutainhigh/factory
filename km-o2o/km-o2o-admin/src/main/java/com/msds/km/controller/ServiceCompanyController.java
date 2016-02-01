package com.msds.km.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.msds.km.base.BaseController;
import com.msds.km.entity.ServiceCompanyEntity;
import com.msds.km.entity.ServiceEntity;
import com.msds.km.service.CompanyService;
import com.msds.km.service.ServiceCompanyService;
import com.msds.km.service.ServiceService;
 
/**
 * 
 * <br>
 * <b>功能：</b>ServiceCompanyController<br>
 * <b>作者：</b>lilong<br>
 * <b>日期：</b> 2015-04-24 16:54:33 <br>
 * <b>版权所有：<b>版权所有(C) 2014，wwww.minshengec.com<br>
 * <b>此类为自动生成<br>
 */ 
@Controller
@RequestMapping("/serviceCompany") 
public class ServiceCompanyController extends BaseController{
	
	@Autowired
	private ServiceCompanyService serviceCompanyService; 
	
	@Autowired
	private CompanyService companyService; 
	
	@Autowired
	private ServiceService serviceService; 
	
	/**
	 * 跳转列表
	 * 
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list") 
	public ModelAndView list(HttpServletRequest request) throws Exception{
		return forword("/km/serviceCompany/serviceCompany_list",null); 
	}
	
	/**
	 * 列表数据
	 * 
	 * @param entity
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/dataList")
	@ResponseBody
	public Object datalist(ServiceCompanyEntity entity,HttpServletRequest request) throws Exception{
		List<ServiceCompanyEntity> dataList = serviceCompanyService.queryByList(entity);
		return returnDataGrid(entity.getPager().getRowCount(), dataList);
	}
	
	/**
	 * 添加或修改数据
	 *
	 * @param entity
	 * @param request
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Object save(@RequestBody ServiceCompanyEntity entity, HttpServletRequest request) throws Exception{
		Date date = new Date();
		if(entity.getId()==null||StringUtils.isBlank(entity.getId().toString())){
			entity.setCreateDate(date);
			entity.setModifyDate(date);
			serviceCompanyService.add(entity);
		}else{
			entity.setModifyDate(date);
			serviceCompanyService.update(entity);
		}
		return sendSuccessMessage();
	}
	
	/**
	 * 获取数据
	 * 
	 * @param id
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getId")
	@ResponseBody
	public Object getId(String id,HttpServletRequest request) throws Exception{
		ServiceCompanyEntity entity  = serviceCompanyService.findById(id);
		if(entity  == null){
			return sendFailureMessage("没有找到对应的记录!");
		}
		return entity;
	}

	/**
	 * 删除数据
	 * 
	 * @param id
	 * @param request
	 * @return
	 * @throws Exception
	 */	
	@RequestMapping("/delete")
	@ResponseBody
	public Object delete(String[] id,HttpServletRequest request) throws Exception{
		serviceCompanyService.delete(id);
		return sendSuccessMessage();
	}
	@RequestMapping("/deleteService")
	@ResponseBody
	public Object deleteService(String[] id,HttpServletRequest request) throws Exception{
		serviceCompanyService.delete(id);
		return "success";
	}
	
	@RequestMapping("/putatayService")
	@ResponseBody
	public Object putatayService(String[] id,Integer cId,HttpServletRequest request) throws Exception{
		
		for (int i = 0,s=id.length; i <s ; i++) {
			ServiceEntity serviceEntity = new ServiceEntity();
			serviceEntity.setServiceCode(id[i]);
			ServiceEntity ss =  serviceService.findListByCondition(serviceEntity).get(0);
			
			ServiceCompanyEntity t = new ServiceCompanyEntity();
			t.setServiceCode(id[i]);
			t.setCompanyId(cId);
			t.setServiceName(ss.getServiceName());
			t.setCreateDate(new Date());
			t.setModifyDate(new Date());
			
			
			serviceCompanyService.add(t);
		}
		return "success";
	}
}
