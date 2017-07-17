
/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.webapp.controller.abf;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.base.exception.ToolsRuntimeException;
import org.tis.tools.common.utils.StringUtil;
import org.tis.tools.model.po.om.OmGroup;
import org.tis.tools.model.po.om.OmOrg;
import org.tis.tools.model.po.om.OmPosition;
import org.tis.tools.rservice.om.capable.IOrgRService;
import org.tis.tools.webapp.controller.BaseController;
import org.tis.tools.webapp.util.AjaxUtils;
import org.tis.tools.webapp.util.JsonDateProcessor;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * 机构管理功能
 * @author 
 */
@Controller
@RequestMapping(value = "/om/org")
public class OrgManagerController extends BaseController {

	@Autowired
	IOrgRService orgRService;
	
	/**
	 * 展示机构树
	 * @param model
	 * @param content
	 * @param age
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/tree")
	public String execute(ModelMap model,  @RequestBody String content,
			String age, HttpServletRequest request, HttpServletResponse response) {
		try {
			//收到请求
			JSONObject jsonObj = JSONObject.fromObject(content);
			String id = jsonObj.getString("id");
			List<OmOrg> rootOrgs = new ArrayList<OmOrg>();
			List<OmPosition> omp = new ArrayList<OmPosition>();
			//通过id判断需要加载的节点
			if("#".equals(id)){
				//调用远程服务,#:根
				rootOrgs = orgRService.queryAllRoot() ;
			}else if(id.startsWith("@")){
				//TODO
				//返回机构下岗位信息.根据id查询岗位信息并返回生成树节点.
				omp = new ArrayList<OmPosition>();
				for(int i = 2;i<5;i++){
					OmPosition op = new OmPosition();
					op.setGuid("@"+String.valueOf(i));
					op.setPositionCode(String.valueOf(i));
					op.setPositionName("岗位"+String.valueOf(i)+"号");
					omp.add(op);
				}
			 
			}else{
				rootOrgs = orgRService.queryChilds(id);
				OmOrg og = new OmOrg();
				//为每一个节点增加岗位信息节点
				og.setOrgName("岗位信息");
				og.setOrgCode("@"+id);
				rootOrgs.add(og);
			}
			if(rootOrgs == null || rootOrgs.isEmpty()){
				AjaxUtils.ajaxJson(response, net.sf.json.JSONArray.fromObject(omp).toString());
			}else{
				AjaxUtils.ajaxJson(response, net.sf.json.JSONArray.fromObject(rootOrgs).toString());
			}
			
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "查询根机构树失败!");
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 展示筛选机构树
	 * @param model
	 * @param content
	 * @param age
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/search")
	public String search(ModelMap model,  @RequestBody String content,
			String age, HttpServletRequest request, HttpServletResponse response) {
		try {
			//收到请求
			JSONObject jsonObj = JSONObject.fromObject(content);
			String id = jsonObj.getString("id");
			String name = jsonObj.getString("searchitem");
			List<OmOrg> rootOrgs = new ArrayList<OmOrg>();
			List<OmPosition> omp = new ArrayList<OmPosition>();
			//通过id判断需要加载的节点
			if("#".equals(id)){
				//调用远程服务,#:根,筛选
				WhereCondition wc = new WhereCondition();
				wc.andEquals("GUID", name);
				rootOrgs = orgRService.queryOrgsByCondition(wc);
			}else if(id.startsWith("@")){
				//TODO
				//返回机构下岗位信息.根据id查询岗位信息并返回生成树节点.
				omp = new ArrayList<OmPosition>();
				for(int i = 2;i<5;i++){
					OmPosition op = new OmPosition();
					op.setGuid("@"+String.valueOf(i));
					op.setPositionCode(String.valueOf(i));
					op.setPositionName("岗位"+String.valueOf(i)+"号");
					omp.add(op);
				}
			 
			}else{
				rootOrgs = orgRService.queryChilds(id);
				OmOrg og = new OmOrg();
				//为每一个节点增加岗位信息节点
				og.setOrgName("岗位信息");
				og.setOrgCode("@"+id);
				rootOrgs.add(og);
			}
			if(rootOrgs == null || rootOrgs.isEmpty()){
				AjaxUtils.ajaxJson(response, net.sf.json.JSONArray.fromObject(omp).toString());
			}else{
				AjaxUtils.ajaxJson(response, net.sf.json.JSONArray.fromObject(rootOrgs).toString());
			}
			
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "查询根机构树失败!");
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	@RequestMapping(value = "/add")
	public String execute1(ModelMap model,  @RequestBody String content,
			String age, HttpServletRequest request, HttpServletResponse response) {
		try {
			//收到请求
			//JsonConfig jsonConfig = new JsonConfig();  
//			JsonDateProcessor jdp = new JsonDateProcessor("yyyy-MM-dd");
//		    jsonConfig.registerJsonValueProcessor(Date.class, jdp);   
			JSONObject jsonObj = JSONObject.fromObject(content);
			Map map = jsonObj;
			Date startDate = null;
			Date endDate = null;
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			if(map.get("startDate") != null) {
				startDate = sf.parse(map.remove("startDate").toString());
			}
			if(map.get("endDate") != null) {
				endDate = sf.parse(map.remove("endDate").toString());
			}
			OmOrg og = new OmOrg();
			BeanUtils.populate(og, map);
			System.out.println(og);
			og.setEndDate(endDate);
			og.setStartDate(startDate);
			orgRService.createChildOrg(og);
			
			AjaxUtils.ajaxJsonSuccessMessage(response, "新增成功!");
		} catch (ToolsRuntimeException e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response,e.getCode(), e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			AjaxUtils.ajaxJsonErrorMessage(response,"SYS_0001", e.getMessage());
		}
		return null;
	}
	
	
	@RequestMapping(value = "/initcode")
	public String test(ModelMap model,  @RequestBody String content,
			String age, HttpServletRequest request, HttpServletResponse response) {
		try {
//			Map<String, Object> result = new HashMap<String, Object>();
			//收到请求
			JSONObject jsonObj = JSONObject.fromObject(content);
			String orgDegree = jsonObj.getString("orgDegree");
			String AREA = jsonObj.getString("AREA");
			String orgCode = orgRService.genOrgCode(AREA, orgDegree, null);
//			result.put("data", orgCode);
			AjaxUtils.ajaxJsonSuccessMessage(response, orgCode);
		} catch (ToolsRuntimeException e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response,e.getCode(), e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			AjaxUtils.ajaxJsonErrorMessage(response,"SYS_0001", e.getMessage());
		}
		return null;
	}
	
	
	
	/**
	 * 每个controller定义自己的返回信息变量
	 */
	private Map<String, Object> responseMsg ;
	@Override
	public Map<String, Object> getResponseMessage() {
		if( null == responseMsg ){
			responseMsg = new HashMap<String, Object> () ;
		}
		return responseMsg ;
	}
}