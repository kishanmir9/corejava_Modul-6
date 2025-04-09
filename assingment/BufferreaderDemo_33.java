package com.assingment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferreaderDemo_33 {

	public static void main(String[] args) {
		
		try {
			BufferedReader br=null;
			br=new BufferedReader(new FileReader("Assignment.txt"));

			String line;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
