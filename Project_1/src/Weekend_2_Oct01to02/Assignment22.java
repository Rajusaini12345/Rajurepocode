// Call from one method to another method with the help of this keyword.

package Weekend_2_Oct01to02;
public class Assignment22 
{
	public void m()
	{
		this.m3(1,2,3);
		System.out.println("Default parameterized method....");
		this.m1(6);
		this.m2(10, 20);
		this.m4(10, 20, 30, 40);
	}
	
	public void m1(int a) 
	{
		
		System.out.println("One parameterized method...");
		
	}
	
	public void m2(int a, int b) 
	{
		System.out.println("Second parameterized method...");
	}
	
	public void m3(int a, int b, int c) 
	{
		
		System.out.println("Third parameterized method...");
	}
	
	public void m4(int a, int b, int c, int d) 
	{
		System.out.println("Four parameterized method...");
	}
	
	public static void main(String[] args) 
	{
		Assignment22 R = new Assignment22();
		R.m();
		
		
		
	}
	
}
