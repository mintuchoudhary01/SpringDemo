package com.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleSpringBean implements InitializingBean, DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
	 System.out.println("InitializingBean - afterPropertiesSet() ..After properities are set");
		
	}
  //DisposableBean
	@Override
	public void destroy() throws Exception {
		 System.out.println("DisposableBean - destroy() ..Before IOC container is destroyed");
		
	}

}
