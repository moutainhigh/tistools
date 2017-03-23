
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.jnl;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.jnl.JnlEnqueue;

 
/**
 * <pre>
 * 排队流水(JNL_ENQUEUE)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IJnlEnqueueRService {
	
	/**
	 * 新增排队流水(JNL_ENQUEUE)
	 * @param t 新记录
	 */
	public void insert(JnlEnqueue t);

	/**
	 * 更新排队流水(JNL_ENQUEUE),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(JnlEnqueue t);

	/**
	 * 强制更新排队流水(JNL_ENQUEUE)
	 * @param t 新值
	 */
	public void updateForce(JnlEnqueue t);

	/**
	 * 删除排队流水(JNL_ENQUEUE)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除排队流水(JNL_ENQUEUE)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新排队流水(JNL_ENQUEUE)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, JnlEnqueue t);

	/**
	 * 根据条件查询排队流水(JNL_ENQUEUE)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<JnlEnqueue> query(WhereCondition wc);

	/**
	 * 根据条件统计排队流水(JNL_ENQUEUE)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询排队流水(JNL_ENQUEUE)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public JnlEnqueue loadByGuid(String guid);
}
