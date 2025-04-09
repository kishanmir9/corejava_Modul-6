//o Create a program to reverse a string and check for palindromes.
package com.assingment;

import java.util.Scanner;

public class StringPelidromDemo_20 {

	public static void main(String[] args)
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.next();
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
			
		}
		if(rev.equals(s))
		{
			System.out.println("Is a Palindromes Stirng.");
		}
		else
		{
			System.out.println("Is a not Palindromes Stirng.");
		}
		
	}

}
