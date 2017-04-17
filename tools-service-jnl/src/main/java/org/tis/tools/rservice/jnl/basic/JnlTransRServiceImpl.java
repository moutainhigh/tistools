
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.jnl.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.jnl.JnlTrans;
import org.tis.tools.rservice.jnl.basic.IJnlTransRService;
import org.tis.tools.service.jnl.JnlTransService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 交易流水(JNL_TRANS) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "jnl", version = "1.0", interfaceClass = IJnlTransRService.class, timeout = 2000, document = "交易流水的基础远程服务")
public class JnlTransRServiceImpl implements IJnlTransRService {

	@Autowired
	JnlTransService jnlTransService;

	@Override
	public void insert(JnlTrans t) {
		jnlTransService.insert(t);
	}

	@Override
	public void update(JnlTrans t) {
		jnlTransService.update(t);
	}

	@Override
	public void updateForce(JnlTrans t) {
		jnlTransService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		jnlTransService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		jnlTransService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, JnlTrans t) {
		jnlTransService.updateByCondition(wc,t);
	}

	@Override
	public List<JnlTrans> query(WhereCondition wc) {
		return jnlTransService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return jnlTransService.count(wc);
	}

	@Override
	public JnlTrans loadByGuid(String guid) {
		return jnlTransService.loadByGuid(guid);
	}

}
