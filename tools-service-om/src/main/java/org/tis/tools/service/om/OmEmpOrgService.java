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

import org.tis.tools.dao.mapper.om.OmEmpOrgMapper;
import org.tis.tools.model.po.om.OmEmpOrg;


/**
 * 员工隶属机构关系表(OM_EMP_ORG)数据的基础业务逻辑
 * @author by generated by tools:gen-dao
 *
 */
@Service
public class OmEmpOrgService {

	@Autowired
	OmEmpOrgMapper omEmpOrgMapper;
	
    public void insert(OmEmpOrg t){
    	omEmpOrgMapper.insert(t);
    }
    
    public void update(OmEmpOrg t){
    	omEmpOrgMapper.update(t); 
    }
   
    public void updateForce(OmEmpOrg t){
    	omEmpOrgMapper.updateForce(t); 
    }
   
    public void delete(String guid){
    	omEmpOrgMapper.delete(guid);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	omEmpOrgMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,OmEmpOrg t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	omEmpOrgMapper.updateByCondition(map); 
    }

    public List<OmEmpOrg> query(WhereCondition wc){
    	return omEmpOrgMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return omEmpOrgMapper.count(wc);
    }
   
    public OmEmpOrg loadByGuid(String guid){
    	return omEmpOrgMapper.loadByGuid(guid);
    }
}
