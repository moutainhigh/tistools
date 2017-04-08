
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.om.basic;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.om.OmEmployee;

 
/**
 * <pre>
 * 员工(OM_EMPLOYEE)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IOmEmployeeRService {
	
	/**
	 * 新增员工(OM_EMPLOYEE)
	 * @param t 新记录
	 */
	public void insert(OmEmployee t);

	/**
	 * 更新员工(OM_EMPLOYEE),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(OmEmployee t);

	/**
	 * 强制更新员工(OM_EMPLOYEE)
	 * @param t 新值
	 */
	public void updateForce(OmEmployee t);

	/**
	 * 删除员工(OM_EMPLOYEE)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除员工(OM_EMPLOYEE)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新员工(OM_EMPLOYEE)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, OmEmployee t);

	/**
	 * 根据条件查询员工(OM_EMPLOYEE)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<OmEmployee> query(WhereCondition wc);

	/**
	 * 根据条件统计员工(OM_EMPLOYEE)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询员工(OM_EMPLOYEE)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public OmEmployee loadByGuid(String guid);
}
