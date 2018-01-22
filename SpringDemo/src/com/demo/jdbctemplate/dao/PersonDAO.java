package com.demo.jdbctemplate.dao;

import java.util.List;

import javax.sql.DataSource;

import com.demo.jdbctemplate.Person;

public interface PersonDAO {
 
	  /** 
     * This is the method to be used to initialize
     * database resources ie. connection.
  */
 // public void setDataSource(DataSource datasource);
  
  /** 
     * This is the method to be used to create
     * a record in the Person table.
  */
  public void create(String fname,String lname);
  
  /** 
     * This is the method to be used to list down
     * a record from the Person table corresponding
     * to a passed Person id.
  */
  public Person getPerson(Integer id);
  
  /** 
     * This is the method to be used to list down
     * all the records from the Person table.
  */
  public List<Person> listPersons();
  
  /** 
     * This is the method to be used to delete
     * a record from the Person table corresponding
     * to a passed Person id.
  */
  public void delete(Integer id);
  
  /** 
     * This is the method to be used to update
     * a record into the Person table.
  */
  public void update(Integer id, String fname);

}
