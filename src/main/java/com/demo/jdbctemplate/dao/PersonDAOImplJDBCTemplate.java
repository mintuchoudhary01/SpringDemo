package com.demo.jdbctemplate.dao;

import java.util.List;

import javax.sql.DataSource;

import com.demo.jdbctemplate.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.demo.jdbctemplate.PersonMapper;

@Component
public class PersonDAOImplJDBCTemplate implements PersonDAO {

	// private DataSource dataSource;
   @Autowired
	NestedTransaction nestedTransaction;
	
	private JdbcTemplate jdbcTemplate;

	PersonDAOImplJDBCTemplate(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}

	public void create(String fname, String lname) {
		String SQL = "insert into person (firstname, lastname) values (?, ?)";
		System.out.println(jdbcTemplate);
		jdbcTemplate.update(SQL, fname, lname);
		System.out.println("Created Record Name = " + fname + " Lastname = " + lname);
	}

	@Override
	public List<Person> listPersons() {
		String SQL = "select * from person";
		List<Person> persons = jdbcTemplate.query(SQL, new PersonMapper());
		return persons;
	}

	@Override
	public Person getPerson(Integer id) {
		String SQL = "select * from person where id = ?";
		Person fetch_person = jdbcTemplate.queryForObject(SQL, new Object[] { id }, new PersonMapper());

		return fetch_person;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from person where id = ?";
		jdbcTemplate.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
	}

	@Override
 	@Transactional(propagation=Propagation.REQUIRED)
	public void update(Integer id, String fname) {
		String SQL = "update person set firstname = ? where id = ?";
		 try{
		System.out.println("in update method");
		jdbcTemplate.update(SQL, fname, id);
		System.out.println("Updated Record with ID = " + id + " with name " + fname);
      
		
				
	
		nestedTransaction.update2(jdbcTemplate,7, "sss");
	
	   }catch(Exception e){}
	}

}
