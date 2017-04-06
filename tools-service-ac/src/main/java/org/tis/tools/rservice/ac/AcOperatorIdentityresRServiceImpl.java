
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.ac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.ac.AcOperatorIdentityres;
import org.tis.tools.rservice.ac.IAcOperatorIdentityresRService;
import org.tis.tools.service.ac.AcOperatorIdentityresService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 身份权限集(AC_OPERATOR_IDENTITYRES) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "ac", version = "1.0", interfaceClass = IAcOperatorIdentityresRService.class, timeout = 2000, document = "身份权限集的基础远程服务")
public class AcOperatorIdentityresRServiceImpl implements IAcOperatorIdentityresRService {

	@Autowired
	AcOperatorIdentityresService acOperatorIdentityresService;

	@Override
	public void insert(AcOperatorIdentityres t) {
		acOperatorIdentityresService.insert(t);
	}

	@Override
	public void update(AcOperatorIdentityres t) {
		acOperatorIdentityresService.update(t);
	}

	@Override
	public void updateForce(AcOperatorIdentityres t) {
		acOperatorIdentityresService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		acOperatorIdentityresService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		acOperatorIdentityresService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, AcOperatorIdentityres t) {
		acOperatorIdentityresService.updateByCondition(wc,t);
	}

	@Override
	public List<AcOperatorIdentityres> query(WhereCondition wc) {
		return acOperatorIdentityresService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return acOperatorIdentityresService.count(wc);
	}

	@Override
	public AcOperatorIdentityres loadByGuid(String guid) {
		return acOperatorIdentityresService.loadByGuid(guid);
	}

}
