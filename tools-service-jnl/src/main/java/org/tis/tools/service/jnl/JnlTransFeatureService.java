/**
 * auto generated
 * Copyright (C) 2016 bronsp.com, All rights reserved.
 */
package org.tis.tools.service.jnl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.tis.tools.base.WhereCondition;

import org.tis.tools.dao.jnl.JnlTransFeatureMapper;
import org.tis.tools.model.po.jnl.JnlTransFeature;


/**
 * 交易业务要素(JNL_TRANS_FEATURE)数据的基础业务逻辑
 * @author by generated by tools:gen-dao
 *
 */
@Service
public class JnlTransFeatureService {

	@Autowired
	JnlTransFeatureMapper jnlTransFeatureMapper;
	
    public void insert(JnlTransFeature t){
    	jnlTransFeatureMapper.insert(t);
    }
    
    public void update(JnlTransFeature t){
    	jnlTransFeatureMapper.update(t); 
    }
   
    public void updateForce(JnlTransFeature t){
    	jnlTransFeatureMapper.updateForce(t); 
    }
   
    public void delete(String guid){
    	jnlTransFeatureMapper.delete(guid);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	jnlTransFeatureMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,JnlTransFeature t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	jnlTransFeatureMapper.updateByCondition(map); 
    }

    public List<JnlTransFeature> query(WhereCondition wc){
    	return jnlTransFeatureMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return jnlTransFeatureMapper.count(wc);
    }
   
    public JnlTransFeature loadByGuid(String guid){
    	return jnlTransFeatureMapper.loadByGuid(guid);
    }
}