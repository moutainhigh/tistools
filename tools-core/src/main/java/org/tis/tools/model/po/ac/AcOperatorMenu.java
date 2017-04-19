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

import org.tis.tools.common.utils.StringUtils;

/**
 * 
 * <pre>
 * 操作员重组菜单
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/ABF-mysql.erm
 * 业务域：ac
 * 模型：AC_OPERATOR_MENU 操作员重组菜单
 *
 * 重组菜单；
操作员对AC_MENU的定制化重组
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class AcOperatorMenu implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/* AC_OPERATOR_MENU table's columns definition */
	/** GUID ：数据主键<br/><br/>全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	public static final String GUID = "guid" ; 
	/** GUID_OPERATOR ：数据主键<br/><br/> */
	public static final String GUID_OPERATOR = "guid_operator" ; 
	/** GUID_APP ：应用GUID<br/><br/> */
	public static final String GUID_APP = "guid_app" ; 
	/** GUID_FUNC ：功能GUID<br/><br/> */
	public static final String GUID_FUNC = "guid_func" ; 
	/** MENU_NAME ：菜单名称<br/><br/> */
	public static final String MENU_NAME = "menu_name" ; 
	/** MENU_LABEL ：菜单显示（中文）<br/><br/> */
	public static final String MENU_LABEL = "menu_label" ; 
	/** GUID_PARENTS ：数据主键<br/><br/> */
	public static final String GUID_PARENTS = "guid_parents" ; 
	/** ISLEAF ：是否叶子菜单<br/><br/> */
	public static final String ISLEAF = "isleaf" ; 
	/** UI_ENTRY ：UI入口<br/><br/>针对EXT模式提供，例如abf_auth/function/module.xml */
	public static final String UI_ENTRY = "ui_entry" ; 
	/** MENU_LEVEL ：菜单层次<br/><br/>原类型smallint */
	public static final String MENU_LEVEL = "menu_level" ; 
	/** GUID_ROOT ：根菜单GUID<br/><br/> */
	public static final String GUID_ROOT = "guid_root" ; 
	/** DISPLAY_ORDER ：显示顺序<br/><br/>原类型smallint */
	public static final String DISPLAY_ORDER = "display_order" ; 
	/** IMAGE_PATH ：菜单图片路径<br/><br/> */
	public static final String IMAGE_PATH = "image_path" ; 
	/** EXPAND_PATH ：菜单展开图片路径<br/><br/> */
	public static final String EXPAND_PATH = "expand_path" ; 
	/** MENU_SEQ ：菜单路径序列<br/><br/> */
	public static final String MENU_SEQ = "menu_seq" ; 
	/** OPEN_MODE ：页面打开方式<br/><br/>数值取自业务菜单： DICT_AC_OPENMODE 如：主窗口打开、弹出窗口打开... */
	public static final String OPEN_MODE = "open_mode" ; 
	/** SUB_COUNT ：子节点数<br/><br/> */
	public static final String SUB_COUNT = "sub_count" ; 
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier），系统自动生成； */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidOperator ;
	
	/** 字段类型：varchar<br/>字段名：应用GUID<br/>描述： */
	private String guidApp ;
	
	/** 字段类型：varchar<br/>字段名：功能GUID<br/>描述： */
	private String guidFunc ;
	
	/** 字段类型：varchar<br/>字段名：菜单名称<br/>描述： */
	private String menuName ;
	
	/** 字段类型：varchar<br/>字段名：菜单显示（中文）<br/>描述： */
	private String menuLabel ;
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述： */
	private String guidParents ;
	
	/** 字段类型：char<br/>字段名：是否叶子菜单<br/>描述： */
	private String isleaf ;
	
	/** 字段类型：varchar<br/>字段名：UI入口<br/>描述：针对EXT模式提供，例如abf_auth/function/module.xml */
	private String uiEntry ;
	
	/** 字段类型：decimal<br/>字段名：菜单层次<br/>描述：原类型smallint */
	private BigDecimal menuLevel ;
	
	/** 字段类型：varchar<br/>字段名：根菜单GUID<br/>描述： */
	private String guidRoot ;
	
	/** 字段类型：decimal<br/>字段名：显示顺序<br/>描述：原类型smallint */
	private BigDecimal displayOrder ;
	
	/** 字段类型：varchar<br/>字段名：菜单图片路径<br/>描述： */
	private String imagePath ;
	
	/** 字段类型：varchar<br/>字段名：菜单展开图片路径<br/>描述： */
	private String expandPath ;
	
	/** 字段类型：varchar<br/>字段名：菜单路径序列<br/>描述： */
	private String menuSeq ;
	
	/** 字段类型：varchar<br/>字段名：页面打开方式<br/>描述：数值取自业务菜单： DICT_AC_OPENMODE 如：主窗口打开、弹出窗口打开... */
	private String openMode ;
	
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
	 * Set the 菜单名称.
	 * 
	 * @param menuName
	 *            菜单名称
	 */
	public void setMenuName(String menuName) {
 		this.menuName = menuName == null ? null : menuName.trim() ;
    }
    
    /**
	 * Get the 菜单名称.
	 * 
	 * @return 菜单名称
	 */
	public String getMenuName(){
		return this.menuName ;
    }
	
	/**
	 * Set the 菜单显示（中文）.
	 * 
	 * @param menuLabel
	 *            菜单显示（中文）
	 */
	public void setMenuLabel(String menuLabel) {
 		this.menuLabel = menuLabel == null ? null : menuLabel.trim() ;
    }
    
    /**
	 * Get the 菜单显示（中文）.
	 * 
	 * @return 菜单显示（中文）
	 */
	public String getMenuLabel(){
		return this.menuLabel ;
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
	 * Set the 是否叶子菜单.
	 * 
	 * @param isleaf
	 *            是否叶子菜单
	 */
	public void setIsleaf(String isleaf) {
 		this.isleaf = isleaf == null ? null : isleaf.trim() ;
    }
    
    /**
	 * Get the 是否叶子菜单.
	 * 
	 * @return 是否叶子菜单
	 */
	public String getIsleaf(){
		return this.isleaf ;
    }
	
	/**
	 * Set the UI入口.
	 * 
	 * @param uiEntry
	 *            UI入口
	 */
	public void setUiEntry(String uiEntry) {
 		this.uiEntry = uiEntry == null ? null : uiEntry.trim() ;
    }
    
    /**
	 * Get the UI入口.
	 * 
	 * @return UI入口
	 */
	public String getUiEntry(){
		return this.uiEntry ;
    }
	
	/**
	 * Set the 菜单层次.
	 * 
	 * @param menuLevel
	 *            菜单层次
	 */
	public void setMenuLevel(BigDecimal menuLevel) {
 		this.menuLevel = menuLevel ;
    }
    
    /**
	 * Get the 菜单层次.
	 * 
	 * @return 菜单层次，如果setMenuLevel时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getMenuLevel(){
		if(menuLevel==null){
			return new BigDecimal(0d);
		}
		return menuLevel;
    }
	
	/**
	 * Set the 根菜单GUID.
	 * 
	 * @param guidRoot
	 *            根菜单GUID
	 */
	public void setGuidRoot(String guidRoot) {
 		this.guidRoot = guidRoot == null ? null : guidRoot.trim() ;
    }
    
    /**
	 * Get the 根菜单GUID.
	 * 
	 * @return 根菜单GUID
	 */
	public String getGuidRoot(){
		return this.guidRoot ;
    }
	
	/**
	 * Set the 显示顺序.
	 * 
	 * @param displayOrder
	 *            显示顺序
	 */
	public void setDisplayOrder(BigDecimal displayOrder) {
 		this.displayOrder = displayOrder ;
    }
    
    /**
	 * Get the 显示顺序.
	 * 
	 * @return 显示顺序，如果setDisplayOrder时原值为空，返回BigDecimal(0d)
	 */
	public BigDecimal getDisplayOrder(){
		if(displayOrder==null){
			return new BigDecimal(0d);
		}
		return displayOrder;
    }
	
	/**
	 * Set the 菜单图片路径.
	 * 
	 * @param imagePath
	 *            菜单图片路径
	 */
	public void setImagePath(String imagePath) {
 		this.imagePath = imagePath == null ? null : imagePath.trim() ;
    }
    
    /**
	 * Get the 菜单图片路径.
	 * 
	 * @return 菜单图片路径
	 */
	public String getImagePath(){
		return this.imagePath ;
    }
	
	/**
	 * Set the 菜单展开图片路径.
	 * 
	 * @param expandPath
	 *            菜单展开图片路径
	 */
	public void setExpandPath(String expandPath) {
 		this.expandPath = expandPath == null ? null : expandPath.trim() ;
    }
    
    /**
	 * Get the 菜单展开图片路径.
	 * 
	 * @return 菜单展开图片路径
	 */
	public String getExpandPath(){
		return this.expandPath ;
    }
	
	/**
	 * Set the 菜单路径序列.
	 * 
	 * @param menuSeq
	 *            菜单路径序列
	 */
	public void setMenuSeq(String menuSeq) {
 		this.menuSeq = menuSeq == null ? null : menuSeq.trim() ;
    }
    
    /**
	 * Get the 菜单路径序列.
	 * 
	 * @return 菜单路径序列
	 */
	public String getMenuSeq(){
		return this.menuSeq ;
    }
	
	/**
	 * Set the 页面打开方式.
	 * 
	 * @param openMode
	 *            页面打开方式
	 */
	public void setOpenMode(String openMode) {
 		this.openMode = openMode == null ? null : openMode.trim() ;
    }
    
    /**
	 * Get the 页面打开方式.
	 * 
	 * @return 页面打开方式
	 */
	public String getOpenMode(){
		return this.openMode ;
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
		return StringUtils.toString(this) ; 
	}
}