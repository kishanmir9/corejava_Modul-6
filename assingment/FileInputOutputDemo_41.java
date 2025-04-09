package com.assingment;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputDemo_41 {

	public static void main(String[] args) {
		try 
		{
			FileInputStream fis=new FileInputStream("Assignment.txt");
			FileOutputStream fos=new FileOutputStream("Assignmentcopy.txt");

		int data;
		while((data = fis.read())!= -1)
		{
			fos.write(data);
//			System.out.print((char)data);
		}
		System.out.println("File copied Succesfully....");
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
