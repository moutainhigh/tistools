
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.ac.basic;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.ac.AcOperatorRole;

 
/**
 * <pre>
 * 操作员与权限集（角色）对应关系(AC_OPERATOR_ROLE)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IAcOperatorRoleRService {
	
	/**
	 * 新增操作员与权限集（角色）对应关系(AC_OPERATOR_ROLE)
	 * @param t 新记录
	 */
	public void insert(AcOperatorRole t);

	/**
	 * 更新操作员与权限集（角色）对应关系(AC_OPERATOR_ROLE),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(AcOperatorRole t);

	/**
	 * 强制更新操作员与权限集（角色）对应关系(AC_OPERATOR_ROLE)
	 * @param t 新值
	 */
	public void updateForce(AcOperatorRole t);

	/**
	 * 删除操作员与权限集（角色）对应关系(AC_OPERATOR_ROLE)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除操作员与权限集（角色）对应关系(AC_OPERATOR_ROLE)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新操作员与权限集（角色）对应关系(AC_OPERATOR_ROLE)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, AcOperatorRole t);

	/**
	 * 根据条件查询操作员与权限集（角色）对应关系(AC_OPERATOR_ROLE)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<AcOperatorRole> query(WhereCondition wc);

	/**
	 * 根据条件统计操作员与权限集（角色）对应关系(AC_OPERATOR_ROLE)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询操作员与权限集（角色）对应关系(AC_OPERATOR_ROLE)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public AcOperatorRole loadByGuid(String guid);
}
