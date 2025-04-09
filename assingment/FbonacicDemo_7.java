//o Write a program to display the Fibonacci series using a loop.
package com.assingment;

public class FbonacicDemo_7 {

	public static void main(String[] args)
	{
		int a=0,b=1;
		System.out.println("Fibonacci series..");
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<5;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}

}
