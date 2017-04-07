
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.om;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.om.OmEmpOrg;
import org.tis.tools.rservice.om.IOmEmpOrgRService;
import org.tis.tools.service.om.OmEmpOrgService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 人员隶属机构关系表(OM_EMP_ORG) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "om", version = "1.0", interfaceClass = IOmEmpOrgRService.class, timeout = 2000, document = "人员隶属机构关系表的基础远程服务")
public class OmEmpOrgRServiceImpl implements IOmEmpOrgRService {

	@Autowired
	OmEmpOrgService omEmpOrgService;

	@Override
	public void insert(OmEmpOrg t) {
		omEmpOrgService.insert(t);
	}

	@Override
	public void update(OmEmpOrg t) {
		omEmpOrgService.update(t);
	}

	@Override
	public void updateForce(OmEmpOrg t) {
		omEmpOrgService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		omEmpOrgService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		omEmpOrgService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, OmEmpOrg t) {
		omEmpOrgService.updateByCondition(wc,t);
	}

	@Override
	public List<OmEmpOrg> query(WhereCondition wc) {
		return omEmpOrgService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return omEmpOrgService.count(wc);
	}

	@Override
	public OmEmpOrg loadByGuid(String guid) {
		return omEmpOrgService.loadByGuid(guid);
	}

}
