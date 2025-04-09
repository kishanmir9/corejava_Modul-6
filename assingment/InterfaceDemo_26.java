package com.assingment;

class interface2 implements techer,InterDemo_26
{
	@Override
	public void get() {
		System.out.println("Salary is.."+salary);
		System.out.println("Fname is.."+fname);
		System.out.println("Subject is.."+sub);
		
		
	}
	@Override
	public void get1() {
		System.out.println("Branch name is.."+bname);
		System.out.println("Address is.."+add);
		
	}
	
}
public class InterfaceDemo_26 {

	public static void main(String[] args) {
		interface2 ob=new interface2();
		ob.get();
		ob.get1();

	}

}
