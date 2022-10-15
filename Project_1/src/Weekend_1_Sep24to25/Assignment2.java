package Weekend_1_Sep24to25;
public class Assignment2 
{
	// ((((10+2)-2)+2)*2)/2)
	// (((10*2)-2)+2)-2)/2)
	
	public int addition(int a, int b)
	{
		int add = a+b;
		return add;
	}
	
	public int subtraction(int a, int b)
	{
		int sub = a-b;
		return sub;
	}
	
	public  int multiplication(int a, int b)
	{
		int  mul = a*b;
		return mul;
	}
	
	public int division(int a , int b)
	{
		int div  = a/b;
		return  div;   // ((((10+2)-2)+2)*2)/2)
	}
	
	public static void main(String[] args) 
	{
		Assignment2 obj = new Assignment2();
		int result1 = obj.addition(10, 2);
		int result2 = obj.subtraction(result1, 2);
		int result3 =  obj.addition(result2, 2);
		int result4 = obj.multiplication(result3, 2);
		int  result5 =  obj.division(result4, 2);
		System.out.println("This final output of above expression ((((10+2)-2)+2)*2)/2) is : "+ result5);
		
	}
	
}
