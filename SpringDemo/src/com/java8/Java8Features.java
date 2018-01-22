package com.java8;
import java.util.Arrays;
import java.util.List;

class Java8Features implements Java8FeaturesInterface {

	@Override
	public void calculate() {
		System.out.println("in cal method");

	}

	/*public void display() {
		System.out.println("Java8Features: in display  method");

	}*/
}

interface A
{
  public void show(); 


}
class C implements A
{
	@Override
	public void show()
	{
	System.out.println("in show method");	
	}

}

class Java8FeaturesDemo {
	public static void main(String a[]) {
		
		Java8Features obj = new Java8Features();
		obj.calculate();
		obj.display();
		
		Java8FeaturesInterface.print();
		
		/*****************************************************************/
		List<Integer> values = Arrays.asList(2,4,6,7,3,9);
	
		//old 
		//for (int i=0;i<values.size();i++)	{ 	System.out.println(i); 		}
		
		//new : foreach features
		values.forEach(i -> System.out.println(i));
		
		//lamda expression
	/*	A obj2;
		obj2= new A() {
			public void show()
			{
			System.out.println("in show");	
			}
		};
		obj2.show();
		*/
		
		
		A obj2 = () -> {System.out.println("in show 2");};
		obj2.show();
	}
}
