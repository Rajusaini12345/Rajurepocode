// Call from one method to another method with the help of this keyword.

package Weekend_2_Oct01to02;
public class Student 
{
	public void method1()
	{
		this.method3();
		System.out.println("First method of the class...");
		this.method2();
	}
	
	public void method2()
	{
		System.out.println("Second method of the class...");
	}
	
	public void method3()
	{
		System.out.println("Third method of the class...");
	}
	
	public static void main(String[] args) 
	{
	
	Student S = new Student();
	S.method1();
	
	
	}
	
	

}
