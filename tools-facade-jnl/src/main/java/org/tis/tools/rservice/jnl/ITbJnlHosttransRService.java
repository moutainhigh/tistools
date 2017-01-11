
/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.jnl;

import java.util.List;

import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.jnl.TbJnlHosttrans;

 
/**
 * <pre>
 * auto generated by mvn bronsp:gen-dao , don't change</br>
 * 主机流水(tb_jnl_hosttrans)的基础远程服务接口定义
 * 模型：主机流水 tb_jnl_hosttrans
 * 描述：交易过程中与主机系统的交互流水
 * 业务域：jnl
 * 定义文件：/Users/megapro/Develop/tis/tools/tools-core/model/model-jnl.xml
 * </pre>
 */
public interface ITbJnlHosttransRService {
	
	/**
	 * 新增主机流水(tb_jnl_hosttrans)
	 * @param t 新记录
	 */
	public void insert(TbJnlHosttrans t);

	/**
	 * 更新主机流水(tb_jnl_hosttrans),只修改t对象有值的字段
	 * @param t 新值
	 */
	public void update(TbJnlHosttrans t);

	/**
	 * 强制更新主机流水(tb_jnl_hosttrans)
	 * @param t 新值
	 */
	public void updateForce(TbJnlHosttrans t);

	/**
	 * 删除主机流水(tb_jnl_hosttrans)
	 * @param id 记录id
	 */
	public void delete(String id);

	/**
	 * 根据条件删除主机流水(tb_jnl_hosttrans)
	 * @param wc 条件
	 */
	public void deleteByCondition(WhereCondition wc);

	/**
	 * 根据条件更新主机流水(tb_jnl_hosttrans)
	 * @param wc 条件
	 * @param t 新值
	 */
	public void updateByCondition(WhereCondition wc, TbJnlHosttrans t);

	/**
	 * 根据条件查询主机流水(tb_jnl_hosttrans)
	 * @param wc 条件
	 * @return 满足条件的记录list
	 */
	public List<TbJnlHosttrans> query(WhereCondition wc);

	/**
	 * 根据条件统计主机流水(tb_jnl_hosttrans)记录数
	 * @param wc 条件
	 * @return 记录数
	 */
	public int count(WhereCondition wc);

	/**
	 * 根据id查询主机流水(tb_jnl_hosttrans)记录
	 * @param id 记录id
	 * @return 匹配的记录
	 */
	public TbJnlHosttrans loadById(String id);
}
