//o Implement string comparison using equals() and compareTo() methods.
package com.assingment;

import java.util.Scanner;

public class StringConparisonDemo_21 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str="hello ram";
		System.out.println("enter the string1:");
		String str1=sc.nextLine();
		
		System.out.println(str.equals(str1));
		System.out.println(str.compareTo(str1));

	}

}
