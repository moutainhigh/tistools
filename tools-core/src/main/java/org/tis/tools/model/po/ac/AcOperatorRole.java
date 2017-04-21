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

import org.tis.tools.common.utils.StringUtil;

/**
 * 
 * <pre>
 * 操作员与权限集（角色）对应关系
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：ac
 * 模型：AC_OPERATOR_ROLE 操作员与权限集（角色）对应关系
 *
 * 操作员与权限集（角色）对应关系表
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcOperatorRole implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/* AC_OPERATOR_ROLE table's columns definition */
	/** GUID_OPERATOR ：操作员GUID<br/><br/> */
	public static final String GUID_OPERATOR = "guid_operator" ; 
	/** GUID_ROLE ：拥有角色GUID<br/><br/> */
	public static final String GUID_ROLE = "guid_role" ; 
	/** AUTH ：是否可分级授权<br/><br/>预留字段，暂不使用。意图将操作员所拥有的权限赋予其他操作员。 */
	public static final String AUTH = "auth" ; 
	
	
	/** 字段类型：varchar<br/>字段名：操作员GUID<br/>描述： */
	private String guidOperator ;
	
	/** 字段类型：varchar<br/>字段名：拥有角色GUID<br/>描述： */
	private String guidRole ;
	
	/** 字段类型：varchar<br/>字段名：是否可分级授权<br/>描述：预留字段，暂不使用。意图将操作员所拥有的权限赋予其他操作员。 */
	private String auth ;
	
	
	/**
	 * Set the 操作员GUID.
	 * 
	 * @param guidOperator
	 *            操作员GUID
	 */
	public void setGuidOperator(String guidOperator) {
 		this.guidOperator = guidOperator == null ? null : guidOperator.trim() ;
    }
    
    /**
	 * Get the 操作员GUID.
	 * 
	 * @return 操作员GUID
	 */
	public String getGuidOperator(){
		return this.guidOperator ;
    }
	
	/**
	 * Set the 拥有角色GUID.
	 * 
	 * @param guidRole
	 *            拥有角色GUID
	 */
	public void setGuidRole(String guidRole) {
 		this.guidRole = guidRole == null ? null : guidRole.trim() ;
    }
    
    /**
	 * Get the 拥有角色GUID.
	 * 
	 * @return 拥有角色GUID
	 */
	public String getGuidRole(){
		return this.guidRole ;
    }
	
	/**
	 * Set the 是否可分级授权.
	 * 
	 * @param auth
	 *            是否可分级授权
	 */
	public void setAuth(String auth) {
 		this.auth = auth == null ? null : auth.trim() ;
    }
    
    /**
	 * Get the 是否可分级授权.
	 * 
	 * @return 是否可分级授权
	 */
	public String getAuth(){
		return this.auth ;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}