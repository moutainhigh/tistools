
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.ac.basic;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.ac.AcEntity;

 
/**
 * <pre>
 * 实体(AC_ENTITY)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IAcEntityRService {
	
	/**
	 * 新增实体(AC_ENTITY)
	 * @param t 新记录
	 */
	public void insert(AcEntity t);

	/**
	 * 更新实体(AC_ENTITY),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(AcEntity t);

	/**
	 * 强制更新实体(AC_ENTITY)
	 * @param t 新值
	 */
	public void updateForce(AcEntity t);

	/**
	 * 删除实体(AC_ENTITY)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除实体(AC_ENTITY)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新实体(AC_ENTITY)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, AcEntity t);

	/**
	 * 根据条件查询实体(AC_ENTITY)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<AcEntity> query(WhereCondition wc);

	/**
	 * 根据条件统计实体(AC_ENTITY)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询实体(AC_ENTITY)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public AcEntity loadByGuid(String guid);
}