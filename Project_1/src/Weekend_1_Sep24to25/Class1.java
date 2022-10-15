package Weekend_1_Sep24to25;
public class Class1 

{
	int roll_no;
	int age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
		System.out.println(" change");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String args[])
	{
	Class1 C = new Class1();
	C.display1();
	C.display2();
	C.roll_no = 10;
	System.out.println("This is my exam roll number " + C.roll_no);
	C.age = 100;
	System.out.println("Person age " + C.age);
	}
}
