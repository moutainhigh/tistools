
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.ac;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.ac.AcOperatorMenu;

 
/**
 * <pre>
 * 操作员重组菜单(AC_OPERATOR_MENU)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IAcOperatorMenuRService {
	
	/**
	 * 新增操作员重组菜单(AC_OPERATOR_MENU)
	 * @param t 新记录
	 */
	public void insert(AcOperatorMenu t);

	/**
	 * 更新操作员重组菜单(AC_OPERATOR_MENU),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(AcOperatorMenu t);

	/**
	 * 强制更新操作员重组菜单(AC_OPERATOR_MENU)
	 * @param t 新值
	 */
	public void updateForce(AcOperatorMenu t);

	/**
	 * 删除操作员重组菜单(AC_OPERATOR_MENU)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除操作员重组菜单(AC_OPERATOR_MENU)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新操作员重组菜单(AC_OPERATOR_MENU)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, AcOperatorMenu t);

	/**
	 * 根据条件查询操作员重组菜单(AC_OPERATOR_MENU)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<AcOperatorMenu> query(WhereCondition wc);

	/**
	 * 根据条件统计操作员重组菜单(AC_OPERATOR_MENU)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询操作员重组菜单(AC_OPERATOR_MENU)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public AcOperatorMenu loadByGuid(String guid);
}
