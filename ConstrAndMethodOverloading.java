package assignments;

//As4:Constructor and Method overloading

public class ConstrAndMethodOverloading {
	
	//Constructor overloading
	ConstrAndMethodOverloading()
	{
	System.out.println("This is non-arg Constr");	
	}
	
	ConstrAndMethodOverloading(int a, double b)
	{
	System.out.println("This is int:double-arg Constr");	
	}
	
	ConstrAndMethodOverloading(double a, int b)
	{
	System.out.println("This is double:int-arg Constr");	
	} 
	
	ConstrAndMethodOverloading(int a, double b, int c)
	{
	System.out.println("This is int:double:int-arg Constr");	
	}
	 
	//Method Overloading
	void add(int a, int b, double c)
	{
		System.out.println("1");
	}
	void add(double a, int b, int c)
	{
		System.out.println("2");
	}
	void add(int a, double b, int c)
	{
		System.out.println("3");
	}
	
	static void add(String a, char b)
	{
		System.out.println(a);
	}
	static void add(char a, String b)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		new ConstrAndMethodOverloading(100,40.50,300);
		new ConstrAndMethodOverloading(123.45,300);
		new ConstrAndMethodOverloading(45,30.8790);
		
		ConstrAndMethodOverloading m1= new ConstrAndMethodOverloading();
		m1.add(10,54.78,200);
		m1.add(456.8,100,40);
		m1.add(7889, 1050, 89.7);
		
		add("dipali",'M');
		add('A',"ABCD");
	

	}

}
