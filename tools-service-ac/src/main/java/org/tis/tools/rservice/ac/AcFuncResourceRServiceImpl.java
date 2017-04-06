
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.ac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.ac.AcFuncResource;
import org.tis.tools.rservice.ac.IAcFuncResourceRService;
import org.tis.tools.service.ac.AcFuncResourceService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 功能资源对应(AC_FUNC_RESOURCE) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "ac", version = "1.0", interfaceClass = IAcFuncResourceRService.class, timeout = 2000, document = "功能资源对应的基础远程服务")
public class AcFuncResourceRServiceImpl implements IAcFuncResourceRService {

	@Autowired
	AcFuncResourceService acFuncResourceService;

	@Override
	public void insert(AcFuncResource t) {
		acFuncResourceService.insert(t);
	}

	@Override
	public void update(AcFuncResource t) {
		acFuncResourceService.update(t);
	}

	@Override
	public void updateForce(AcFuncResource t) {
		acFuncResourceService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		acFuncResourceService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		acFuncResourceService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, AcFuncResource t) {
		acFuncResourceService.updateByCondition(wc,t);
	}

	@Override
	public List<AcFuncResource> query(WhereCondition wc) {
		return acFuncResourceService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return acFuncResourceService.count(wc);
	}

	@Override
	public AcFuncResource loadByGuid(String guid) {
		return acFuncResourceService.loadByGuid(guid);
	}

}
