package com.assingment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteDemo_32
{

	public static void main(String[] args)
	{
		  try 
	        {
			  	FileWriter fw = new FileWriter("Assignment.txt");
	            fw.write("Hello, Sir");  
	            fw.write("This is My Assignment topic.....");
	            fw.flush();
	            fw.close();
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();  
	        }
	        try 
	        {
	        	FileReader fr = new FileReader("Assignment.txt");
	            int i;
	            while ((i = fr.read()) != -1) 
	            {
	                System.out.print((char) i);  
	            }
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();  
	     }
	 }

		
	

}
