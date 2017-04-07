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
 * 业务机构
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/abf.erm
 * 业务域：om
 * 模型：OM_BUSIORG 业务机构
 *
 * 业务机构是以业务视角来对机构进行分类分组，每个业务视角称为“业务套别”或者“业务条线”，
作为业务处理的机构线或者是业务统计的口径。
比如审计条线，在总行有审计部，各分行也有审计部，总行审计部是审计条线的主管部门；
允许添加虚拟节点（机构表中对应记录）；
如：某公司在全国有33个分公司，为统计各个区域如华东、华北、华南、华西的销售情况，
但公司内部没有华东、华北、华南、华西这样的机构，
这时可以建立一个“区域”业务机构套别，在这个套别下建立华东、华北、华南、华西四个虚节点，
然后将各个分公司分到不同的区域下，这样就可以按照区域进行统计了。
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class OmBusiorg implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：记录的全局性唯一ID，系统自动生成； 一般根据实体做规则标识，以增强阅读性和辨识度， 如：操作员的数据主键规则为 operator-xxxx-xxxx-xxxx 功能的数据主键规则为 function-xxxx-xxxx-xxxx */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：业务机构编码<br/>描述：业务上对业务机构的编码 */
	private String busiorgCode ;
	
	/** 字段类型：varchar<br/>字段名：业务条线<br/>描述：取值范围业务菜单 DICT_OM_BUSIDOMAIN */
	private String busiDomain ;
	
	/** 字段类型：varchar<br/>字段名：业务机构名称<br/>描述： */
	private String busiorgName ;
	
	/** 字段类型：decimal<br/>字段名：业务机构层次<br/>描述： */
	private BigDecimal busiorgLevel ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidOrg ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidParents ;
	
	/** 字段类型：varchar<br/>字段名：主管岗位<br/>描述： */
	private String guidPosition ;
	
	/** 字段类型：varchar<br/>字段名：节点类型<br/>描述：业务字典 DICT_OM_NODETYPE 该业务机构的节点类型，虚拟节点，机构节点，如果是机构节点，则对应机构信息表的一个机构 */
	private String nodeType ;
	
	/** 字段类型：varchar<br/>字段名：机构代号<br/>描述： */
	private String orgCode ;
	
	/** 字段类型：varchar<br/>字段名：序列号<br/>描述：业务机构的面包屑导航信息 */
	private String seqno ;
	
	/** 字段类型：decimal<br/>字段名：排列顺序编号<br/>描述： */
	private BigDecimal sortno ;
	
	/** 字段类型：char<br/>字段名：是否叶子节点<br/>描述：见业务字典： DICT_YON */
	private String isleaf ;
	
	/** 字段类型：decimal<br/>字段名：子节点数<br/>描述： */
	private BigDecimal subCount ;
	
	
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
	 * Set the 业务机构编码.
	 * 
	 * @param busiorgCode
	 *            业务机构编码
	 */
	public void setBusiorgCode(String busiorgCode) {
 		this.busiorgCode = busiorgCode == null ? null : busiorgCode.trim() ;
    }
    
    /**
	 * Get the 业务机构编码.
	 * 
	 * @return 业务机构编码
	 */
	public String getBusiorgCode(){
		return this.busiorgCode ;
    }
	
	/**
	 * Set the 业务条线.
	 * 
	 * @param busiDomain
	 *            业务条线
	 */
	public void setBusiDomain(String busiDomain) {
 		this.busiDomain = busiDomain == null ? null : busiDomain.trim() ;
    }
    
    /**
	 * Get the 业务条线.
	 * 
	 * @return 业务条线
	 */
	public String getBusiDomain(){
		return this.busiDomain ;
    }
	
	/**
	 * Set the 业务机构名称.
	 * 
	 * @param busiorgName
	 *            业务机构名称
	 */
	public void setBusiorgName(String busiorgName) {
 		this.busiorgName = busiorgName == null ? null : busiorgName.trim() ;
    }
    
    /**
	 * Get the 业务机构名称.
	 * 
	 * @return 业务机构名称
	 */
	public String getBusiorgName(){
		return this.busiorgName ;
    }
	
	/**
	 * Set the 业务机构层次.
	 * 
	 * @param busiorgLevel
	 *            业务机构层次
	 */
	public void setBusiorgLevel(BigDecimal busiorgLevel) {
 		this.busiorgLevel = busiorgLevel ;
    }
    
    /**
	 * Get the 业务机构层次.
	 * 
	 * @return 业务机构层次，如果setBusiorgLevel时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getBusiorgLevel(){
		if(busiorgLevel==null){
			return new BigDecimal(0d);
		}
		return busiorgLevel;
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
	 * Set the 主管岗位.
	 * 
	 * @param guidPosition
	 *            主管岗位
	 */
	public void setGuidPosition(String guidPosition) {
 		this.guidPosition = guidPosition == null ? null : guidPosition.trim() ;
    }
    
    /**
	 * Get the 主管岗位.
	 * 
	 * @return 主管岗位
	 */
	public String getGuidPosition(){
		return this.guidPosition ;
    }
	
	/**
	 * Set the 节点类型.
	 * 
	 * @param nodeType
	 *            节点类型
	 */
	public void setNodeType(String nodeType) {
 		this.nodeType = nodeType == null ? null : nodeType.trim() ;
    }
    
    /**
	 * Get the 节点类型.
	 * 
	 * @return 节点类型
	 */
	public String getNodeType(){
		return this.nodeType ;
    }
	
	/**
	 * Set the 机构代号.
	 * 
	 * @param orgCode
	 *            机构代号
	 */
	public void setOrgCode(String orgCode) {
 		this.orgCode = orgCode == null ? null : orgCode.trim() ;
    }
    
    /**
	 * Get the 机构代号.
	 * 
	 * @return 机构代号
	 */
	public String getOrgCode(){
		return this.orgCode ;
    }
	
	/**
	 * Set the 序列号.
	 * 
	 * @param seqno
	 *            序列号
	 */
	public void setSeqno(String seqno) {
 		this.seqno = seqno == null ? null : seqno.trim() ;
    }
    
    /**
	 * Get the 序列号.
	 * 
	 * @return 序列号
	 */
	public String getSeqno(){
		return this.seqno ;
    }
	
	/**
	 * Set the 排列顺序编号.
	 * 
	 * @param sortno
	 *            排列顺序编号
	 */
	public void setSortno(BigDecimal sortno) {
 		this.sortno = sortno ;
    }
    
    /**
	 * Get the 排列顺序编号.
	 * 
	 * @return 排列顺序编号，如果setSortno时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getSortno(){
		if(sortno==null){
			return new BigDecimal(0d);
		}
		return sortno;
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
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this) ; 
	}
}