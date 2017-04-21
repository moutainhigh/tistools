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
 * 工作组
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：om
 * 模型：OM_GROUP 工作组
 *
 * 工作组定义表，用于定义临时组、虚拟组，跨部门的项目组等。
工作组实质上与机构类似，是为了将项目组、工作组等临时性的组织机构管理起来，业务上通常工作组有一定的时效性，是一个非常设机构。
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class OmGroup implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/* OM_GROUP table's columns definition */
	/** GUID ：数据主键<br/><br/>全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	public static final String GUID = "guid" ; 
	/** GROUP_CODE ：工作组代码<br/><br/>业务上对工作组的编码 */
	public static final String GROUP_CODE = "group_code" ; 
	/** GROUP_NAME ：工作组名称<br/><br/> */
	public static final String GROUP_NAME = "group_name" ; 
	/** GROUP_TYPE ：工作组类型<br/><br/>见业务字典： DICT_OM_GROUPTYPE */
	public static final String GROUP_TYPE = "group_type" ; 
	/** GROUP_STATUS ：工作组状态<br/><br/>见业务字典： DICT_OM_GROUPSTATUS */
	public static final String GROUP_STATUS = "group_status" ; 
	/** GROUP_DESC ：工作组描述<br/><br/> */
	public static final String GROUP_DESC = "group_desc" ; 
	/** GUID_EMP_MANAGER ：负责人<br/><br/>选择范围来自 OM_EMPLOYEE表 */
	public static final String GUID_EMP_MANAGER = "guid_emp_manager" ; 
	/** GUID_ORG ：隶属机构GUID<br/><br/> */
	public static final String GUID_ORG = "guid_org" ; 
	/** GUID_PARENTS ：父工作组GUID<br/><br/> */
	public static final String GUID_PARENTS = "guid_parents" ; 
	/** ISLEAF ：是否叶子节点<br/><br/>见业务菜单： DICT_YON */
	public static final String ISLEAF = "isleaf" ; 
	/** SUB_COUNT ：子节点数<br/><br/> */
	public static final String SUB_COUNT = "sub_count" ; 
	/** GROUP_LEVEL ：工作组层次<br/><br/> */
	public static final String GROUP_LEVEL = "group_level" ; 
	/** GROUP_SEQ ：工作组序列<br/><br/>本工作组的面包屑定位信息 */
	public static final String GROUP_SEQ = "group_seq" ; 
	/** START_DATE ：工作组有效开始日期<br/><br/> */
	public static final String START_DATE = "start_date" ; 
	/** END_DATE ：工作组有效截止日期<br/><br/> */
	public static final String END_DATE = "end_date" ; 
	/** CREATETIME ：创建时间<br/><br/> */
	public static final String CREATETIME = "createtime" ; 
	/** LASTUPDATE ：最近更新时间<br/><br/> */
	public static final String LASTUPDATE = "lastupdate" ; 
	/** UPDATOR ：最近更新人员<br/><br/> */
	public static final String UPDATOR = "updator" ; 
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：工作组代码<br/>描述：业务上对工作组的编码 */
	private String groupCode ;
	
	/** 字段类型：varchar<br/>字段名：工作组名称<br/>描述： */
	private String groupName ;
	
	/** 字段类型：varchar<br/>字段名：工作组类型<br/>描述：见业务字典： DICT_OM_GROUPTYPE */
	private String groupType ;
	
	/** 字段类型：varchar<br/>字段名：工作组状态<br/>描述：见业务字典： DICT_OM_GROUPSTATUS */
	private String groupStatus ;
	
	/** 字段类型：varchar<br/>字段名：工作组描述<br/>描述： */
	private String groupDesc ;
	
	/** 字段类型：varchar<br/>字段名：负责人<br/>描述：选择范围来自 OM_EMPLOYEE表 */
	private String guidEmpManager ;
	
	/** 字段类型：varchar<br/>字段名：隶属机构GUID<br/>描述： */
	private String guidOrg ;
	
	/** 字段类型：varchar<br/>字段名：父工作组GUID<br/>描述： */
	private String guidParents ;
	
	/** 字段类型：char<br/>字段名：是否叶子节点<br/>描述：见业务菜单： DICT_YON */
	private String isleaf ;
	
	/** 字段类型：decimal<br/>字段名：子节点数<br/>描述： */
	private BigDecimal subCount ;
	
	/** 字段类型：decimal<br/>字段名：工作组层次<br/>描述： */
	private BigDecimal groupLevel ;
	
	/** 字段类型：varchar<br/>字段名：工作组序列<br/>描述：本工作组的面包屑定位信息 */
	private String groupSeq ;
	
	/** 字段类型：date<br/>字段名：工作组有效开始日期<br/>描述： */
	private Date startDate ;
	
	/** 字段类型：date<br/>字段名：工作组有效截止日期<br/>描述： */
	private Date endDate ;
	
	/** 字段类型：timestamp<br/>字段名：创建时间<br/>描述： */
	private Date createtime ;
	
	/** 字段类型：timestamp<br/>字段名：最近更新时间<br/>描述： */
	private Date lastupdate ;
	
	/** 字段类型：varchar<br/>字段名：最近更新人员<br/>描述： */
	private String updator ;
	
	
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
	 * Set the 工作组代码.
	 * 
	 * @param groupCode
	 *            工作组代码
	 */
	public void setGroupCode(String groupCode) {
 		this.groupCode = groupCode == null ? null : groupCode.trim() ;
    }
    
    /**
	 * Get the 工作组代码.
	 * 
	 * @return 工作组代码
	 */
	public String getGroupCode(){
		return this.groupCode ;
    }
	
	/**
	 * Set the 工作组名称.
	 * 
	 * @param groupName
	 *            工作组名称
	 */
	public void setGroupName(String groupName) {
 		this.groupName = groupName == null ? null : groupName.trim() ;
    }
    
    /**
	 * Get the 工作组名称.
	 * 
	 * @return 工作组名称
	 */
	public String getGroupName(){
		return this.groupName ;
    }
	
	/**
	 * Set the 工作组类型.
	 * 
	 * @param groupType
	 *            工作组类型
	 */
	public void setGroupType(String groupType) {
 		this.groupType = groupType == null ? null : groupType.trim() ;
    }
    
    /**
	 * Get the 工作组类型.
	 * 
	 * @return 工作组类型
	 */
	public String getGroupType(){
		return this.groupType ;
    }
	
	/**
	 * Set the 工作组状态.
	 * 
	 * @param groupStatus
	 *            工作组状态
	 */
	public void setGroupStatus(String groupStatus) {
 		this.groupStatus = groupStatus == null ? null : groupStatus.trim() ;
    }
    
    /**
	 * Get the 工作组状态.
	 * 
	 * @return 工作组状态
	 */
	public String getGroupStatus(){
		return this.groupStatus ;
    }
	
	/**
	 * Set the 工作组描述.
	 * 
	 * @param groupDesc
	 *            工作组描述
	 */
	public void setGroupDesc(String groupDesc) {
 		this.groupDesc = groupDesc == null ? null : groupDesc.trim() ;
    }
    
    /**
	 * Get the 工作组描述.
	 * 
	 * @return 工作组描述
	 */
	public String getGroupDesc(){
		return this.groupDesc ;
    }
	
	/**
	 * Set the 负责人.
	 * 
	 * @param guidEmpManager
	 *            负责人
	 */
	public void setGuidEmpManager(String guidEmpManager) {
 		this.guidEmpManager = guidEmpManager == null ? null : guidEmpManager.trim() ;
    }
    
    /**
	 * Get the 负责人.
	 * 
	 * @return 负责人
	 */
	public String getGuidEmpManager(){
		return this.guidEmpManager ;
    }
	
	/**
	 * Set the 隶属机构GUID.
	 * 
	 * @param guidOrg
	 *            隶属机构GUID
	 */
	public void setGuidOrg(String guidOrg) {
 		this.guidOrg = guidOrg == null ? null : guidOrg.trim() ;
    }
    
    /**
	 * Get the 隶属机构GUID.
	 * 
	 * @return 隶属机构GUID
	 */
	public String getGuidOrg(){
		return this.guidOrg ;
    }
	
	/**
	 * Set the 父工作组GUID.
	 * 
	 * @param guidParents
	 *            父工作组GUID
	 */
	public void setGuidParents(String guidParents) {
 		this.guidParents = guidParents == null ? null : guidParents.trim() ;
    }
    
    /**
	 * Get the 父工作组GUID.
	 * 
	 * @return 父工作组GUID
	 */
	public String getGuidParents(){
		return this.guidParents ;
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
	 * Set the 工作组层次.
	 * 
	 * @param groupLevel
	 *            工作组层次
	 */
	public void setGroupLevel(BigDecimal groupLevel) {
 		this.groupLevel = groupLevel ;
    }
    
    /**
	 * Get the 工作组层次.
	 * 
	 * @return 工作组层次，如果setGroupLevel时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getGroupLevel(){
		if(groupLevel==null){
			return new BigDecimal(0d);
		}
		return groupLevel;
    }
	
	/**
	 * Set the 工作组序列.
	 * 
	 * @param groupSeq
	 *            工作组序列
	 */
	public void setGroupSeq(String groupSeq) {
 		this.groupSeq = groupSeq == null ? null : groupSeq.trim() ;
    }
    
    /**
	 * Get the 工作组序列.
	 * 
	 * @return 工作组序列
	 */
	public String getGroupSeq(){
		return this.groupSeq ;
    }
	
	/**
	 * Set the 工作组有效开始日期.
	 * 
	 * @param startDate
	 *            工作组有效开始日期
	 */
	public void setStartDate(Date startDate) {
 		this.startDate = startDate ;
    }
    
    /**
	 * Get the 工作组有效开始日期.
	 * 
	 * @return 工作组有效开始日期
	 */
	public Date getStartDate(){
		return this.startDate ;
    }
	
	/**
	 * Set the 工作组有效截止日期.
	 * 
	 * @param endDate
	 *            工作组有效截止日期
	 */
	public void setEndDate(Date endDate) {
 		this.endDate = endDate ;
    }
    
    /**
	 * Get the 工作组有效截止日期.
	 * 
	 * @return 工作组有效截止日期
	 */
	public Date getEndDate(){
		return this.endDate ;
    }
	
	/**
	 * Set the 创建时间.
	 * 
	 * @param createtime
	 *            创建时间
	 */
	public void setCreatetime(Date createtime) {
 		this.createtime = createtime ;
    }
    
    /**
	 * Get the 创建时间.
	 * 
	 * @return 创建时间
	 */
	public Date getCreatetime(){
		return this.createtime ;
    }
	
	/**
	 * Set the 最近更新时间.
	 * 
	 * @param lastupdate
	 *            最近更新时间
	 */
	public void setLastupdate(Date lastupdate) {
 		this.lastupdate = lastupdate ;
    }
    
    /**
	 * Get the 最近更新时间.
	 * 
	 * @return 最近更新时间
	 */
	public Date getLastupdate(){
		return this.lastupdate ;
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
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}