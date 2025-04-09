//o Demonstrate type casting (explicit and implicit).

package com.assingment;

public class CastingDemo_4 
{
	public static void main(String[] args) 
	{
		int a=10;
		float b=20.20f,ans;
		
		 ans=a+b;
		System.out.println(ans);
		
		int ans1;
		ans1=a+(int)b;
		System.out.println(ans1);
	}
}
