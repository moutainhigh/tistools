
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.ac.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.ac.AcOperator;
import org.tis.tools.rservice.ac.basic.IAcOperatorRService;
import org.tis.tools.service.ac.AcOperatorService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 操作员(AC_OPERATOR) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "ac", version = "1.0", interfaceClass = IAcOperatorRService.class, timeout = 2000, document = "操作员的基础远程服务")
public class AcOperatorRServiceImpl implements IAcOperatorRService {

	@Autowired
	AcOperatorService acOperatorService;

	@Override
	public void insert(AcOperator t) {
		acOperatorService.insert(t);
	}

	@Override
	public void update(AcOperator t) {
		acOperatorService.update(t);
	}

	@Override
	public void updateForce(AcOperator t) {
		acOperatorService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		acOperatorService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		acOperatorService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, AcOperator t) {
		acOperatorService.updateByCondition(wc,t);
	}

	@Override
	public List<AcOperator> query(WhereCondition wc) {
		return acOperatorService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return acOperatorService.count(wc);
	}

	@Override
	public AcOperator loadByGuid(String guid) {
		return acOperatorService.loadByGuid(guid);
	}

}
