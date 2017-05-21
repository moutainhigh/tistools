
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.jnl.basic;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.jnl.JnlPrefill;

 
/**
 * <pre>
 * 预填流水(JNL_PREFILL)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IJnlPrefillRService {
	
	/**
	 * 新增预填流水(JNL_PREFILL)
	 * @param t 新记录
	 */
	public void insert(JnlPrefill t);

	/**
	 * 更新预填流水(JNL_PREFILL),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(JnlPrefill t);

	/**
	 * 强制更新预填流水(JNL_PREFILL)
	 * @param t 新值
	 */
	public void updateForce(JnlPrefill t);

	/**
	 * 删除预填流水(JNL_PREFILL)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除预填流水(JNL_PREFILL)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新预填流水(JNL_PREFILL)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, JnlPrefill t);

	/**
	 * 根据条件查询预填流水(JNL_PREFILL)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<JnlPrefill> query(WhereCondition wc);

	/**
	 * 根据条件统计预填流水(JNL_PREFILL)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询预填流水(JNL_PREFILL)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public JnlPrefill loadByGuid(String guid);
}