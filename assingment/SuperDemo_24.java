//o Use the super keyword to call the parent class constructor and methods.
package com.assingment;
class base
{
	String name="kishan";

}

class derived extends base
{
	String name="meru";
	
	public void getvalue()
	{
		System.out.println("derived class:"+super.name);
	}
}

public class SuperDemo_24 {

	public static void main(String[] args) 
	{
		derived ob=new derived();
		ob.getvalue();
	}

}
	
		
	


