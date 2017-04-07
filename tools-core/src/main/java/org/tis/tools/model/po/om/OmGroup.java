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

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * <pre>
 * 工作组
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/abf.erm
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
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：记录的全局性唯一ID，系统自动生成； 一般根据实体做规则标识，以增强阅读性和辨识度， 如：操作员的数据主键规则为 operator-xxxx-xxxx-xxxx 功能的数据主键规则为 function-xxxx-xxxx-xxxx */
	private String guid ;
	
	/** 字段类型：decimal<br/>字段名：工作组编号<br/>描述：业务上对工作组的编码 */
	private BigDecimal groupCode ;
	
	/** 字段类型：varchar<br/>字段名：工作组名称<br/>描述： */
	private String groupName ;
	
	/** 字段类型：varchar<br/>字段名：工作组类型<br/>描述：见业务字典： DICT_OM_GROUPTYPE */
	private String groupType ;
	
	/** 字段类型：varchar<br/>字段名：工作组状态<br/>描述：见业务字典： DICT_OM_GROUPSTATUS */
	private String groupStatus ;
	
	/** 字段类型：varchar<br/>字段名：工作组描述<br/>描述： */
	private String groupDesc ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidOrg ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidParents ;
	
	/** 字段类型：char<br/>字段名：是否叶子节点<br/>描述：见业务菜单： DICT_YON */
	private String isleaf ;
	
	/** 字段类型：decimal<br/>字段名：子节点数<br/>描述： */
	private BigDecimal subCount ;
	
	/** 字段类型：decimal<br/>字段名：工作组层次<br/>描述： */
	private BigDecimal groupLevel ;
	
	/** 字段类型：varchar<br/>字段名：工作组路径序列<br/>描述：本工作组的面包屑定位信息 */
	private String groupSeq ;
	
	/** 字段类型：date<br/>字段名：工作组有效开始日期<br/>描述： */
	private Date startDate ;
	
	/** 字段类型：date<br/>字段名：工作组有效截止日期<br/>描述： */
	private Date endDate ;
	
	/** 字段类型：varchar<br/>字段名：负责人<br/>描述：选择范围来自 OM_EMPLOYEE表 */
	private String guidEmpManager ;
	
	/** 字段类型：timestamp<br/>字段名：创建时间<br/>描述： */
	private Date createtime ;
	
	/** 字段类型：date<br/>字段名：最近更新时间<br/>描述： */
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
	 * Set the 工作组编号.
	 * 
	 * @param groupCode
	 *            工作组编号
	 */
	public void setGroupCode(BigDecimal groupCode) {
 		this.groupCode = groupCode ;
    }
    
    /**
	 * Get the 工作组编号.
	 * 
	 * @return 工作组编号，如果setGroupCode时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getGroupCode(){
		if(groupCode==null){
			return new BigDecimal(0d);
		}
		return groupCode;
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
	 * Set the 数据主键.
	 * 
	 * @param guidOrg
	 *            数据主键
	 */
	public void setGuidOrg(String guidOrg) {
 		this.guidOrg = guidOrg == null ? null : guidOrg.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidOrg(){
		return this.guidOrg ;
    }
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidParents
	 *            数据主键
	 */
	public void setGuidParents(String guidParents) {
 		this.guidParents = guidParents == null ? null : guidParents.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
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
	 * Set the 工作组路径序列.
	 * 
	 * @param groupSeq
	 *            工作组路径序列
	 */
	public void setGroupSeq(String groupSeq) {
 		this.groupSeq = groupSeq == null ? null : groupSeq.trim() ;
    }
    
    /**
	 * Get the 工作组路径序列.
	 * 
	 * @return 工作组路径序列
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
		return ToStringBuilder.reflectionToString(this) ; 
	}
}