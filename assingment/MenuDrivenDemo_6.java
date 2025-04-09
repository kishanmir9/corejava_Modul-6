//o Implement a simple menu-driven program using a switch-case.
package com.assingment;

import java.util.Scanner;

public class MenuDrivenDemo_6 {

	public static void main(String[] args)
	{

		int a=40,b=20;
		int choice;
		
		System.out.println("---------------------------");
		System.out.println("1.Addition");
		System.out.println("2.Sutraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modual");
		System.out.println("6.Exit");
		System.out.println("---------------------------");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice:");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Addition:"+(a+b));
			break;
			
		case 2:
			System.out.println("Subtraction:"+(a-b));
			break;
		
		case 3:
			System.out.println("Multiplication:"+(a*b));
			break;
		
		case 4:
			System.out.println("Division:"+(a/b));
			break;
			
		case 5:
			System.out.println("Modual:"+(a%b));
			break;
			
		case 6:
			System.out.println("Exit the program");
			System.exit(0);
			
		}
	}

}
