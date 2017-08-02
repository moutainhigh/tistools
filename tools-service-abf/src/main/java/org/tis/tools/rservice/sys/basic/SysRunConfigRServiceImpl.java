
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.sys.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.sys.SysRunConfig;
import org.tis.tools.rservice.sys.basic.ISysRunConfigRService;
import org.tis.tools.service.sys.SysRunConfigService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 系统运行参数表(SYS_RUN_CONFIG) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "sys", version = "1.0", interfaceClass = ISysRunConfigRService.class, timeout = 2000, document = "系统运行参数表的基础远程服务")
public class SysRunConfigRServiceImpl implements ISysRunConfigRService {

	@Autowired
	SysRunConfigService sysRunConfigService;

	@Override
	public void insert(SysRunConfig t) {
		sysRunConfigService.insert(t);
	}

	@Override
	public void update(SysRunConfig t) {
		sysRunConfigService.update(t);
	}

	@Override
	public void updateForce(SysRunConfig t) {
		sysRunConfigService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		sysRunConfigService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		sysRunConfigService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, SysRunConfig t) {
		sysRunConfigService.updateByCondition(wc,t);
	}

	@Override
	public List<SysRunConfig> query(WhereCondition wc) {
		return sysRunConfigService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return sysRunConfigService.count(wc);
	}

	@Override
	public SysRunConfig loadByGuid(String guid) {
		return sysRunConfigService.loadByGuid(guid);
	}

}