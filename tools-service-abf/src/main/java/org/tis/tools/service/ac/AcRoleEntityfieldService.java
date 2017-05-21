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

import org.tis.tools.dao.ac.AcRoleEntityfieldMapper;
import org.tis.tools.model.po.ac.AcRoleEntityfield;


/**
 * 角色与实体属性关系(AC_ROLE_ENTITYFIELD)数据的基础业务逻辑
 * @author by generated by tools:gen-dao
 *
 */
@Service
public class AcRoleEntityfieldService {

	@Autowired
	AcRoleEntityfieldMapper acRoleEntityfieldMapper;
	
    public void insert(AcRoleEntityfield t){
    	acRoleEntityfieldMapper.insert(t);
    }
    
    public void update(AcRoleEntityfield t){
    	acRoleEntityfieldMapper.update(t); 
    }
   
    public void updateForce(AcRoleEntityfield t){
    	acRoleEntityfieldMapper.updateForce(t); 
    }
   
    public void delete(String guid){
    	acRoleEntityfieldMapper.delete(guid);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	acRoleEntityfieldMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,AcRoleEntityfield t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	acRoleEntityfieldMapper.updateByCondition(map); 
    }

    public List<AcRoleEntityfield> query(WhereCondition wc){
    	return acRoleEntityfieldMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return acRoleEntityfieldMapper.count(wc);
    }
   
    public AcRoleEntityfield loadByGuid(String guid){
    	return acRoleEntityfieldMapper.loadByGuid(guid);
    }
}