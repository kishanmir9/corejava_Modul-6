//o Create a custom exception class and use it in your program.

package com.assingment;
class ageException extends RuntimeException
{
	public ageException(String msg)
	{
		super(msg);
	}
}
public class CoustemExceptionDemo_36 {

	public static void main(String[] args) {
		int age=17;
		if(age<18)
		{
			throw new ageException("age is greter then 18");
		}
		else
		{
			System.out.println("age small");
		}
		

	}

}
