
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.om;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.om.OmEmployee;
import org.tis.tools.rservice.om.IOmEmployeeRService;
import org.tis.tools.service.om.OmEmployeeService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 人员(OM_EMPLOYEE) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "om", version = "1.0", interfaceClass = IOmEmployeeRService.class, timeout = 2000, document = "人员的基础远程服务")
public class OmEmployeeRServiceImpl implements IOmEmployeeRService {

	@Autowired
	OmEmployeeService omEmployeeService;

	@Override
	public void insert(OmEmployee t) {
		omEmployeeService.insert(t);
	}

	@Override
	public void update(OmEmployee t) {
		omEmployeeService.update(t);
	}

	@Override
	public void updateForce(OmEmployee t) {
		omEmployeeService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		omEmployeeService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		omEmployeeService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, OmEmployee t) {
		omEmployeeService.updateByCondition(wc,t);
	}

	@Override
	public List<OmEmployee> query(WhereCondition wc) {
		return omEmployeeService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return omEmployeeService.count(wc);
	}

	@Override
	public OmEmployee loadByGuid(String guid) {
		return omEmployeeService.loadByGuid(guid);
	}

}
