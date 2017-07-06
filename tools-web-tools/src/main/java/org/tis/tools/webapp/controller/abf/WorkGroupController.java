package org.tis.tools.webapp.controller.abf;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tis.tools.model.po.om.OmGroup;
import org.tis.tools.rservice.om.capable.IGroupRService;
import org.tis.tools.webapp.controller.BaseController;
import org.tis.tools.webapp.util.AjaxUtils;

import net.sf.json.JSONObject;

/**
 * 机构管理功能
 * @author 
 */
@Controller
@RequestMapping(value = "/om/workgroup")
public class WorkGroupController extends BaseController {
	@Autowired
	IGroupRService groupRService;
	
	/**
	 * 展示工作组树
	 * @param model
	 * @param content
	 * @param age
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/workgrouptree")
	public String workgroup(ModelMap model,  @RequestBody String content,
			String age, HttpServletRequest request, HttpServletResponse response) {
		try {
			//收到请求
			JSONObject jsonObj = JSONObject.fromObject(content);
			String id = jsonObj.getString("id");
			List<OmGroup> list = new ArrayList<OmGroup>();
			//通过id判断需要加载的节点
			if("#".equals(id)){
				//调用远程服务,#:根
				OmGroup og = new OmGroup();
				og.setGuid("00000");
				og.setGroupName("工作组树");
				list.add(og);
			}else if("00000".equals(id)){
				list = groupRService.queryRootGroup();
			}
			AjaxUtils.ajaxJson(response, net.sf.json.JSONArray.fromObject(list).toString());
			
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "查询根机构树失败!");
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 *新增根工作组
	 * @param model
	 * @param content
	 * @param age
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/add")
	public String add(ModelMap model,  @RequestBody String content,
			String age, HttpServletRequest request, HttpServletResponse response) {
		try {
			
			JSONObject jsonObj = JSONObject.fromObject(content);
			OmGroup og = new OmGroup();
			BeanUtils.populate(og, jsonObj);
			groupRService.createRootGroup(og);
			AjaxUtils.ajaxJsonSuccessMessage(response, "新增根工作组成功!");
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "新增根工作组失败!");
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 查询所有工作组列表
	 * @param model
	 * @param content
	 * @param age
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/queryall")
	public String queryall(ModelMap model,  HttpServletRequest request, HttpServletResponse response) {
		try {
			//查询所有工作组
			List<OmGroup> list = groupRService.queryAllGroup();
			List<Map> l = new ArrayList<Map>();
			for(OmGroup o : list ){
				Map m1 = BeanUtils.describe(o);
				l.add(m1);
			}
			AjaxUtils.ajaxJson(response, net.sf.json.JSONArray.fromObject(l).toString());
		} catch (Exception e) {// TODO
			AjaxUtils.ajaxJsonErrorMessage(response, "新增根工作组失败!");
			e.printStackTrace();
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
