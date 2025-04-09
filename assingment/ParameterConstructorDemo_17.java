//o Write a program to create and initialize an object using a parameterized constructor.
package com.assingment;
class A
{
	int k,b,c;
	public   A(int k)
	{
		System.out.println(k*k);
	}
	public  A(int k,int b)
	{
		System.out.println(k+b);
	}
	public  A(int k,int b,int c)
	{
		System.out.println(k+b+c);
	}
	
}
public class ParameterConstructorDemo_17 {
	public static void main(String[] args) {
		
		A ob=new A(5);
		new A(5,6);
		new A(5,6,7);
		
//		ob.A(5);
	}
}
