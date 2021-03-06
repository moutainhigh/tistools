/**
 * auto generated
 * Copyright (C) 2017 bronsp.com, All rights reserved.
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
 * 员工岗位对应关系
 * 模型文件 ： D:\tistools\tools-core-basic\model\ABF-mysql.erm
 * 业务域：om
 * 模型：OM_EMP_POSITION 员工岗位对应关系
 *
 * 定义人员和岗位的对应关系，需要注明，一个人员可以设定一个基本岗位
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class OmEmpPosition implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "OM_EMP_POSITION" ; 
	/* OM_EMP_POSITION table's columns definition */
	/** GUID_EMP ：员工GUID<br/><br/> */
	public static final String COLUMN_GUID_EMP = "guid_emp" ; 
	/** GUID_POSITION ：所在岗位GUID<br/><br/> */
	public static final String COLUMN_GUID_POSITION = "guid_position" ; 
	/** ISMAIN ：是否主岗位<br/><br/>取值来自业务菜单：DICT_YON 只能有一个主岗位 */
	public static final String COLUMN_ISMAIN = "ismain" ; 
	/** 对应的类名 */
	public static final String CLASS_NAME = "org.tis.tools.model.po.om.OmEmpPosition";
    /** GUID_EMP字段名<br/> */
    public static final String NAME_GUID_EMP = "员工GUID" ;
    /** GUID_POSITION字段名<br/> */
    public static final String NAME_GUID_POSITION = "所在岗位GUID" ;
    /** ISMAIN字段名<br/> */
    public static final String NAME_ISMAIN = "是否主岗位" ;
	
	
	/** 字段类型：varchar<br/>字段名：员工GUID<br/>描述： */
	private String guidEmp ;
	
	/** 字段类型：varchar<br/>字段名：所在岗位GUID<br/>描述： */
	private String guidPosition ;
	
	/** 字段类型：char<br/>字段名：是否主岗位<br/>描述：取值来自业务菜单：DICT_YON 只能有一个主岗位 */
	private String ismain ;

	/**
	* Default Constructor
	*/
	public OmEmpPosition() {
	}

	
	/**
	 * Set the 员工GUID.
	 * 
	 * @param guidEmp
	 *            员工GUID
	 */
	public void setGuidEmp(String guidEmp) {
 		this.guidEmp = guidEmp == null ? null : guidEmp.trim() ;
    }
    
    /**
	 * Get the 员工GUID.
	 * 
	 * @return 员工GUID
	 */
	public String getGuidEmp(){
		return this.guidEmp ;
    }
	
	/**
	 * Set the 所在岗位GUID.
	 * 
	 * @param guidPosition
	 *            所在岗位GUID
	 */
	public void setGuidPosition(String guidPosition) {
 		this.guidPosition = guidPosition == null ? null : guidPosition.trim() ;
    }
    
    /**
	 * Get the 所在岗位GUID.
	 * 
	 * @return 所在岗位GUID
	 */
	public String getGuidPosition(){
		return this.guidPosition ;
    }
	
	/**
	 * Set the 是否主岗位.
	 * 
	 * @param ismain
	 *            是否主岗位
	 */
	public void setIsmain(String ismain) {
 		this.ismain = ismain == null ? null : ismain.trim() ;
    }
    
    /**
	 * Get the 是否主岗位.
	 * 
	 * @return 是否主岗位
	 */
	public String getIsmain(){
		return this.ismain ;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}