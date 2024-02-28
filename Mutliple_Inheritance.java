package assignments;

//Multiple inheritance with 5 interfaces 

interface One_Parent
{
	void add();
}

interface Two_Parent
{
	void sub();
}

interface Three_Parent
{
	void mul();
}

interface Four_Parent
{
	void div();
}

interface Fifth_Parent
{
	void mod();
}


public class Mutliple_Inheritance implements One_Parent,Two_Parent,Three_Parent,Four_Parent,Fifth_Parent {
	
	int a=700, b=100;


	public static void main(String[] args) {
		Mutliple_Inheritance m1= new Mutliple_Inheritance();
		m1.add();
		m1.sub();
		m1.mul();
		m1.div();
		m1.mod();

	}

	@Override
	public void sub() {
		
		System.out.println(a-b);
		
	}

	@Override
	public void add() {
		System.out.println(b+a);
		
}

	@Override
	public void mod() {
		System.out.println(a%b);
		
	}

	@Override
	public void div() {
		System.out.println(a/b);
		
	}

	@Override
	public void mul() {
		System.out.println(a*b);
		
	}
}