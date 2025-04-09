//o Demonstrate constructor overloading by passing different types of parameters.
package com.assingment;

import java.util.Scanner;

class Area
{
	
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
public class MethodOverLodingDemo_18
{
	public static void main(String[] args) 
	{
		Area a=new Area();
		a.area(5);
		a.area(4f,5f);
	}
}

