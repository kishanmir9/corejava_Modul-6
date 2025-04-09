//o Create a class Student with attributes (name, age) and a method to display the
//details.

package com.assingment;
class student
{
	int age;
	String name;
	public void getData()
	{
		 age=21;
		 name="kishan";
		
	}
	public void displayData()
	{
		System.out.println("Student age is.."+age);
		System.out.println("Student name is.."+name);
	}
}
public class StudentDetailDemo_8 
{
	public static void main(String[] args) 
	{
		student s=new student();
		s.getData();
		s.displayData();
		
	}
}
