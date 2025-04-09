//o Write a program to find the maximum of three numbers using a method
package com.assingment;

import java.util.Scanner;

class max
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	
	public void getMaxNo()
	{
		System.out.println("Enter the a,b,c :");
		a = sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		if(a>b && b>c)
		{
			System.out.println("A is Max :"+a);
		}
		else if(b>c && b>a)
		{
			System.out.println("B is Max :"+b);
		}
		else
		{
			System.out.println("C is Max :"+c);
		}
	}
	
}
public class MaximumDemo_11
{

	public static void main(String[] args)
	{
			max m=new max();
			m.getMaxNo();
	}

}
