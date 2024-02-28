package assignments;

//As17:if-else (condition in else block) Write one if and one else 

public class MultipleIfInsideIf {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int c = 300;
		if (b < a)// false
		{
			if (a < 500)// true
			{
				System.out.println(" if block");
			}

		} else {
			if (b > a)// true
			{
				if (a < 500)// true
				{
					System.out.println("1st if block");
				} else {
					System.out.println("2nd if block");
				}
			}

		}
	}

}
