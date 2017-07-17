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
 * 功能行为类型表
 * 模型文件 ： E:\tools\tistools\tools-core-basic\model\abf-mysql.erm
 * 业务域：ac
 * 模型：AC_FUNC_BHVTYPE 功能行为类型表
 *
 * 功能有那些行为类型，通过本映射关系，也指明了功能可能具有的行为；
每个功能可以有多个行为类型，至少一个；
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcFuncBhvtype implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "AC_FUNC_BHVTYPE" ; 
	/* AC_FUNC_BHVTYPE table's columns definition */
	/** GUID_FUNC ：功能GUID<br/><br/> */
	public static final String COLUMN_GUID_FUNC = "guid_func" ; 
	/** GUID_BHVTYPE ：行为类型GUID<br/><br/> */
	public static final String COLUMN_GUID_BHVTYPE = "guid_bhvtype" ; 
	
	
	/** 字段类型：varchar<br/>字段名：功能GUID<br/>描述： */
	private String guidFunc ;
	
	/** 字段类型：varchar<br/>字段名：行为类型GUID<br/>描述： */
	private String guidBhvtype ;
	
	
	/**
	 * Set the 功能GUID.
	 * 
	 * @param guidFunc
	 *            功能GUID
	 */
	public void setGuidFunc(String guidFunc) {
 		this.guidFunc = guidFunc == null ? null : guidFunc.trim() ;
    }
    
    /**
	 * Get the 功能GUID.
	 * 
	 * @return 功能GUID
	 */
	public String getGuidFunc(){
		return this.guidFunc ;
    }
	
	/**
	 * Set the 行为类型GUID.
	 * 
	 * @param guidBhvtype
	 *            行为类型GUID
	 */
	public void setGuidBhvtype(String guidBhvtype) {
 		this.guidBhvtype = guidBhvtype == null ? null : guidBhvtype.trim() ;
    }
    
    /**
	 * Get the 行为类型GUID.
	 * 
	 * @return 行为类型GUID
	 */
	public String getGuidBhvtype(){
		return this.guidBhvtype ;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}