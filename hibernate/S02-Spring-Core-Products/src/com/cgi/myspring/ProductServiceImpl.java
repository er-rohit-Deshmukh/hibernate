package com.cgi.myspring;

public class ProductServiceImpl implements ProductService {
  String products; //8.MacPro2021M1   16. MacAir2021M1
	
    public ProductServiceImpl() {
	
    }                             //6.
   public ProductServiceImpl(String products)
   {
	   this.products=products;  //7
   }                        
   
         //GoodEvening       //14
    public void setProducts(String products)
    {
    	this.products=products; //15
    }
   
	   //10      //18
    public void allProducts() {
		System.out.println("Hello :"+products);
		
		
	}
	
	

}
