//o Write a program to demonstrate exception handling using try-catch-finally.
package com.assingment;

public class TryCatchfinallyDemo_28 {

	public static void main(String[] args)
	{
		try
		{
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
			
		}
		catch (Exception e) 
		{
				System.out.println(e);
				
				e.printStackTrace();
		}
		
		finally 
		{
			System.out.println("thankyou");
		}
		

	}

}
