//o Create an abstract class and implement its methods in a subclass
package com.assingment;
abstract class info
{
	int id;
	String name,departmant;
	public abstract void getData();
	
}
class detaile extends info
{
	@Override
	public void getData() {
		id=105;
		name="kishan";
		departmant="It";
		
	}
	public void display()
	{
		System.out.println("Id:"+id);
		System.out.println("name:"+name);
		System.out.println("departmant:"+departmant);
	}
}
public class AbtractClassDemo_25 {
	public static void main(String[] args) {
		 detaile ob=new detaile();
		 ob.getData();
		 ob.display();
	}
}
