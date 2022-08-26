package com.cgi.myspring;

public class GreetingServiceImpl implements GreetingService {
  String greeting; //8. GoodMorning  16//GoodEvening
	
    public GreetingServiceImpl() {
	
    }                             //6.
   public GreetingServiceImpl(String greeting)
   {
	   this.greeting=greeting;  //7
   }                        
   
         //GoodEvening       //14
    public void setGreeting(String greeting)
    {
    	this.greeting=greeting; //15
    }
   
	@Override   //10      //18
	public void sayGreeting() {
		System.out.println("Hello :"+greeting);
		
		
	}
	
	

}
