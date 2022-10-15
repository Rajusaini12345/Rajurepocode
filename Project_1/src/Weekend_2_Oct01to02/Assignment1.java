// Call from one Constructor to another constructor with the help of this keyword.

package Weekend_2_Oct01to02;
public class Assignment1 
{
	public Assignment1()
	{
		this(10,10,10);
		System.out.println("This is Default Constructor.....");
	}
	
	public Assignment1(int a)
	{
		this(11,11);
		System.out.println("This is One Parameterized Constructor.....");
	}
	
	public Assignment1(int a, int b)
	{
		this();
		System.out.println("This is Two Parameterized Constructor.....");
	}
	
	public Assignment1(int a, int b, int c)
	{
		System.out.println("This is Three Parameterized Constructor.....");
	}
	public static void main(String[] args) 
	{
		Assignment1 obj = new Assignment1(123);
	}
}
