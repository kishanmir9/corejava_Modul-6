//o Write a program demonstrating single inheritance
package com.assingment;
class perent
{
	int id;
	String name;
	String branch;
	public void getData() {
		id=1;
		name="kishan";
		branch="I-msc-(it)";
	}
	
}
class chaild extends perent
{
	public void displayData()
	{
		System.out.println("Id is.."+id);
		System.out.println("Name is..."+name);
		System.out.println("Branch name is..."+branch);
	}
	
}
public class SingleInheritanceDemo_14 {

	public static void main(String[] args)
	{
		
		chaild ch=new chaild();
		ch.getData();
		ch.displayData();
	}

}
