/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
 package org.tis.tools.model.po.jnl;

import java.util.Date;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * <pre>
 * auto generated by mvn bronsp:gen-dao , don't change</br>
 * 模型：序号表 tb_unique
 * 描述：标记某种序号使用数
 * 业务域：jnl
 * 定义文件：/Users/megapro/Develop/tis/tools/tools-core/model/model-jnl.xml
 * </pre>
 */
public class TbUnique implements Serializable {

 	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private String id;//唯一ID 
	 private String unique_code;//序号代码 某种序号资源的唯一业务标识
	 private Long sequence_no;//序号 使用掉的序号数
	 private String ext0;//ext0 
	 private String ext1;//ext1 
	 private String ext2;//ext2 
	
	public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
	 public String getId(){
        return id;
    }
	public void setUnique_code(String unique_code) {
        this.unique_code = unique_code == null ? null : unique_code.trim();
    }
	 public String getUnique_code(){
        return unique_code;
    }
	 public void setSequence_no(Long sequence_no) {
        this.sequence_no = sequence_no ;
    }
	 public Long getSequence_no(){
		if(sequence_no==null){
			return 0l;
		}
        return sequence_no;
    }
	public void setExt0(String ext0) {
        this.ext0 = ext0 == null ? null : ext0.trim();
    }
	 public String getExt0(){
        return ext0;
    }
	public void setExt1(String ext1) {
        this.ext1 = ext1 == null ? null : ext1.trim();
    }
	 public String getExt1(){
        return ext1;
    }
	public void setExt2(String ext2) {
        this.ext2 = ext2 == null ? null : ext2.trim();
    }
	 public String getExt2(){
        return ext2;
    }
}