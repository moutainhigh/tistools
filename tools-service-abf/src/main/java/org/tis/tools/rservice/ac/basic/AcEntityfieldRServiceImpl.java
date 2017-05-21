
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.ac.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.ac.AcEntityfield;
import org.tis.tools.rservice.ac.basic.IAcEntityfieldRService;
import org.tis.tools.service.ac.AcEntityfieldService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 实体属性(AC_ENTITYFIELD) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "ac", version = "1.0", interfaceClass = IAcEntityfieldRService.class, timeout = 2000, document = "实体属性的基础远程服务")
public class AcEntityfieldRServiceImpl implements IAcEntityfieldRService {

	@Autowired
	AcEntityfieldService acEntityfieldService;

	@Override
	public void insert(AcEntityfield t) {
		acEntityfieldService.insert(t);
	}

	@Override
	public void update(AcEntityfield t) {
		acEntityfieldService.update(t);
	}

	@Override
	public void updateForce(AcEntityfield t) {
		acEntityfieldService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		acEntityfieldService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		acEntityfieldService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, AcEntityfield t) {
		acEntityfieldService.updateByCondition(wc,t);
	}

	@Override
	public List<AcEntityfield> query(WhereCondition wc) {
		return acEntityfieldService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return acEntityfieldService.count(wc);
	}

	@Override
	public AcEntityfield loadByGuid(String guid) {
		return acEntityfieldService.loadByGuid(guid);
	}

}