package com.demo.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppEvent {
   public static void main(String[] args) {
      ConfigurableApplicationContext context = 
         new ClassPathXmlApplicationContext("spring.xml");

      // Let us raise a start event.
      context.start();
	  
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      
      //context.refresh();

      // Let us raise a stop event.
      context.stop();
      
      context.close(); //either will work from stop/close
   }
}