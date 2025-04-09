//o Create multiple constructors in a class and demonstrate constructor overloading.
package com.assingment;
class Sum2
{
	int x,y;
	
	public Sum2()
	{
		x=10;
		y=20;
		System.out.println(x+y);
	}
	public Sum2(int a)
	{
		x=a;
		y=a;
		System.out.println(x+y);
	}
	public Sum2(int a,int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
}
public class ConstructorOverlodingDemo_9 
{
	public static void main(String[] args) {
		
	Sum2 s=new Sum2();
	new Sum2(5);
	new Sum2(5,6);
		
	}
}
