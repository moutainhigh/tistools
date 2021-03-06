/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.service.ac;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.tis.tools.base.WhereCondition;

import org.tis.tools.dao.ac.AcRoleEntityMapper;
import org.tis.tools.model.po.ac.AcRoleEntity;


/**
 * 角色实体关系(AC_ROLE_ENTITY)数据的基础业务逻辑
 * @author by generated by tools:gen-dao
 *
 */
@Service
public class AcRoleEntityService {

	@Autowired
	AcRoleEntityMapper acRoleEntityMapper;
	
    public void insert(AcRoleEntity t){
    	acRoleEntityMapper.insert(t);
    }
    
    public void update(AcRoleEntity t){
    	acRoleEntityMapper.update(t); 
    }
   
    public void updateForce(AcRoleEntity t){
    	acRoleEntityMapper.updateForce(t); 
    }
   
    public void delete(String guid){
    	acRoleEntityMapper.delete(guid);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	acRoleEntityMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,AcRoleEntity t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	acRoleEntityMapper.updateByCondition(map); 
    }

    public List<AcRoleEntity> query(WhereCondition wc){
    	return acRoleEntityMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return acRoleEntityMapper.count(wc);
    }
   
    public AcRoleEntity loadByGuid(String guid){
    	return acRoleEntityMapper.loadByGuid(guid);
    }
}
