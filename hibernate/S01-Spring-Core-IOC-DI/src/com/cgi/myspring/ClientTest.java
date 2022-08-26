package com.cgi.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ClientTest {

	public static void main(String[] args) { //1.
		                                                 //2
	ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		                            //3
		GreetingService gs1=(GreetingService)factory.getBean("greetingService1");
		   //9
		gs1.sayGreeting();
		
		//11
		GreetingService gs2=(GreetingService)factory.getBean("greetingService2");
		
		//17
		gs2.sayGreeting();
		
				
	}  //19
} //20
