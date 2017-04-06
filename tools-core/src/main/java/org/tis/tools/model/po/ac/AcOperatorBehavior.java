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
 * 操作员特殊功能行为配置
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/abf.erm
 * 业务域：ac
 * 模型：AC_OPERATOR_BEHAVIOR 操作员特殊功能行为配置
 *
 * 配合人员特殊授权配置表一起使用
特别授权某个功能给操作员时，只开放/禁止其中的部分功能；
如果不存在记录，则表示对操作员开放/禁止该功能的全部功能；
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcOperatorBehavior implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidOperator ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidBehavior ;
	
	/** 字段类型：varchar<br/>字段名：授权标志<br/>描述：取值来自业务菜单：DICT_AC_AUTHTYPE 如：特别禁止、特别允许 */
	private String authType ;
	
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidOperator
	 *            数据主键
	 */
	public void setGuidOperator(String guidOperator) {
 		this.guidOperator = guidOperator == null ? null : guidOperator.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidOperator(){
		return this.guidOperator ;
    }
	
	/**
	 * Set the 数据主键.
	 * 
	 * @param guidBehavior
	 *            数据主键
	 */
	public void setGuidBehavior(String guidBehavior) {
 		this.guidBehavior = guidBehavior == null ? null : guidBehavior.trim() ;
    }
    
    /**
	 * Get the 数据主键.
	 * 
	 * @return 数据主键
	 */
	public String getGuidBehavior(){
		return this.guidBehavior ;
    }
	
	/**
	 * Set the 授权标志.
	 * 
	 * @param authType
	 *            授权标志
	 */
	public void setAuthType(String authType) {
 		this.authType = authType == null ? null : authType.trim() ;
    }
    
    /**
	 * Get the 授权标志.
	 * 
	 * @return 授权标志
	 */
	public String getAuthType(){
		return this.authType ;
    }
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this) ; 
	}
}