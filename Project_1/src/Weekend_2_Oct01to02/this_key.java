package Weekend_2_Oct01to02;
public class this_key
{
	public this_key()
	{
		System.out.println("Default Constuctor....");
		System.out.println("changes");
	}
	
	public this_key(int a)
	{
		this(12,13);
		System.out.println("One Parameterized Constuctor....");
		
	}

	public this_key(int a, int b)
	{
		System.out.println("Two Parameterized Constuctor....");
	}
	
	public static void main(String[] args) 
	{
		this_key obj = new this_key(10);
		
		
	}

	
	
}


