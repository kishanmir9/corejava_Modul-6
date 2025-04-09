package com.modifiers;

public class simpleDemo {

	public int id;
	private int age;
	protected String name;
	String address;
	
	public void set(int id)
	{
		this.id=id;
	}
	private void set1(int age)
	{
		this.age=age;
	}
	protected void set2(String name)
	{
		this.name=name;
	}
	void set3(String address)
	{
		this.address=address;
	}
	public void print()
	{
		System.out.println("Id is.."+id);
		System.out.println("Age is.."+age);
		System.out.println("Name is.."+name);
		System.out.println("Address is.."+address);
	}
}
