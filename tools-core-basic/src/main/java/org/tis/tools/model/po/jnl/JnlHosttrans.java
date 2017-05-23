/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.model.po.jnl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.Time;
import java.util.Date;

import org.tis.tools.common.utils.StringUtil;

/**
 * 
 * <pre>
 * 主机交易流水
 * 模型文件 ： /Users/megapro/Develop/tis/tools/tools-core/model/JNL-mysql.erm
 * 业务域：jnl
 * 模型：JNL_HOSTTRANS 主机交易流水
 *
 * 主机交易流水表记录了我方向主机系统发出的请求记录；
一般每个交易都会有对应的主机交易流水；
如果直接发起的主机交易，则不会有对应的交易流水记录；
 *
 * </pre>
 * @author generated by tools:gen-dao
 *
 */
public class JnlHosttrans implements Serializable {

 	/** serialVersionUID */
	private static final long serialVersionUID = 1L;
	
	/** 对应的数据库表名称 */
	public static final String TABLE_NAME = "JNL_HOSTTRANS" ; 
	/* JNL_HOSTTRANS table's columns definition */
	/** GUID ：数据主键<br/><br/>全局唯一标识符（GUID，Globally Unique Identifier） */
	public static final String COLUMN_GUID = "guid" ; 
	/** GUID_TRANS ：交易流水ID<br/><br/>关联交易流水记录 但不是所有主机交易都能关联到交易流水记录 有些自动发器的主机交易处理就不会有交易流水 */
	public static final String COLUMN_GUID_TRANS = "guid_trans" ; 
	/** TRANS_SNO ：交易流水号<br/><br/> */
	public static final String COLUMN_TRANS_SNO = "trans_sno" ; 
	/** HOST_CODE ：主机代码<br/><br/>主机系统的服务标识代码，唯一标识了某个主机系统 */
	public static final String COLUMN_HOST_CODE = "host_code" ; 
	/** HOSTTRANS_CODE ：主机交易代码<br/><br/> */
	public static final String COLUMN_HOSTTRANS_CODE = "hosttrans_code" ; 
	/** HOSTTRANS_NAME ：主机交易名称<br/><br/> */
	public static final String COLUMN_HOSTTRANS_NAME = "hosttrans_name" ; 
	/** START_TIME ：开始时间<br/><br/>存储到毫秒级别的时间 yyyyMMddHHmmssSSS */
	public static final String COLUMN_START_TIME = "start_time" ; 
	/** END_TIME ：结束时间<br/><br/>yyyyMMddHHmmssSSS */
	public static final String COLUMN_END_TIME = "end_time" ; 
	/** HOST_SNO_REQ ：请求主机流水号<br/><br/>唯一标识某次主机请求过程的流水号，由我方生成 */
	public static final String COLUMN_HOST_SNO_REQ = "host_sno_req" ; 
	/** HOST_SNO_RSP ：主机响应流水号<br/><br/>主机系统唯一标识本次请求的流水号，由主机方生成，我方在收到后更新 */
	public static final String COLUMN_HOST_SNO_RSP = "host_sno_rsp" ; 
	/** HSOTTRANS_STATUS ：主机交易状态<br/><br/>见业务字典：DICT_HSOTTRANS_STATUS */
	public static final String COLUMN_HSOTTRANS_STATUS = "hsottrans_status" ; 
	/** HOST_ERR_CODE ：主机错误码<br/><br/>主机系统返回的错误码 */
	public static final String COLUMN_HOST_ERR_CODE = "host_err_code" ; 
	/** HOST_ERR_MSG ：主机错误信息<br/><br/>主机系统返回的错误信息，超长的会被自动截取，完整的内容则只能在主机响应报文中获得。 */
	public static final String COLUMN_HOST_ERR_MSG = "host_err_msg" ; 
	
	
	/** 字段类型：varchar<br/>字段名：数据主键<br/>描述：全局唯一标识符（GUID，Globally Unique Identifier） */
	private String guid ;
	
	/** 字段类型：varchar<br/>字段名：交易流水ID<br/>描述：关联交易流水记录 但不是所有主机交易都能关联到交易流水记录 有些自动发器的主机交易处理就不会有交易流水 */
	private String guidTrans ;
	
	/** 字段类型：varchar<br/>字段名：交易流水号<br/>描述： */
	private String transSno ;
	
	/** 字段类型：varchar<br/>字段名：主机代码<br/>描述：主机系统的服务标识代码，唯一标识了某个主机系统 */
	private String hostCode ;
	
	/** 字段类型：varchar<br/>字段名：主机交易代码<br/>描述： */
	private String hosttransCode ;
	
	/** 字段类型：varchar<br/>字段名：主机交易名称<br/>描述： */
	private String hosttransName ;
	
	/** 字段类型：varchar<br/>字段名：开始时间<br/>描述：存储到毫秒级别的时间 yyyyMMddHHmmssSSS */
	private String startTime ;
	
	/** 字段类型：varchar<br/>字段名：结束时间<br/>描述：yyyyMMddHHmmssSSS */
	private String endTime ;
	
	/** 字段类型：varchar<br/>字段名：请求主机流水号<br/>描述：唯一标识某次主机请求过程的流水号，由我方生成 */
	private String hostSnoReq ;
	
	/** 字段类型：varchar<br/>字段名：主机响应流水号<br/>描述：主机系统唯一标识本次请求的流水号，由主机方生成，我方在收到后更新 */
	private String hostSnoRsp ;
	
	/** 字段类型：varchar<br/>字段名：主机交易状态<br/>描述：见业务字典：DICT_HSOTTRANS_STATUS */
	private String hsottransStatus ;
	
	/** 字段类型：varchar<br/>字段名：主机错误码<br/>描述：主机系统返回的错误码 */
	private String hostErrCode ;
	
	/** 字段类型：varchar<br/>字段名：主机错误信息<br/>描述：主机系统返回的错误信息，超长的会被自动截取，完整的内容则只能在主机响应报文中获得。 */
	private String hostErrMsg ;
	
	
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
	 * Set the 交易流水ID.
	 * 
	 * @param guidTrans
	 *            交易流水ID
	 */
	public void setGuidTrans(String guidTrans) {
 		this.guidTrans = guidTrans == null ? null : guidTrans.trim() ;
    }
    
    /**
	 * Get the 交易流水ID.
	 * 
	 * @return 交易流水ID
	 */
	public String getGuidTrans(){
		return this.guidTrans ;
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
	 * Set the 主机代码.
	 * 
	 * @param hostCode
	 *            主机代码
	 */
	public void setHostCode(String hostCode) {
 		this.hostCode = hostCode == null ? null : hostCode.trim() ;
    }
    
    /**
	 * Get the 主机代码.
	 * 
	 * @return 主机代码
	 */
	public String getHostCode(){
		return this.hostCode ;
    }
	
	/**
	 * Set the 主机交易代码.
	 * 
	 * @param hosttransCode
	 *            主机交易代码
	 */
	public void setHosttransCode(String hosttransCode) {
 		this.hosttransCode = hosttransCode == null ? null : hosttransCode.trim() ;
    }
    
    /**
	 * Get the 主机交易代码.
	 * 
	 * @return 主机交易代码
	 */
	public String getHosttransCode(){
		return this.hosttransCode ;
    }
	
	/**
	 * Set the 主机交易名称.
	 * 
	 * @param hosttransName
	 *            主机交易名称
	 */
	public void setHosttransName(String hosttransName) {
 		this.hosttransName = hosttransName == null ? null : hosttransName.trim() ;
    }
    
    /**
	 * Get the 主机交易名称.
	 * 
	 * @return 主机交易名称
	 */
	public String getHosttransName(){
		return this.hosttransName ;
    }
	
	/**
	 * Set the 开始时间.
	 * 
	 * @param startTime
	 *            开始时间
	 */
	public void setStartTime(String startTime) {
 		this.startTime = startTime == null ? null : startTime.trim() ;
    }
    
    /**
	 * Get the 开始时间.
	 * 
	 * @return 开始时间
	 */
	public String getStartTime(){
		return this.startTime ;
    }
	
	/**
	 * Set the 结束时间.
	 * 
	 * @param endTime
	 *            结束时间
	 */
	public void setEndTime(String endTime) {
 		this.endTime = endTime == null ? null : endTime.trim() ;
    }
    
    /**
	 * Get the 结束时间.
	 * 
	 * @return 结束时间
	 */
	public String getEndTime(){
		return this.endTime ;
    }
	
	/**
	 * Set the 请求主机流水号.
	 * 
	 * @param hostSnoReq
	 *            请求主机流水号
	 */
	public void setHostSnoReq(String hostSnoReq) {
 		this.hostSnoReq = hostSnoReq == null ? null : hostSnoReq.trim() ;
    }
    
    /**
	 * Get the 请求主机流水号.
	 * 
	 * @return 请求主机流水号
	 */
	public String getHostSnoReq(){
		return this.hostSnoReq ;
    }
	
	/**
	 * Set the 主机响应流水号.
	 * 
	 * @param hostSnoRsp
	 *            主机响应流水号
	 */
	public void setHostSnoRsp(String hostSnoRsp) {
 		this.hostSnoRsp = hostSnoRsp == null ? null : hostSnoRsp.trim() ;
    }
    
    /**
	 * Get the 主机响应流水号.
	 * 
	 * @return 主机响应流水号
	 */
	public String getHostSnoRsp(){
		return this.hostSnoRsp ;
    }
	
	/**
	 * Set the 主机交易状态.
	 * 
	 * @param hsottransStatus
	 *            主机交易状态
	 */
	public void setHsottransStatus(String hsottransStatus) {
 		this.hsottransStatus = hsottransStatus == null ? null : hsottransStatus.trim() ;
    }
    
    /**
	 * Get the 主机交易状态.
	 * 
	 * @return 主机交易状态
	 */
	public String getHsottransStatus(){
		return this.hsottransStatus ;
    }
	
	/**
	 * Set the 主机错误码.
	 * 
	 * @param hostErrCode
	 *            主机错误码
	 */
	public void setHostErrCode(String hostErrCode) {
 		this.hostErrCode = hostErrCode == null ? null : hostErrCode.trim() ;
    }
    
    /**
	 * Get the 主机错误码.
	 * 
	 * @return 主机错误码
	 */
	public String getHostErrCode(){
		return this.hostErrCode ;
    }
	
	/**
	 * Set the 主机错误信息.
	 * 
	 * @param hostErrMsg
	 *            主机错误信息
	 */
	public void setHostErrMsg(String hostErrMsg) {
 		this.hostErrMsg = hostErrMsg == null ? null : hostErrMsg.trim() ;
    }
    
    /**
	 * Get the 主机错误信息.
	 * 
	 * @return 主机错误信息
	 */
	public String getHostErrMsg(){
		return this.hostErrMsg ;
    }
	
	public String toString(){
		return StringUtil.toString(this) ; 
	}
}