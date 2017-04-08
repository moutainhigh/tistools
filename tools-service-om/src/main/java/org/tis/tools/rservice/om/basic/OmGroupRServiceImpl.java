
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.om.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.om.OmGroup;
import org.tis.tools.rservice.om.IOmGroupRService;
import org.tis.tools.service.om.OmGroupService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 工作组(OM_GROUP) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "om", version = "1.0", interfaceClass = IOmGroupRService.class, timeout = 2000, document = "工作组的基础远程服务")
public class OmGroupRServiceImpl implements IOmGroupRService {

	@Autowired
	OmGroupService omGroupService;

	@Override
	public void insert(OmGroup t) {
		omGroupService.insert(t);
	}

	@Override
	public void update(OmGroup t) {
		omGroupService.update(t);
	}

	@Override
	public void updateForce(OmGroup t) {
		omGroupService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		omGroupService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		omGroupService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, OmGroup t) {
		omGroupService.updateByCondition(wc,t);
	}

	@Override
	public List<OmGroup> query(WhereCondition wc) {
		return omGroupService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return omGroupService.count(wc);
	}

	@Override
	public OmGroup loadByGuid(String guid) {
		return omGroupService.loadByGuid(guid);
	}

}
