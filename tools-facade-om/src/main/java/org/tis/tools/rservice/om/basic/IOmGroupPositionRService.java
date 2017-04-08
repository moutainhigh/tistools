
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.om.basic;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.om.OmGroupPosition;

 
/**
 * <pre>
 * 工作组岗位列表(OM_GROUP_POSITION)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IOmGroupPositionRService {
	
	/**
	 * 新增工作组岗位列表(OM_GROUP_POSITION)
	 * @param t 新记录
	 */
	public void insert(OmGroupPosition t);

	/**
	 * 更新工作组岗位列表(OM_GROUP_POSITION),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(OmGroupPosition t);

	/**
	 * 强制更新工作组岗位列表(OM_GROUP_POSITION)
	 * @param t 新值
	 */
	public void updateForce(OmGroupPosition t);

	/**
	 * 删除工作组岗位列表(OM_GROUP_POSITION)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除工作组岗位列表(OM_GROUP_POSITION)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新工作组岗位列表(OM_GROUP_POSITION)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, OmGroupPosition t);

	/**
	 * 根据条件查询工作组岗位列表(OM_GROUP_POSITION)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<OmGroupPosition> query(WhereCondition wc);

	/**
	 * 根据条件统计工作组岗位列表(OM_GROUP_POSITION)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询工作组岗位列表(OM_GROUP_POSITION)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public OmGroupPosition loadByGuid(String guid);
}
