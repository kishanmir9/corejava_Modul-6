//o Create a HashMap to store and retrieve key-value pairs.
package com.assingment;

import java.util.HashMap;
import java.util.Map;

public class HasmapDemo_39 {

	public static void main(String[] args)
	{
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "rohan");
		map.put(4, "meru");
		map.put(5, "kishan");
		
		System.out.println("Value for key 2 : "+map.get(2));
		System.out.println("Value for key 4 : "+map.get(4));
		
		for(Map.Entry<Integer,String> entry : map.entrySet())
		{
			System.out.println(entry.getKey() +" : "+ entry.getValue());
		}

	}

}
