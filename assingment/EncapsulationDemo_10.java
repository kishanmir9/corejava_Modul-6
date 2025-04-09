//o Implement a simple class with getters and setters for encapsulation.
package com.assingment;
class simple
{
	private int age;
	private String name;
	
	public void setData()
	{
		age=21;
		name="ram";
	}
	
	public void getData()
	{
		System.out.println(age);
		System.out.println(name);
	}
	
}
public class EncapsulationDemo_10 {

	public static void main(String[] args) {
		
		simple s=new simple();
		s.setData();
		s.getData();

	}

}
