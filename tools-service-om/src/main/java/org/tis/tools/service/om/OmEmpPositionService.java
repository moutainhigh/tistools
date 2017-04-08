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

import org.tis.tools.dao.mapper.om.OmEmpPositionMapper;
import org.tis.tools.model.po.om.OmEmpPosition;


/**
 * 员工岗位对应关系(OM_EMP_POSITION)数据的基础业务逻辑
 * @author by generated by tools:gen-dao
 *
 */
@Service
public class OmEmpPositionService {

	@Autowired
	OmEmpPositionMapper omEmpPositionMapper;
	
    public void insert(OmEmpPosition t){
    	omEmpPositionMapper.insert(t);
    }
    
    public void update(OmEmpPosition t){
    	omEmpPositionMapper.update(t); 
    }
   
    public void updateForce(OmEmpPosition t){
    	omEmpPositionMapper.updateForce(t); 
    }
   
    public void delete(String guid){
    	omEmpPositionMapper.delete(guid);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	omEmpPositionMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,OmEmpPosition t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	omEmpPositionMapper.updateByCondition(map); 
    }

    public List<OmEmpPosition> query(WhereCondition wc){
    	return omEmpPositionMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return omEmpPositionMapper.count(wc);
    }
   
    public OmEmpPosition loadByGuid(String guid){
    	return omEmpPositionMapper.loadByGuid(guid);
    }
}
