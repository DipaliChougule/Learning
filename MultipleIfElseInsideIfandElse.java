package assignments;

//As:16 multiple if blocks inside a if-else block

public class MultipleIfElseInsideIfandElse {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		if(b<a)//false so this if block with all if blocks will not execute
		{
			if(a<500)//true 
			{
				System.out.println("1st if block");
			}
			if(a<c)//true 
			{
				System.out.println("2nd if block");
			}
			if(a>b)//false
			{
				System.out.println("3rd if block");
			}
		}
		else
		{ 
			if(a==100)//true
				{
				System.out.println("First else-if block");
				}
			if(b==100)//false
			{
			System.out.println("Second else-if block");
			}
			if(c>b)//true
			{
			System.out.println("Third else-if block");
			}
		}
		
	}

}
