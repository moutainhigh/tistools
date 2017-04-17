/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.ac;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * <pre>
 * 权限集(角色)功能对应关系
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-oracle.erm
 * 业务域：ac
 * 模型：AC_ROLE_FUNC 权限集(角色)功能对应关系
 *
 * 角色所包含的功能清单
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcRoleFunc implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidRole ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidFunc ;
	
	/** 字段类型：varchar<br/>字段名：应用GUID<br/>描述：冗余字段 */
	private String guidApp ;
	
	/** 字段类型：varchar<br/>字段名：功能组GUID<br/>描述：冗余字段 */
	private String guidFuncgroup ;
	
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidRole
	 *            数据主键
	 */
	public void setGuidRole(String guidRole) {
 		this.guidRole = guidRole == null ? null : guidRole.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidRole(){
		return this.guidRole ;
    }
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidFunc
	 *            数据主键
	 */
	public void setGuidFunc(String guidFunc) {
 		this.guidFunc = guidFunc == null ? null : guidFunc.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidFunc(){
		return this.guidFunc ;
    }
	
	/**
	 * Set the 应用GUID.
	 * 
	 * @param guidApp
	 *            应用GUID
	 */
	public void setGuidApp(String guidApp) {
 		this.guidApp = guidApp == null ? null : guidApp.trim() ;
    }
    
    /**
	 * Get the 应用GUID.
	 * 
	 * @return 应用GUID
	 */
	public String getGuidApp(){
		return this.guidApp ;
    }
	
	/**
	 * Set the 功能组GUID.
	 * 
	 * @param guidFuncgroup
	 *            功能组GUID
	 */
	public void setGuidFuncgroup(String guidFuncgroup) {
 		this.guidFuncgroup = guidFuncgroup == null ? null : guidFuncgroup.trim() ;
    }
    
    /**
	 * Get the 功能组GUID.
	 * 
	 * @return 功能组GUID
	 */
	public String getGuidFuncgroup(){
		return this.guidFuncgroup ;
    }
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this) ; 
	}
}