package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component(value="parentBean")
public class Parent {
	String name;

	Child child;
	
	/*public Parent() {
		// TODO Auto-generated constructor stub
	}
*/
	public Parent(Child child) {
		super();		
		this.child = child;
	}

	public Child getChild() {
		return child;
	}
	
	public void setChild(Child child) {
		this.child = child;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}

//@Component
class Child {

	public Child() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

private	int id;
	}