package com.cgi.myspring;

public class MyTest {

	public static void main(String[] args) {
		 
		
		GreetingServiceImpl greetingService1=new GreetingServiceImpl("GoodMorning");
		greetingService1.sayGreeting(); 
		
		GreetingServiceImpl greetingService2=new GreetingServiceImpl();
		greetingService2.setGreeting("GoodEvening");

		greetingService2.sayGreeting();
		
	}

}
