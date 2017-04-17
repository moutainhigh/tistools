
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.jnl.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.jnl.JnlPrefill;
import org.tis.tools.rservice.jnl.basic.IJnlPrefillRService;
import org.tis.tools.service.jnl.JnlPrefillService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 预填流水(JNL_PREFILL) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "jnl", version = "1.0", interfaceClass = IJnlPrefillRService.class, timeout = 2000, document = "预填流水的基础远程服务")
public class JnlPrefillRServiceImpl implements IJnlPrefillRService {

	@Autowired
	JnlPrefillService jnlPrefillService;

	@Override
	public void insert(JnlPrefill t) {
		jnlPrefillService.insert(t);
	}

	@Override
	public void update(JnlPrefill t) {
		jnlPrefillService.update(t);
	}

	@Override
	public void updateForce(JnlPrefill t) {
		jnlPrefillService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		jnlPrefillService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		jnlPrefillService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, JnlPrefill t) {
		jnlPrefillService.updateByCondition(wc,t);
	}

	@Override
	public List<JnlPrefill> query(WhereCondition wc) {
		return jnlPrefillService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return jnlPrefillService.count(wc);
	}

	@Override
	public JnlPrefill loadByGuid(String guid) {
		return jnlPrefillService.loadByGuid(guid);
	}

}
