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

import org.tis.tools.dao.jnl.JnlPromotingMapper;
import org.tis.tools.model.po.jnl.JnlPromoting;


/**
 * 营销流水(JNL_PROMOTING)数据的基础业务逻辑
 * @author by generated by tools:gen-dao
 *
 */
@Service
public class JnlPromotingService {

	@Autowired
	JnlPromotingMapper jnlPromotingMapper;
	
    public void insert(JnlPromoting t){
    	jnlPromotingMapper.insert(t);
    }
    
    public void update(JnlPromoting t){
    	jnlPromotingMapper.update(t); 
    }
   
    public void updateForce(JnlPromoting t){
    	jnlPromotingMapper.updateForce(t); 
    }
   
    public void delete(String guid){
    	jnlPromotingMapper.delete(guid);
    }
   
    public void deleteByCondition(WhereCondition wc){
    	jnlPromotingMapper.deleteByCondition(wc); 
    }
	
	public void updateByCondition(WhereCondition wc,JnlPromoting t){
    	Map map  = new HashMap();
    	map.put("domain", t);
    	map.put("wc", wc);
    	jnlPromotingMapper.updateByCondition(map); 
    }

    public List<JnlPromoting> query(WhereCondition wc){
    	return jnlPromotingMapper.query(wc); 
    }
    
    public int count(WhereCondition wc){
    	return jnlPromotingMapper.count(wc);
    }
   
    public JnlPromoting loadByGuid(String guid){
    	return jnlPromotingMapper.loadByGuid(guid);
    }
}
