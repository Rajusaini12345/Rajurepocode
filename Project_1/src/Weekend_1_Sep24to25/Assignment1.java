package Weekend_1_Sep24to25;
public class Assignment1 
{
	int age; 
	int roll_no;
	public void Method1()
	{
		System.out.println("Welcome to all of you...");
	}
	
	public void Method2()
	{
		System.out.println("Automation is very easy...");
	}
	
	public static void main(String args[])
	{
		Assignment1 obj = new Assignment1();
		obj.Method1();
		obj.Method2();
		obj.age=100;
		System.out.println("age: " + obj.age);
		obj.roll_no=1;
		System.out.println("Roll number: " + obj.roll_no);
		
		obj.age=200;
		System.out.println("age: " + obj.age);
		obj.roll_no=11;
		System.out.println("Roll number: " + obj.roll_no);
	}

	
	
	
	
	

}
