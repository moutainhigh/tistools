
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.om.basic;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.om.OmOrg;

 
/**
 * <pre>
 * 机构信息表(OM_ORG)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IOmOrgRService {
	
	/**
	 * 新增机构信息表(OM_ORG)
	 * @param t 新记录
	 */
	public void insert(OmOrg t);

	/**
	 * 更新机构信息表(OM_ORG),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(OmOrg t);

	/**
	 * 强制更新机构信息表(OM_ORG)
	 * @param t 新值
	 */
	public void updateForce(OmOrg t);

	/**
	 * 删除机构信息表(OM_ORG)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除机构信息表(OM_ORG)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新机构信息表(OM_ORG)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, OmOrg t);

	/**
	 * 根据条件查询机构信息表(OM_ORG)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<OmOrg> query(WhereCondition wc);

	/**
	 * 根据条件统计机构信息表(OM_ORG)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询机构信息表(OM_ORG)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public OmOrg loadByGuid(String guid);
}
