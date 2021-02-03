package com.demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

public class Triangle implements BeanNameAware {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw()  {
		System.out.print("Traingle:In draw method -->" + getType());
	//	throw new IllegalArgumentException();
	}

	@Override
	public void setBeanName(String arg0) {
		 System.out.println(arg0);
		
	}
}
