//o Create a class hierarchy and demonstrate multilevel inheritance
package com.assingment;

//class father
//{
//	String name;
//	String car1;
//	String car2;
//	
//	public void setData()
//	{
//		name="rambhai";
//		car1="scorpio";
//		car2="thar";
//	}
//	
//	public void displayData()
//	{
//		System.out.println("father name:"+name);
//		System.out.println("father car 1:"+car1);
//		System.out.println("father car 2:"+car2);
//	}
//}
//
//class son1 extends father
//{
//	String s1name;
//	String scar1;
//	
//	public void SetData1()
//	{
//		s1name="dhruv";
//		scar1="scorpio";
//	}
//	public void displayData1()
//	{
//		System.out.println("son 1 name:"+s1name+" "+name);
//		System.out.println("son car:"+scar1);
//	}
//}
//
//class son2 extends father
//{
//	String s2name;
//	String scar2;
//	
//	public void SetData2()
//	{
//		s2name="suraj";
//		scar2="thar";
//	}
//	
//	public void displayData2()
//	{
//		System.out.println("son 1 name:"+s2name+" "+name);
//		System.out.println("son car:"+scar2);
//	}
//}


class son
{
	String name;
	public void setData()
	{
		name="kishan";
	}
}

class Fathername extends son
{
	String Fname;
	public void setData1()
	{
		setData();
		Fname="kanubhai";
	}
}

class Surename extends Fathername
{
	String Sname;
	public void setData2()
	{
		setData1();
		Sname="Bharwad";
	}
	public void displayData()
	{
		System.out.println("full name:"+name+" "+Fname+" "+Sname);
	}
}
public class  MultilLevelDemo_15 {

	public static void main(String[] args)
	{
		
		System.out.println("multilevel inheritance");
		
		Surename ob=new Surename();
		ob.setData2();
		ob.displayData();
//		System.out.println("hierarchy inheritance");
//		
//		son1 ob=new son1();
//		ob.setData();
//		ob.displayData();
//		ob.SetData1();
//		ob.displayData1();
//		
//		System.out.println("-----------------------");
//		
//		son2 obj=new son2();
//		obj.setData();
//		obj.displayData();
//		obj.SetData2();
//		obj.displayData2();
//	}
	
	}
}
