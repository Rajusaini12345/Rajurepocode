/* 
three parameterized method 
default method
one parameterized method
two parameterized method
four parameterized method
We have to create only one object  */
package Weekend_2_Oct01to02;
public class Assignment2 
{
	public Assignment2()
	{
		this(10,10,10);
		System.out.println("Default Constructor");
	
	}
	
	public Assignment2(int a)
	{
		this(15,15);
		System.out.println("One Parameterized Constructor");
	}
	
	public Assignment2(int a, int  b)
	{
		
		System.out.println("Two Parameterized Constructor");
	}
	
	public Assignment2(int a, int b, int c)
	{
		
		System.out.println("Three Parameterized Constructor");
	}
	
	public Assignment2(int a, int b, int c, int d)
	{
		this(5);
		System.out.println("Four Parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		Assignment2 obj = new Assignment2(123);
		
	}
}
