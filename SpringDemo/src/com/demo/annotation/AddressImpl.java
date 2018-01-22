package com.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class AddressImpl implements Address {

	@Override
	public void printAddressLine(String addLine) {
		 System.out.println("Address is : "+ addLine);
	}
	
}
