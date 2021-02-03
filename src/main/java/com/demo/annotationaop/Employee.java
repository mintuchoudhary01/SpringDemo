package com.demo.annotationaop;

public class Employee {

private String name;
	
	public String getName() {
		return name;
	}

//	@Loggable
	public void setName(String nm) {
		this.name=nm;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception thrown from Employee");
	}	

	public void setName(String fn,String ln) {

     System.out.println(fn+" "+ln);
	}

}

