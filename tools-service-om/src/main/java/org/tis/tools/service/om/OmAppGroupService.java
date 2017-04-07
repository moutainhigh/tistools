/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.service.om;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.tis.tools.base.WhereCondition;

import org.tis.tools.dao.mapper.om.OmAppGroupMapper;
import org.tis.tools.model.po.om.OmAppGroup;


/**
 * 应用工作组列表(OM_APP_GROUP)数据的基础业务逻辑
 * @author by generated by tools:gen-dao
 *
 */
@Service
public class OmAppGroupService {

	@Autowired
	OmAppGroupMapper omAppGroupMapper;
	
    public void insert(OmAppGroup t){
    	omAppGroupMapper.insert(t);
    }
    
    public void update(OmAppGroup t){
    	omAppGroupMapper.update(t); 
    }
   
    public void updateForce(OmAppGroup t){
    	omAppGroupMapper.updateForce(t); 
    }
   
    public void delete(String guid){
    	omAppGroupMapper.delete(guid);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	omAppGroupMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,OmAppGroup t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	omAppGroupMapper.updateByCondition(map); 
    }

    public List<OmAppGroup> query(WhereCondition wc){
    	return omAppGroupMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return omAppGroupMapper.count(wc);
    }
   
    public OmAppGroup loadByGuid(String guid){
    	return omAppGroupMapper.loadByGuid(guid);
    }
}
