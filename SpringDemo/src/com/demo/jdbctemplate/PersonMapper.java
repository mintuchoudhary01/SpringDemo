package com.demo.jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		System.out.println("rowNum="+rowNum);
		Person person = new Person();
		person.setId(rs.getInt("id"));
		person.setFirstname(rs.getString("firstname"));
		person.setLastname(rs.getString("lastname"));
		return person;
	}

}
