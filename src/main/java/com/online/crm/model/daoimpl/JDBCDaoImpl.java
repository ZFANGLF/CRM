package com.nexcool.crm.model.daoimpl;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nexcool.crm.model.beans.DataBeans;
import com.nexcool.crm.model.dao.Dao;

/**
 * @Package: com.nexcool.crm.model.daoimpl 
 * @ClassName: DaoImpl.java
 * @Description: 数据库查询实现类
 *
 * @version: v1.0.0
 * @author: Sundy
 * @date: 2018年4月10日 下午4:56:43 
 *
 * Modification History:
 * Date 		Author 		Version 	Description
 *------------------------------------------------------------*
 * 2018年4月10日 		Sundy 		v1.0.0 		修改原因
 *
 * Copyright: Copyright (c) 2018 nexcool.com All rights reserved.
**/
public class DaoImpl implements Dao {
	
	private String tableName;
	
	private ApplicationContext ctx= null;  
    private JdbcTemplate jdbcTemplate = null; 
	
	/**   
	 * @Function: DaoImpl
	 * @Description: 构造方法
	 *
	 * @param tableName 查询的数据表
	 * @version: v1.0.0
	 * @author: Sundy
	 * @date: 2018年4月10日 下午4:55:51 
	**/
	public DaoImpl(String tableName) {
		this.tableName = tableName;
		this.ctx = new ClassPathXmlApplicationContext("/webapp/WEB-INF/spring/appServlet/servlet-context.xml");  
        this.jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate"); 
	}

	/** 
	 * @see com.nexcool.crm.model.dao.Dao#create(com.nexcool.crm.model.beans.DataBeans)  
	 * @Function: DaoImpl.java
	 * @Description: 插入一条数据的方法
	 *
	 * @param beans
	 * @return int
	 * @throws：
	 *
	 * @version: v1.0.0
	 * @author: Sundy
	 * @date: 2018年4月10日 下午4:57:14 
	 *
	 * Modification History:
	 * Date 		Author 		Version 	Description
	 *------------------------------------------------------------*
	 * 2018年4月10日 		Sundy 		v1.0.0 		修改原因
	**/
	@Override
	public int create(DataBeans beans) {
		String sql = "INSERT INTO " + tableName + " " +beans.getFields() + " " + " VALUES " + beans.getValue();
		int rows = jdbcTemplate.update(sql);
		return rows;
	}

	@Override
	public Boolean delete(DataBeans beans) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(DataBeans beans) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DataBeans find(String condition) {
		String sql = "SELECT * FROM " + tableName + " WHERE " + condition;
		return null;
	}

	@Override
	public ArrayList<DataBeans> select(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count(String condition) {
		// TODO Auto-generated method stub
		return 0;
	}

}
