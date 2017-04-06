
/**
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.rservice.ac;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.tis.tools.base.WhereCondition;
import org.tis.tools.model.po.ac.AcOperatorShortcut;
import org.tis.tools.rservice.ac.IAcOperatorShortcutRService;
import org.tis.tools.service.ac.AcOperatorShortcutService;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * 操作员快捷菜单(AC_OPERATOR_SHORTCUT) 基本远程服务实现(服务提供者)
 * 
 * @author by generated by tools:gen-dao
 *
 */
//TEMPLATES
@Service(group = "ac", version = "1.0", interfaceClass = IAcOperatorShortcutRService.class, timeout = 2000, document = "操作员快捷菜单的基础远程服务")
public class AcOperatorShortcutRServiceImpl implements IAcOperatorShortcutRService {

	@Autowired
	AcOperatorShortcutService acOperatorShortcutService;

	@Override
	public void insert(AcOperatorShortcut t) {
		acOperatorShortcutService.insert(t);
	}

	@Override
	public void update(AcOperatorShortcut t) {
		acOperatorShortcutService.update(t);
	}

	@Override
	public void updateForce(AcOperatorShortcut t) {
		acOperatorShortcutService.updateForce(t);
	}

	@Override
	public void delete(String guid) {
		acOperatorShortcutService.delete(guid);
	}

	@Override
	public void deleteByCondition(WhereCondition wc) {
		acOperatorShortcutService.deleteByCondition(wc);
	}

	@Override
	public void updateByCondition(WhereCondition wc, AcOperatorShortcut t) {
		acOperatorShortcutService.updateByCondition(wc,t);
	}

	@Override
	public List<AcOperatorShortcut> query(WhereCondition wc) {
		return acOperatorShortcutService.query(wc);
	}

	@Override
	public int count(WhereCondition wc) {
		return acOperatorShortcutService.count(wc);
	}

	@Override
	public AcOperatorShortcut loadByGuid(String guid) {
		return acOperatorShortcutService.loadByGuid(guid);
	}

}
