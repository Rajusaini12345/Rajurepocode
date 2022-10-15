package Weekend_2_Oct01to02;
public class Contructor 
{ 
	public Contructor() 
	 {
		System.out.println("Default  Constructor");
	 }
	 
	 public Contructor(int a) 
	 {
		System.out.println("One Parameterized Constructor");
	 }
	 
	 public Contructor(int a, int b) 
	 {
		System.out.println("Two Parameterized Constructor");
	 }
	 public static void main(String[] args) 
	 {
		 Contructor obj = new Contructor();
		 Contructor obj3 = new Contructor(10, 20);
		 Contructor obj2 = new Contructor(10);
		 
	 
		 
	}

}
