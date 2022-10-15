package Weekend_1_Sep24to25;
public class Calculation 
{
	public int sum(int a, int b)          // non void method
	{
		int c;
		c = a+b;
		System.out.println("Result is : "+ c);
		return c;
	}
	public int sub(int a1, int a2)   // non void method
	{
		int a3;
		a3 = a1-a2;
		System.out.println("Result is : "+ a3);
		return  a3; 
	}
	public void mul(int x, int y)  // void method
	{
		int z = x*y;
		System.out.println("final reuslt is : "+ z);
	}
	public static void main(String[] args) 
	{
		Calculation obj = new Calculation();
		int sumresult = obj.sum(12, 2);
		int subresult = obj.sub(10, 2);
		obj.mul(sumresult, subresult);
		}
}
	
