
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.jnl.basic;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.jnl.JnlTrans;

 
/**
 * <pre>
 * 交易流水(JNL_TRANS)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IJnlTransRService {
	
	/**
	 * 新增交易流水(JNL_TRANS)
	 * @param t 新记录
	 */
	public void insert(JnlTrans t);

	/**
	 * 更新交易流水(JNL_TRANS),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(JnlTrans t);

	/**
	 * 强制更新交易流水(JNL_TRANS)
	 * @param t 新值
	 */
	public void updateForce(JnlTrans t);

	/**
	 * 删除交易流水(JNL_TRANS)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除交易流水(JNL_TRANS)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新交易流水(JNL_TRANS)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, JnlTrans t);

	/**
	 * 根据条件查询交易流水(JNL_TRANS)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<JnlTrans> query(WhereCondition wc);

	/**
	 * 根据条件统计交易流水(JNL_TRANS)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询交易流水(JNL_TRANS)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public JnlTrans loadByGuid(String guid);
}
