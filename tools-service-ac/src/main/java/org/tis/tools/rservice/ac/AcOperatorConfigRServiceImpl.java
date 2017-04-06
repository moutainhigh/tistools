
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.ac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.ac.AcOperatorConfig;
import org.tis.tools.rservice.ac.IAcOperatorConfigRService;
import org.tis.tools.service.ac.AcOperatorConfigService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 操作员个性配置(AC_OPERATOR_CONFIG) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "ac", version = "1.0", interfaceClass = IAcOperatorConfigRService.class, timeout = 2000, document = "操作员个性配置的基础远程服务")
public class AcOperatorConfigRServiceImpl implements IAcOperatorConfigRService {

	@Autowired
	AcOperatorConfigService acOperatorConfigService;

	@Override
	public void insert(AcOperatorConfig t) {
		acOperatorConfigService.insert(t);
	}

	@Override
	public void update(AcOperatorConfig t) {
		acOperatorConfigService.update(t);
	}

	@Override
	public void updateForce(AcOperatorConfig t) {
		acOperatorConfigService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		acOperatorConfigService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		acOperatorConfigService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, AcOperatorConfig t) {
		acOperatorConfigService.updateByCondition(wc,t);
	}

	@Override
	public List<AcOperatorConfig> query(WhereCondition wc) {
		return acOperatorConfigService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return acOperatorConfigService.count(wc);
	}

	@Override
	public AcOperatorConfig loadByGuid(String guid) {
		return acOperatorConfigService.loadByGuid(guid);
	}

}
