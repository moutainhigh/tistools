
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.jnl;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.jnl.JnlHosttrans;

 
/**
 * <pre>
 * 主机交易流水(JNL_HOSTTRANS)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IJnlHosttransRService {
	
	/**
	 * 新增主机交易流水(JNL_HOSTTRANS)
	 * @param t 新记录
	 */
	public void insert(JnlHosttrans t);

	/**
	 * 更新主机交易流水(JNL_HOSTTRANS),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(JnlHosttrans t);

	/**
	 * 强制更新主机交易流水(JNL_HOSTTRANS)
	 * @param t 新值
	 */
	public void updateForce(JnlHosttrans t);

	/**
	 * 删除主机交易流水(JNL_HOSTTRANS)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除主机交易流水(JNL_HOSTTRANS)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新主机交易流水(JNL_HOSTTRANS)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, JnlHosttrans t);

	/**
	 * 根据条件查询主机交易流水(JNL_HOSTTRANS)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<JnlHosttrans> query(WhereCondition wc);

	/**
	 * 根据条件统计主机交易流水(JNL_HOSTTRANS)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询主机交易流水(JNL_HOSTTRANS)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public JnlHosttrans loadByGuid(String guid);
}
