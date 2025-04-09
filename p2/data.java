package com.p2;

public class data {
	int id,age;
	String name;
	
	public void setData(int id,int age,String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
		
	}
	
	public void displayData()
	{
		System.out.println("Id is.."+id);
		System.out.println("Age is.."+age);
		System.out.println("Name is.."+name);
	}

}
