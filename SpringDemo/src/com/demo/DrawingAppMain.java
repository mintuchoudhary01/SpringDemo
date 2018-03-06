package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingAppMain {
	public static void main(String args[]) {
		// BeanFactory factory= new XmlBeanFactory(new
		// FileSystemResource("spring.xml"));
		// Triangle triangle = (Triangle) factory.getBean("triangle");

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	/*	Triangle triangle = (Triangle) context.getBean("proxy");

		Triangle triangle1 = (Triangle) context.getBean("triangle", Triangle.class);
		Triangle triangle2 = (Triangle) context.getBean("triangle2", Triangle.class);
		Triangle triangle3 = (Triangle) context.getBean("triangle2", Triangle.class);
		Triangle triangle4 = (Triangle) context.getBean("triangle", Triangle.class);
		
		System.out.println(triangle1);
		System.out.println(triangle4);
		System.out.println(triangle2);
		System.out.println(triangle3);*/

		Triangle triangle1 = (Triangle) context.getBean("triangle", Triangle.class);
		triangle1.draw();
		Parent parentBean = context.getBean("parentBean", Parent.class);

	//	Parent parentBean1 = (Parent) context.getBean("parentBean", Parent.class);

		System.out.println("child1==" + parentBean.getChild() + " child2==" + parentBean.getChild() + "  parent: " + parentBean.getName()); // child==com.demo.Child@2ddc8ecb
																							// parent:
																							// com.demo.Parent@229d10bd
		
		System.out.println("child==" + parentBean.getChild().getId());
		
		Parent parentBean2 = context.getBean("parentBean", Parent.class);

		//System.out.println("child==" + parentBean1.getChild() + "  parent: " + parentBean1);

		/*
		 * try { triangle.draw(); } catch (Exception e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
	}
}
