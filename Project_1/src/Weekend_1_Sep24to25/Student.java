package Weekend_1_Sep24to25;
public class Student 
{              // Boundary (body) of the class
	
	int a;
	public void display()
	{
		// body of the method
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args)
	{
		Student abc = new Student();
		abc.display();
		abc.display2();
		abc.a=123;
		System.out.println(abc.a);
		abc.a=456;
		System.out.println(abc.a);
	}
}
