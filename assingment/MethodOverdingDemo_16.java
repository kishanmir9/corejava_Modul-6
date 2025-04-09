//o Implement method overriding to show polymorphism in action.
package com.assingment;
class shape
{
	public void draw()
	{
		System.out.println("drawing the shape.");
	}
}
class circle extends shape
{
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing the circle.");
	}
}
public class MethodOverdingDemo_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new circle();
		s.draw();
	}

}
