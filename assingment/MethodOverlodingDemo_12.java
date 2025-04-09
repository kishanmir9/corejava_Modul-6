//o Implement method overloading by creating methods for different data types.
package com.assingment;

import java.util.Scanner;

class Area1
{
	
	public void area()
	{
		float pi=3.14f;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of R:");
		float r=sc.nextFloat();
		
		float ans=pi*r*r;
		System.out.println("This is the area of recteguler..."+ans);
		
		
	}
	public void area(int a)
	{
		int ans=a*a*a;
		System.out.println("This is the area of cirecle..."+ans);
		
		
	}
	public void area(float b,float h)
	{
		float ans=((b*h)/2);
		System.out.println("This is the area of tragulaer.."+ans);
	}
}
public class MethodOverlodingDemo_12
{
	public static void main(String[] args) 
	{
		Area1 a=new Area1();
		a.area();
		a.area(5);
		a.area(4f,5f);
	}
}
