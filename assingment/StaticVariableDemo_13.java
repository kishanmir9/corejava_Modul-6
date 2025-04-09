//o Create a class with static variables and methods to demonstrate their use.
package com.assingment;
class car
{
	static String cname;
	static String company;
	public static void setData()
	{
		cname="nexon";
		company="tata";
	}
	public void displayData()
	{
		System.out.println("car name:"+cname);
		System.out.println("car company:"+company);
	}
}
public class StaticVariableDemo_13
{

	public static void main(String[] args)
	{
		car c=new car();
		c.setData();
		c.displayData();

	}

}
