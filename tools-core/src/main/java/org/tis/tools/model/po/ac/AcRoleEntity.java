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
 * 角色实体关系
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-oracle.erm
 * 业务域：ac
 * 模型：AC_ROLE_ENTITY 角色实体关系
 *
 * 角色与数据实体的对应关系。
说明角色拥有哪些实体操作权。
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcRoleEntity implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidRole ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidEntity ;
	
	/** 字段类型：char<br/>字段名：可增加<br/>描述：取值来自业务菜单： DICT_YON */
	private String isadd ;
	
	/** 字段类型：char<br/>字段名：可删除<br/>描述：取值来自业务菜单： DICT_YON */
	private String isdel ;
	
	/** 字段类型：char<br/>字段名：可修改<br/>描述：取值来自业务菜单： DICT_YON */
	private String ismodify ;
	
	/** 字段类型：char<br/>字段名：可查看<br/>描述：取值来自业务菜单： DICT_YON */
	private String isview ;
	
	
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
	 * @param guidEntity
	 *            数据主键
	 */
	public void setGuidEntity(String guidEntity) {
 		this.guidEntity = guidEntity == null ? null : guidEntity.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidEntity(){
		return this.guidEntity ;
    }
	
	/**
	 * Set the 可增加.
	 * 
	 * @param isadd
	 *            可增加
	 */
	public void setIsadd(String isadd) {
 		this.isadd = isadd == null ? null : isadd.trim() ;
    }
    
    /**
	 * Get the 可增加.
	 * 
	 * @return 可增加
	 */
	public String getIsadd(){
		return this.isadd ;
    }
	
	/**
	 * Set the 可删除.
	 * 
	 * @param isdel
	 *            可删除
	 */
	public void setIsdel(String isdel) {
 		this.isdel = isdel == null ? null : isdel.trim() ;
    }
    
    /**
	 * Get the 可删除.
	 * 
	 * @return 可删除
	 */
	public String getIsdel(){
		return this.isdel ;
    }
	
	/**
	 * Set the 可修改.
	 * 
	 * @param ismodify
	 *            可修改
	 */
	public void setIsmodify(String ismodify) {
 		this.ismodify = ismodify == null ? null : ismodify.trim() ;
    }
    
    /**
	 * Get the 可修改.
	 * 
	 * @return 可修改
	 */
	public String getIsmodify(){
		return this.ismodify ;
    }
	
	/**
	 * Set the 可查看.
	 * 
	 * @param isview
	 *            可查看
	 */
	public void setIsview(String isview) {
 		this.isview = isview == null ? null : isview.trim() ;
    }
    
    /**
	 * Get the 可查看.
	 * 
	 * @return 可查看
	 */
	public String getIsview(){
		return this.isview ;
    }
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this) ; 
	}
}