package com.java8;

public interface Java8FeaturesInterface {

	void calculate();
	default void display()
	{
		System.out.println("helllo: in display method");
	}
	
	static void print()
	{
		System.out.println("printing data... from static method");
	}
}