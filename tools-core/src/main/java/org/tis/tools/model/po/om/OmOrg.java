/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.om;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.tis.tools.common.utils.StringUtil;

/**
 * 
 * <pre>
 * 机构信息表
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：om
 * 模型：OM_ORG 机构信息表
 *
 * 机构部门（Organization）表
允许定义多个平行机构
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class OmOrg implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "OM_ORG" ; 
	/* OM_ORG table's columns definition */
	/** GUID ：数据主键<br/><br/>全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	public static final String COLUMN_GUID = "guid" ; 
	/** ORG_CODE ：机构代码<br/><br/>业务上对机构实体的编码。 一般根据机构等级和机构类型进行有规则的编码。 */
	public static final String COLUMN_ORG_CODE = "org_code" ; 
	/** ORG_NAME ：机构名称<br/><br/> */
	public static final String COLUMN_ORG_NAME = "org_name" ; 
	/** ORG_TYPE ：机构类型<br/><br/>见业务字典： DICT_OM_ORGTYPE 如：总公司/总部部门/分公司/分公司部门... */
	public static final String COLUMN_ORG_TYPE = "org_type" ; 
	/** ORG_DEGREE ：机构等级<br/><br/>见业务字典： DICT_OM_ORGDEGREE 如：总行，分行，海外分行... */
	public static final String COLUMN_ORG_DEGREE = "org_degree" ; 
	/** ORG_STATUS ：机构状态<br/><br/>见业务字典： DICT_OM_ORGSTATUS */
	public static final String COLUMN_ORG_STATUS = "org_status" ; 
	/** ORG_LEVEL ：机构层次<br/><br/> */
	public static final String COLUMN_ORG_LEVEL = "org_level" ; 
	/** GUID_PARENTS ：父机构GUID<br/><br/> */
	public static final String COLUMN_GUID_PARENTS = "guid_parents" ; 
	/** ORG_SEQ ：机构序列<br/><br/>类似面包屑导航，以“.”分割所有父机构GUID，明确示意出本机构所处层级归属 格式： 父机构GUID.父机构GUID....本机构GUID */
	public static final String COLUMN_ORG_SEQ = "org_seq" ; 
	/** ORG_ADDR ：机构地址<br/><br/> */
	public static final String COLUMN_ORG_ADDR = "org_addr" ; 
	/** ZIPCODE ：邮编<br/><br/>见业务字典： DICT_SD_ZIPCODE */
	public static final String COLUMN_ZIPCODE = "zipcode" ; 
	/** GUID_POSITION ：机构主管岗位GUID<br/><br/> */
	public static final String COLUMN_GUID_POSITION = "guid_position" ; 
	/** GUID_EMP_MASTER ：机构主管人员GUID<br/><br/> */
	public static final String COLUMN_GUID_EMP_MASTER = "guid_emp_master" ; 
	/** GUID_EMP_MANAGER ：机构管理员GUID<br/><br/>机构管理员能够给本机构的人员进行授权，多个机构管理员之间用,分隔 */
	public static final String COLUMN_GUID_EMP_MANAGER = "guid_emp_manager" ; 
	/** LINK_MAN ：联系人姓名<br/><br/> */
	public static final String COLUMN_LINK_MAN = "link_man" ; 
	/** LINK_TEL ：联系电话<br/><br/> */
	public static final String COLUMN_LINK_TEL = "link_tel" ; 
	/** EMAIL ：电子邮件<br/><br/> */
	public static final String COLUMN_EMAIL = "email" ; 
	/** WEB_URL ：网站地址<br/><br/> */
	public static final String COLUMN_WEB_URL = "web_url" ; 
	/** START_DATE ：生效日期<br/><br/> */
	public static final String COLUMN_START_DATE = "start_date" ; 
	/** END_DATE ：失效日期<br/><br/> */
	public static final String COLUMN_END_DATE = "end_date" ; 
	/** AREA ：所属地域<br/><br/>见业务字典： DICT_SD_AREA */
	public static final String COLUMN_AREA = "area" ; 
	/** CREATE_TIME ：创建时间<br/><br/> */
	public static final String COLUMN_CREATE_TIME = "create_time" ; 
	/** LAST_UPDATE ：最近更新时间<br/><br/> */
	public static final String COLUMN_LAST_UPDATE = "last_update" ; 
	/** UPDATOR ：最近更新人员<br/><br/> */
	public static final String COLUMN_UPDATOR = "updator" ; 
	/** SORT_NO ：排列顺序编号<br/><br/>维护时，可手工指定从0开始的自然数字；如果为空，系统将按照机构代码排序。 */
	public static final String COLUMN_SORT_NO = "sort_no" ; 
	/** ISLEAF ：是否叶子节点<br/><br/>系统根据当前是否有下级机构判断更新（见业务字典 DICT_YON） */
	public static final String COLUMN_ISLEAF = "isleaf" ; 
	/** SUB_COUNT ：子节点数<br/><br/>维护时系统根据当前拥有子机构／部分数实时更新 */
	public static final String COLUMN_SUB_COUNT = "sub_count" ; 
	/** REMARK ：备注<br/><br/> */
	public static final String COLUMN_REMARK = "remark" ; 
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：机构代码<br/>描述：业务上对机构实体的编码。 一般根据机构等级和机构类型进行有规则的编码。 */
	private String orgCode ;
	
	/** 字段类型：varchar<br/>字段名：机构名称<br/>描述： */
	private String orgName ;
	
	/** 字段类型：varchar<br/>字段名：机构类型<br/>描述：见业务字典： DICT_OM_ORGTYPE 如：总公司/总部部门/分公司/分公司部门... */
	private String orgType ;
	
	/** 字段类型：varchar<br/>字段名：机构等级<br/>描述：见业务字典： DICT_OM_ORGDEGREE 如：总行，分行，海外分行... */
	private String orgDegree ;
	
	/** 字段类型：varchar<br/>字段名：机构状态<br/>描述：见业务字典： DICT_OM_ORGSTATUS */
	private String orgStatus ;
	
	/** 字段类型：decimal<br/>字段名：机构层次<br/>描述： */
	private BigDecimal orgLevel ;
	
	/** 字段类型：varchar<br/>字段名：父机构GUID<br/>描述： */
	private String guidParents ;
	
	/** 字段类型：varchar<br/>字段名：机构序列<br/>描述：类似面包屑导航，以“.”分割所有父机构GUID，明确示意出本机构所处层级归属 格式： 父机构GUID.父机构GUID....本机构GUID */
	private String orgSeq ;
	
	/** 字段类型：varchar<br/>字段名：机构地址<br/>描述： */
	private String orgAddr ;
	
	/** 字段类型：varchar<br/>字段名：邮编<br/>描述：见业务字典： DICT_SD_ZIPCODE */
	private String zipcode ;
	
	/** 字段类型：varchar<br/>字段名：机构主管岗位GUID<br/>描述： */
	private String guidPosition ;
	
	/** 字段类型：varchar<br/>字段名：机构主管人员GUID<br/>描述： */
	private String guidEmpMaster ;
	
	/** 字段类型：varchar<br/>字段名：机构管理员GUID<br/>描述：机构管理员能够给本机构的人员进行授权，多个机构管理员之间用,分隔 */
	private String guidEmpManager ;
	
	/** 字段类型：varchar<br/>字段名：联系人姓名<br/>描述： */
	private String linkMan ;
	
	/** 字段类型：varchar<br/>字段名：联系电话<br/>描述： */
	private String linkTel ;
	
	/** 字段类型：varchar<br/>字段名：电子邮件<br/>描述： */
	private String email ;
	
	/** 字段类型：varchar<br/>字段名：网站地址<br/>描述： */
	private String webUrl ;
	
	/** 字段类型：date<br/>字段名：生效日期<br/>描述： */
	private Date startDate ;
	
	/** 字段类型：date<br/>字段名：失效日期<br/>描述： */
	private Date endDate ;
	
	/** 字段类型：varchar<br/>字段名：所属地域<br/>描述：见业务字典： DICT_SD_AREA */
	private String area ;
	
	/** 字段类型：timestamp<br/>字段名：创建时间<br/>描述： */
	private Date createTime ;
	
	/** 字段类型：timestamp<br/>字段名：最近更新时间<br/>描述： */
	private Date lastUpdate ;
	
	/** 字段类型：varchar<br/>字段名：最近更新人员<br/>描述： */
	private String updator ;
	
	/** 字段类型：decimal<br/>字段名：排列顺序编号<br/>描述：维护时，可手工指定从0开始的自然数字；如果为空，系统将按照机构代码排序。 */
	private BigDecimal sortNo ;
	
	/** 字段类型：char<br/>字段名：是否叶子节点<br/>描述：系统根据当前是否有下级机构判断更新（见业务字典 DICT_YON） */
	private String isleaf ;
	
	/** 字段类型：decimal<br/>字段名：子节点数<br/>描述：维护时系统根据当前拥有子机构／部分数实时更新 */
	private BigDecimal subCount ;
	
	/** 字段类型：varchar<br/>字段名：备注<br/>描述： */
	private String remark ;
	
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guid
	 *            数据主键
	 */
	public void setGuid(String guid) {
 		this.guid = guid == null ? null : guid.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuid(){
		return this.guid ;
    }
	
	/**
	 * Set the 机构代码.
	 * 
	 * @param orgCode
	 *            机构代码
	 */
	public void setOrgCode(String orgCode) {
 		this.orgCode = orgCode == null ? null : orgCode.trim() ;
    }
    
    /**
	 * Get the 机构代码.
	 * 
	 * @return 机构代码
	 */
	public String getOrgCode(){
		return this.orgCode ;
    }
	
	/**
	 * Set the 机构名称.
	 * 
	 * @param orgName
	 *            机构名称
	 */
	public void setOrgName(String orgName) {
 		this.orgName = orgName == null ? null : orgName.trim() ;
    }
    
    /**
	 * Get the 机构名称.
	 * 
	 * @return 机构名称
	 */
	public String getOrgName(){
		return this.orgName ;
    }
	
	/**
	 * Set the 机构类型.
	 * 
	 * @param orgType
	 *            机构类型
	 */
	public void setOrgType(String orgType) {
 		this.orgType = orgType == null ? null : orgType.trim() ;
    }
    
    /**
	 * Get the 机构类型.
	 * 
	 * @return 机构类型
	 */
	public String getOrgType(){
		return this.orgType ;
    }
	
	/**
	 * Set the 机构等级.
	 * 
	 * @param orgDegree
	 *            机构等级
	 */
	public void setOrgDegree(String orgDegree) {
 		this.orgDegree = orgDegree == null ? null : orgDegree.trim() ;
    }
    
    /**
	 * Get the 机构等级.
	 * 
	 * @return 机构等级
	 */
	public String getOrgDegree(){
		return this.orgDegree ;
    }
	
	/**
	 * Set the 机构状态.
	 * 
	 * @param orgStatus
	 *            机构状态
	 */
	public void setOrgStatus(String orgStatus) {
 		this.orgStatus = orgStatus == null ? null : orgStatus.trim() ;
    }
    
    /**
	 * Get the 机构状态.
	 * 
	 * @return 机构状态
	 */
	public String getOrgStatus(){
		return this.orgStatus ;
    }
	
	/**
	 * Set the 机构层次.
	 * 
	 * @param orgLevel
	 *            机构层次
	 */
	public void setOrgLevel(BigDecimal orgLevel) {
 		this.orgLevel = orgLevel ;
    }
    
    /**
	 * Get the 机构层次.
	 * 
	 * @return 机构层次，如果setOrgLevel时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getOrgLevel(){
		if(orgLevel==null){
			return new BigDecimal(0d);
		}
		return orgLevel;
    }
	
	/**
	 * Set the 父机构GUID.
	 * 
	 * @param guidParents
	 *            父机构GUID
	 */
	public void setGuidParents(String guidParents) {
 		this.guidParents = guidParents == null ? null : guidParents.trim() ;
    }
    
    /**
	 * Get the 父机构GUID.
	 * 
	 * @return 父机构GUID
	 */
	public String getGuidParents(){
		return this.guidParents ;
    }
	
	/**
	 * Set the 机构序列.
	 * 
	 * @param orgSeq
	 *            机构序列
	 */
	public void setOrgSeq(String orgSeq) {
 		this.orgSeq = orgSeq == null ? null : orgSeq.trim() ;
    }
    
    /**
	 * Get the 机构序列.
	 * 
	 * @return 机构序列
	 */
	public String getOrgSeq(){
		return this.orgSeq ;
    }
	
	/**
	 * Set the 机构地址.
	 * 
	 * @param orgAddr
	 *            机构地址
	 */
	public void setOrgAddr(String orgAddr) {
 		this.orgAddr = orgAddr == null ? null : orgAddr.trim() ;
    }
    
    /**
	 * Get the 机构地址.
	 * 
	 * @return 机构地址
	 */
	public String getOrgAddr(){
		return this.orgAddr ;
    }
	
	/**
	 * Set the 邮编.
	 * 
	 * @param zipcode
	 *            邮编
	 */
	public void setZipcode(String zipcode) {
 		this.zipcode = zipcode == null ? null : zipcode.trim() ;
    }
    
    /**
	 * Get the 邮编.
	 * 
	 * @return 邮编
	 */
	public String getZipcode(){
		return this.zipcode ;
    }
	
	/**
	 * Set the 机构主管岗位GUID.
	 * 
	 * @param guidPosition
	 *            机构主管岗位GUID
	 */
	public void setGuidPosition(String guidPosition) {
 		this.guidPosition = guidPosition == null ? null : guidPosition.trim() ;
    }
    
    /**
	 * Get the 机构主管岗位GUID.
	 * 
	 * @return 机构主管岗位GUID
	 */
	public String getGuidPosition(){
		return this.guidPosition ;
    }
	
	/**
	 * Set the 机构主管人员GUID.
	 * 
	 * @param guidEmpMaster
	 *            机构主管人员GUID
	 */
	public void setGuidEmpMaster(String guidEmpMaster) {
 		this.guidEmpMaster = guidEmpMaster == null ? null : guidEmpMaster.trim() ;
    }
    
    /**
	 * Get the 机构主管人员GUID.
	 * 
	 * @return 机构主管人员GUID
	 */
	public String getGuidEmpMaster(){
		return this.guidEmpMaster ;
    }
	
	/**
	 * Set the 机构管理员GUID.
	 * 
	 * @param guidEmpManager
	 *            机构管理员GUID
	 */
	public void setGuidEmpManager(String guidEmpManager) {
 		this.guidEmpManager = guidEmpManager == null ? null : guidEmpManager.trim() ;
    }
    
    /**
	 * Get the 机构管理员GUID.
	 * 
	 * @return 机构管理员GUID
	 */
	public String getGuidEmpManager(){
		return this.guidEmpManager ;
    }
	
	/**
	 * Set the 联系人姓名.
	 * 
	 * @param linkMan
	 *            联系人姓名
	 */
	public void setLinkMan(String linkMan) {
 		this.linkMan = linkMan == null ? null : linkMan.trim() ;
    }
    
    /**
	 * Get the 联系人姓名.
	 * 
	 * @return 联系人姓名
	 */
	public String getLinkMan(){
		return this.linkMan ;
    }
	
	/**
	 * Set the 联系电话.
	 * 
	 * @param linkTel
	 *            联系电话
	 */
	public void setLinkTel(String linkTel) {
 		this.linkTel = linkTel == null ? null : linkTel.trim() ;
    }
    
    /**
	 * Get the 联系电话.
	 * 
	 * @return 联系电话
	 */
	public String getLinkTel(){
		return this.linkTel ;
    }
	
	/**
	 * Set the 电子邮件.
	 * 
	 * @param email
	 *            电子邮件
	 */
	public void setEmail(String email) {
 		this.email = email == null ? null : email.trim() ;
    }
    
    /**
	 * Get the 电子邮件.
	 * 
	 * @return 电子邮件
	 */
	public String getEmail(){
		return this.email ;
    }
	
	/**
	 * Set the 网站地址.
	 * 
	 * @param webUrl
	 *            网站地址
	 */
	public void setWebUrl(String webUrl) {
 		this.webUrl = webUrl == null ? null : webUrl.trim() ;
    }
    
    /**
	 * Get the 网站地址.
	 * 
	 * @return 网站地址
	 */
	public String getWebUrl(){
		return this.webUrl ;
    }
	
	/**
	 * Set the 生效日期.
	 * 
	 * @param startDate
	 *            生效日期
	 */
	public void setStartDate(Date startDate) {
 		this.startDate = startDate ;
    }
    
    /**
	 * Get the 生效日期.
	 * 
	 * @return 生效日期
	 */
	public Date getStartDate(){
		return this.startDate ;
    }
	
	/**
	 * Set the 失效日期.
	 * 
	 * @param endDate
	 *            失效日期
	 */
	public void setEndDate(Date endDate) {
 		this.endDate = endDate ;
    }
    
    /**
	 * Get the 失效日期.
	 * 
	 * @return 失效日期
	 */
	public Date getEndDate(){
		return this.endDate ;
    }
	
	/**
	 * Set the 所属地域.
	 * 
	 * @param area
	 *            所属地域
	 */
	public void setArea(String area) {
 		this.area = area == null ? null : area.trim() ;
    }
    
    /**
	 * Get the 所属地域.
	 * 
	 * @return 所属地域
	 */
	public String getArea(){
		return this.area ;
    }
	
	/**
	 * Set the 创建时间.
	 * 
	 * @param createTime
	 *            创建时间
	 */
	public void setCreateTime(Date createTime) {
 		this.createTime = createTime ;
    }
    
    /**
	 * Get the 创建时间.
	 * 
	 * @return 创建时间
	 */
	public Date getCreateTime(){
		return this.createTime ;
    }
	
	/**
	 * Set the 最近更新时间.
	 * 
	 * @param lastUpdate
	 *            最近更新时间
	 */
	public void setLastUpdate(Date lastUpdate) {
 		this.lastUpdate = lastUpdate ;
    }
    
    /**
	 * Get the 最近更新时间.
	 * 
	 * @return 最近更新时间
	 */
	public Date getLastUpdate(){
		return this.lastUpdate ;
    }
	
	/**
	 * Set the 最近更新人员.
	 * 
	 * @param updator
	 *            最近更新人员
	 */
	public void setUpdator(String updator) {
 		this.updator = updator == null ? null : updator.trim() ;
    }
    
    /**
	 * Get the 最近更新人员.
	 * 
	 * @return 最近更新人员
	 */
	public String getUpdator(){
		return this.updator ;
    }
	
	/**
	 * Set the 排列顺序编号.
	 * 
	 * @param sortNo
	 *            排列顺序编号
	 */
	public void setSortNo(BigDecimal sortNo) {
 		this.sortNo = sortNo ;
    }
    
    /**
	 * Get the 排列顺序编号.
	 * 
	 * @return 排列顺序编号，如果setSortNo时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getSortNo(){
		if(sortNo==null){
			return new BigDecimal(0d);
		}
		return sortNo;
    }
	
	/**
	 * Set the 是否叶子节点.
	 * 
	 * @param isleaf
	 *            是否叶子节点
	 */
	public void setIsleaf(String isleaf) {
 		this.isleaf = isleaf == null ? null : isleaf.trim() ;
    }
    
    /**
	 * Get the 是否叶子节点.
	 * 
	 * @return 是否叶子节点
	 */
	public String getIsleaf(){
		return this.isleaf ;
    }
	
	/**
	 * Set the 子节点数.
	 * 
	 * @param subCount
	 *            子节点数
	 */
	public void setSubCount(BigDecimal subCount) {
 		this.subCount = subCount ;
    }
    
    /**
	 * Get the 子节点数.
	 * 
	 * @return 子节点数，如果setSubCount时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getSubCount(){
		if(subCount==null){
			return new BigDecimal(0d);
		}
		return subCount;
    }
	
	/**
	 * Set the 备注.
	 * 
	 * @param remark
	 *            备注
	 */
	public void setRemark(String remark) {
 		this.remark = remark == null ? null : remark.trim() ;
    }
    
    /**
	 * Get the 备注.
	 * 
	 * @return 备注
	 */
	public String getRemark(){
		return this.remark ;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}