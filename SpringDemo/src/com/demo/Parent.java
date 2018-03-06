package com.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component(value="parentBean")
public class Parent implements ApplicationContextAware,  BeanNameAware ,BeanFactoryAware { //BeanFactoryAware
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

	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		Parent parentBean = applicationContext.getBean("parentBean", Parent.class);
		System.out.println("ApplicationContextAware - setApplicationContext () : child bean "+parentBean.getChild());
	}
	

	@Override
	public void setBeanName(String beanName) {
		System.out.println("BeanNameAware - setBeanName()  beanName :"+ beanName);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    
		System.out.println("BeanFactoryAware - setBeanFactory() "+beanFactory.getBean("parentBean"));
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