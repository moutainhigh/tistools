/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.sys;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.tis.tools.common.utils.StringUtil;

/**
 * 
 * <pre>
 * 业务字典
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：sys
 * 模型：SYS_DICT 业务字典
 *
 * 业务字典表，定义系统中下拉菜单的数据（注意：仅仅包括下拉菜单中的数据，而不包括下拉菜单样式，是否多选这些与下拉内容无关的信息）
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class SysDict implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "SYS_DICT" ; 
	/* SYS_DICT table's columns definition */
	/** GUID ：数据主键<br/><br/>全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	public static final String COLUMN_GUID = "guid" ; 
	/** DICT_KEY ：业务字典<br/><br/> */
	public static final String COLUMN_DICT_KEY = "dict_key" ; 
	/** DICT_TYPE ：类型<br/><br/>见业务字典： DICT_TYPE a 应用级（带业务含义的业务字典，应用开发时可扩展） s 系统级（平台自己的业务字典） */
	public static final String COLUMN_DICT_TYPE = "dict_type" ; 
	/** DICT_NAME ：字典名称<br/><br/> */
	public static final String COLUMN_DICT_NAME = "dict_name" ; 
	/** DICT_DESC ：解释说明<br/><br/> */
	public static final String COLUMN_DICT_DESC = "dict_desc" ; 
	/** GUID_PARENTS ：父字典GUID<br/><br/> */
	public static final String COLUMN_GUID_PARENTS = "guid_parents" ; 
	/** DEFAULT_VALUE ：业务字典默认值<br/><br/>指定某个字典项（ITEM_VALUE）为本业务字典的默认值（用于扶助View层实现展示默认值） */
	public static final String COLUMN_DEFAULT_VALUE = "default_value" ; 
	/** FROM_TABLE ：字典项来源表<br/><br/>如果业务字典用来描述某个表中的字段选项，则本字段保存表名； 其他情况默认为空； */
	public static final String COLUMN_FROM_TABLE = "from_table" ; 
	/** USE_FOR_KEY ：作为字典项的列<br/><br/>如果业务字典用来描述某个表中的字段选项，则本字段保存字段名； 其他情况默认为空； */
	public static final String COLUMN_USE_FOR_KEY = "use_for_key" ; 
	/** USE_FOR_NAME ：作为字典项名称的列<br/><br/> */
	public static final String COLUMN_USE_FOR_NAME = "use_for_name" ; 
	/** SEQNO ：顺序号<br/><br/>顺序号，从0开始排，按小到大排序 */
	public static final String COLUMN_SEQNO = "seqno" ; 
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：业务字典<br/>描述： */
	private String dictKey ;
	
	/** 字段类型：char<br/>字段名：类型<br/>描述：见业务字典： DICT_TYPE a 应用级（带业务含义的业务字典，应用开发时可扩展） s 系统级（平台自己的业务字典） */
	private String dictType ;
	
	/** 字段类型：varchar<br/>字段名：字典名称<br/>描述： */
	private String dictName ;
	
	/** 字段类型：varchar<br/>字段名：解释说明<br/>描述： */
	private String dictDesc ;
	
	/** 字段类型：varchar<br/>字段名：父字典GUID<br/>描述： */
	private String guidParents ;
	
	/** 字段类型：varchar<br/>字段名：业务字典默认值<br/>描述：指定某个字典项（ITEM_VALUE）为本业务字典的默认值（用于扶助View层实现展示默认值） */
	private String defaultValue ;
	
	/** 字段类型：varchar<br/>字段名：字典项来源表<br/>描述：如果业务字典用来描述某个表中的字段选项，则本字段保存表名； 其他情况默认为空； */
	private String fromTable ;
	
	/** 字段类型：varchar<br/>字段名：作为字典项的列<br/>描述：如果业务字典用来描述某个表中的字段选项，则本字段保存字段名； 其他情况默认为空； */
	private String useForKey ;
	
	/** 字段类型：varchar<br/>字段名：作为字典项名称的列<br/>描述： */
	private String useForName ;
	
	/** 字段类型：decimal<br/>字段名：顺序号<br/>描述：顺序号，从0开始排，按小到大排序 */
	private BigDecimal seqno ;
	
	
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
	 * Set the 业务字典.
	 * 
	 * @param dictKey
	 *            业务字典
	 */
	public void setDictKey(String dictKey) {
 		this.dictKey = dictKey == null ? null : dictKey.trim() ;
    }
    
    /**
	 * Get the 业务字典.
	 * 
	 * @return 业务字典
	 */
	public String getDictKey(){
		return this.dictKey ;
    }
	
	/**
	 * Set the 类型.
	 * 
	 * @param dictType
	 *            类型
	 */
	public void setDictType(String dictType) {
 		this.dictType = dictType == null ? null : dictType.trim() ;
    }
    
    /**
	 * Get the 类型.
	 * 
	 * @return 类型
	 */
	public String getDictType(){
		return this.dictType ;
    }
	
	/**
	 * Set the 字典名称.
	 * 
	 * @param dictName
	 *            字典名称
	 */
	public void setDictName(String dictName) {
 		this.dictName = dictName == null ? null : dictName.trim() ;
    }
    
    /**
	 * Get the 字典名称.
	 * 
	 * @return 字典名称
	 */
	public String getDictName(){
		return this.dictName ;
    }
	
	/**
	 * Set the 解释说明.
	 * 
	 * @param dictDesc
	 *            解释说明
	 */
	public void setDictDesc(String dictDesc) {
 		this.dictDesc = dictDesc == null ? null : dictDesc.trim() ;
    }
    
    /**
	 * Get the 解释说明.
	 * 
	 * @return 解释说明
	 */
	public String getDictDesc(){
		return this.dictDesc ;
    }
	
	/**
	 * Set the 父字典GUID.
	 * 
	 * @param guidParents
	 *            父字典GUID
	 */
	public void setGuidParents(String guidParents) {
 		this.guidParents = guidParents == null ? null : guidParents.trim() ;
    }
    
    /**
	 * Get the 父字典GUID.
	 * 
	 * @return 父字典GUID
	 */
	public String getGuidParents(){
		return this.guidParents ;
    }
	
	/**
	 * Set the 业务字典默认值.
	 * 
	 * @param defaultValue
	 *            业务字典默认值
	 */
	public void setDefaultValue(String defaultValue) {
 		this.defaultValue = defaultValue == null ? null : defaultValue.trim() ;
    }
    
    /**
	 * Get the 业务字典默认值.
	 * 
	 * @return 业务字典默认值
	 */
	public String getDefaultValue(){
		return this.defaultValue ;
    }
	
	/**
	 * Set the 字典项来源表.
	 * 
	 * @param fromTable
	 *            字典项来源表
	 */
	public void setFromTable(String fromTable) {
 		this.fromTable = fromTable == null ? null : fromTable.trim() ;
    }
    
    /**
	 * Get the 字典项来源表.
	 * 
	 * @return 字典项来源表
	 */
	public String getFromTable(){
		return this.fromTable ;
    }
	
	/**
	 * Set the 作为字典项的列.
	 * 
	 * @param useForKey
	 *            作为字典项的列
	 */
	public void setUseForKey(String useForKey) {
 		this.useForKey = useForKey == null ? null : useForKey.trim() ;
    }
    
    /**
	 * Get the 作为字典项的列.
	 * 
	 * @return 作为字典项的列
	 */
	public String getUseForKey(){
		return this.useForKey ;
    }
	
	/**
	 * Set the 作为字典项名称的列.
	 * 
	 * @param useForName
	 *            作为字典项名称的列
	 */
	public void setUseForName(String useForName) {
 		this.useForName = useForName == null ? null : useForName.trim() ;
    }
    
    /**
	 * Get the 作为字典项名称的列.
	 * 
	 * @return 作为字典项名称的列
	 */
	public String getUseForName(){
		return this.useForName ;
    }
	
	/**
	 * Set the 顺序号.
	 * 
	 * @param seqno
	 *            顺序号
	 */
	public void setSeqno(BigDecimal seqno) {
 		this.seqno = seqno ;
    }
    
    /**
	 * Get the 顺序号.
	 * 
	 * @return 顺序号，如果setSeqno时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getSeqno(){
		if(seqno==null){
			return new BigDecimal(0d);
		}
		return seqno;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}