//o Write a program that demonstrates inheritance using extends keyword.
package com.assingment;
class a
{
	public void getData()
	{
		System.out.println("class a");
	}
}

class b extends a
{
	public void putData()
	{
		System.out.println("class b");
	}
}
public class InheritanceDemo_22 {

	public static void main(String[] args) 
	{
		
		b ob=new b();
		ob.getData();
		ob.putData();
		
		
	}

}
