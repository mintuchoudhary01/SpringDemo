package com.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class CustImpl implements Cust {
	@Autowired
	Address service;

	@Override
	public void printCust(String name) {
		System.out.println("Hello : " + name);

		service.printAddressLine("Pune: passed from CustImpl to Address.printAddressLine(..) ");
	}

}
