package com.demo.jdbctemplate.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class NestedTransaction {

 	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void update2(JdbcTemplate jdbcTemplate, Integer id, String fname) 
	{
		String SQL = "update person set firstname = ? where id = ?";
		jdbcTemplate.update(SQL, fname, id);
	  
		int i = 2/0;
	 
		System.out.println("22-> Updated Record with ID = " + id + " with name " + fname);
		}
	
}
