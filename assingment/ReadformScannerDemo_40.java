package com.assingment;

import java.util.Scanner;

public class ReadformScannerDemo_40 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name :- ");
		String name=sc.nextLine();
		
		System.out.println("Enter your age :- ");
		int age=sc.nextInt();
		
		System.out.println("your name is :- "+name);
		System.out.println("your age is :- "+age);
		

	}

}
