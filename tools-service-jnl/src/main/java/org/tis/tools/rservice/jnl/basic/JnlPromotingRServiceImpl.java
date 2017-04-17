
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.jnl.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.jnl.JnlPromoting;
import org.tis.tools.rservice.jnl.basic.IJnlPromotingRService;
import org.tis.tools.service.jnl.JnlPromotingService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 营销流水(JNL_PROMOTING) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "jnl", version = "1.0", interfaceClass = IJnlPromotingRService.class, timeout = 2000, document = "营销流水的基础远程服务")
public class JnlPromotingRServiceImpl implements IJnlPromotingRService {

	@Autowired
	JnlPromotingService jnlPromotingService;

	@Override
	public void insert(JnlPromoting t) {
		jnlPromotingService.insert(t);
	}

	@Override
	public void update(JnlPromoting t) {
		jnlPromotingService.update(t);
	}

	@Override
	public void updateForce(JnlPromoting t) {
		jnlPromotingService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		jnlPromotingService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		jnlPromotingService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, JnlPromoting t) {
		jnlPromotingService.updateByCondition(wc,t);
	}

	@Override
	public List<JnlPromoting> query(WhereCondition wc) {
		return jnlPromotingService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return jnlPromotingService.count(wc);
	}

	@Override
	public JnlPromoting loadByGuid(String guid) {
		return jnlPromotingService.loadByGuid(guid);
	}

}
