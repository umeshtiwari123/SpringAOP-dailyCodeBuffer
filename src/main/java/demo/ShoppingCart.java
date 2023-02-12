package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

	public void checkout(String status)
	{
		//Logging
		//Authentication and Authorization
		//Sanitize the Data
		System.out.println("checkout method from Shopping Cart called");
	}
	
	public int quantity()
	{
		return 2;
	}
}
