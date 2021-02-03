package com.demo.jdbctemplate;

import java.util.List;

import com.demo.jdbctemplate.dao.PersonDAOImplJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * SETUP ORACLE DB PRIOR TO CODING
 * Create table as : 
 * CREATE TABLE Person(
        ID int  not null,
        FIRSTNAME VARCHAR(20) NOT NULL,
        LASTNAME VARCHAR(20) NOT NULL,
        PRIMARY KEY (ID)
    );

CREATE SEQUENCE dept_seq START WITH 1;

CREATE OR REPLACE TRIGGER person_id_tgr
  BEFORE INSERT ON person
  FOR EACH ROW
BEGIN
  :new.id := person_id_seq.nextval;
END;

 * 
 * 
 * */

public class PersonJdbcTemplateMain {

	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		PersonDAOImplJDBCTemplate personDAOImplJDBCTemplate = (PersonDAOImplJDBCTemplate) context.getBean("personDAOImplJDBCTemplate");
		personDAOImplJDBCTemplate.create("Mintu", "Choudhary");
		personDAOImplJDBCTemplate.create("Yogesh", "Verma");

		System.out.println("------Listing Multiple Records--------");
		List<Person> allpersons = personDAOImplJDBCTemplate.listPersons();

		for (Person record : allpersons) {
			System.out.print(" ID : " + record.getId());
			System.out.print(" Name : " + record.getFirstname());
			System.out.println(" Last : " + record.getLastname());
		}

		System.out.println("------Fetch Person Records By id--------3");
		Person person = personDAOImplJDBCTemplate.getPerson(3);
		System.out.print("ID : " + person.getId());
		System.out.print("FirstName : " + person.getFirstname());
		System.out.println("LastName : " + person.getLastname());

		System.out.println("------Deleting Person having id--------5");
		personDAOImplJDBCTemplate.delete(5);

		System.out.println("------Updating person name having id--------4");
		
		personDAOImplJDBCTemplate.update(3, "ttt");

	}
}
