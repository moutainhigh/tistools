
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.ac;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.ac.AcPartyRole;

 
/**
 * <pre>
 * 组织对象与角色对应关系(AC_PARTY_ROLE)的基础远程服务接口定义
 * </pre>
 *
 * @autor generated by tools:gen-dao
 *
 */
public interface IAcPartyRoleRService {
	
	/**
	 * 新增组织对象与角色对应关系(AC_PARTY_ROLE)
	 * @param t 新记录
	 */
	public void insert(AcPartyRole t);

	/**
	 * 更新组织对象与角色对应关系(AC_PARTY_ROLE),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(AcPartyRole t);

	/**
	 * 强制更新组织对象与角色对应关系(AC_PARTY_ROLE)
	 * @param t 新值
	 */
	public void updateForce(AcPartyRole t);

	/**
	 * 删除组织对象与角色对应关系(AC_PARTY_ROLE)
	 * @param guid 记录guid
	 */
	public void delete(String guid);

	/**
	 * 根据条件删除组织对象与角色对应关系(AC_PARTY_ROLE)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新组织对象与角色对应关系(AC_PARTY_ROLE)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, AcPartyRole t);

	/**
	 * 根据条件查询组织对象与角色对应关系(AC_PARTY_ROLE)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<AcPartyRole> query(WhereCondition wc);

	/**
	 * 根据条件统计组织对象与角色对应关系(AC_PARTY_ROLE)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询组织对象与角色对应关系(AC_PARTY_ROLE)记录
	 * @param guid 记录guid
	 * @return 匹配的记录
	 */
	public AcPartyRole loadByGuid(String guid);
}
