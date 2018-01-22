package com.demo;

import org.springframework.stereotype.Component;

public class Triangle {
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
}
