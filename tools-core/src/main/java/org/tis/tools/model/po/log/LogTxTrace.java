/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.log;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * <pre>
 * 交易操作日志
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/JNL-oracle.erm
 * 业务域：log
 * 模型：LOG_TX_TRACE 交易操作日志
 *
 * 记录操作员对交易的操作日志记录
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class LogTxTrace implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier） */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：网点代码<br/>描述：本次接触的网点代码 */
	private String instno ;
	
	/** 字段类型：varchar<br/>字段名：柜员代码<br/>描述：本次接触活动的柜员 */
	private String tellerNo ;
	
	/** 字段类型：varchar<br/>字段名：渠道代码<br/>描述：记录接触系统对应的渠道代码； 来自渠道参数控制表： SYS_CHANNEL_CTL */
	private String chnCode ;
	
	/** 字段类型：varchar<br/>字段名：操作行为类型<br/>描述：操作行为类型 见业务字典： DICT_ACTION_TYPE */
	private String actionType ;
	
	/** 字段类型：varchar<br/>字段名：操作时间<br/>描述： */
	private String actionTime ;
	
	/** 字段类型：varchar<br/>字段名：交易流水号<br/>描述：交易流水号，唯一标识业务的唯一性 */
	private String transSno ;
	
	/** 字段类型：varchar<br/>字段名：交易代码<br/>描述： */
	private String transCode ;
	
	/** 字段类型：varchar<br/>字段名：工作站编码<br/>描述：柜员工作站编码 */
	private String twsCode ;
	
	/** 字段类型：text<br/>字段名：备注信息<br/>描述：记录操作过程中的备注信息，比如存储操作前后某些字典的变化对照 */
	private String remarkInfo ;
	
	
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
	 * Set the 网点代码.
	 * 
	 * @param instno
	 *            网点代码
	 */
	public void setInstno(String instno) {
 		this.instno = instno == null ? null : instno.trim() ;
    }
    
    /**
	 * Get the 网点代码.
	 * 
	 * @return 网点代码
	 */
	public String getInstno(){
		return this.instno ;
    }
	
	/**
	 * Set the 柜员代码.
	 * 
	 * @param tellerNo
	 *            柜员代码
	 */
	public void setTellerNo(String tellerNo) {
 		this.tellerNo = tellerNo == null ? null : tellerNo.trim() ;
    }
    
    /**
	 * Get the 柜员代码.
	 * 
	 * @return 柜员代码
	 */
	public String getTellerNo(){
		return this.tellerNo ;
    }
	
	/**
	 * Set the 渠道代码.
	 * 
	 * @param chnCode
	 *            渠道代码
	 */
	public void setChnCode(String chnCode) {
 		this.chnCode = chnCode == null ? null : chnCode.trim() ;
    }
    
    /**
	 * Get the 渠道代码.
	 * 
	 * @return 渠道代码
	 */
	public String getChnCode(){
		return this.chnCode ;
    }
	
	/**
	 * Set the 操作行为类型.
	 * 
	 * @param actionType
	 *            操作行为类型
	 */
	public void setActionType(String actionType) {
 		this.actionType = actionType == null ? null : actionType.trim() ;
    }
    
    /**
	 * Get the 操作行为类型.
	 * 
	 * @return 操作行为类型
	 */
	public String getActionType(){
		return this.actionType ;
    }
	
	/**
	 * Set the 操作时间.
	 * 
	 * @param actionTime
	 *            操作时间
	 */
	public void setActionTime(String actionTime) {
 		this.actionTime = actionTime == null ? null : actionTime.trim() ;
    }
    
    /**
	 * Get the 操作时间.
	 * 
	 * @return 操作时间
	 */
	public String getActionTime(){
		return this.actionTime ;
    }
	
	/**
	 * Set the 交易流水号.
	 * 
	 * @param transSno
	 *            交易流水号
	 */
	public void setTransSno(String transSno) {
 		this.transSno = transSno == null ? null : transSno.trim() ;
    }
    
    /**
	 * Get the 交易流水号.
	 * 
	 * @return 交易流水号
	 */
	public String getTransSno(){
		return this.transSno ;
    }
	
	/**
	 * Set the 交易代码.
	 * 
	 * @param transCode
	 *            交易代码
	 */
	public void setTransCode(String transCode) {
 		this.transCode = transCode == null ? null : transCode.trim() ;
    }
    
    /**
	 * Get the 交易代码.
	 * 
	 * @return 交易代码
	 */
	public String getTransCode(){
		return this.transCode ;
    }
	
	/**
	 * Set the 工作站编码.
	 * 
	 * @param twsCode
	 *            工作站编码
	 */
	public void setTwsCode(String twsCode) {
 		this.twsCode = twsCode == null ? null : twsCode.trim() ;
    }
    
    /**
	 * Get the 工作站编码.
	 * 
	 * @return 工作站编码
	 */
	public String getTwsCode(){
		return this.twsCode ;
    }
	
	/**
	 * Set the 备注信息.
	 * 
	 * @param remarkInfo
	 *            备注信息
	 */
	public void setRemarkInfo(String remarkInfo) {
 		this.remarkInfo = remarkInfo == null ? null : remarkInfo.trim() ;
    }
    
    /**
	 * Get the 备注信息.
	 * 
	 * @return 备注信息
	 */
	public String getRemarkInfo(){
		return this.remarkInfo ;
    }
	
	public String toString(){
		return ToStringBuilder.reflectionToString(this) ; 
	}
}