package assignments;
/* As24:Print 1 to 365 if the number is in between 1 to 31 print january,
 *  if the number is in between 32 to 59 print February....upto December (365 days)
 */
public class As24 {

	public static void main(String[] args) {
		for(int i=1; i<=365;i++)
		{
			System.out.println(i);
		
			if(i>=1 && i<=31)
			{
				System.out.println("January");
		    }
			
			else if(i>=32 && i<=59)
			{
				System.out.println("Feb");
			}
			else if(i>=60 && i<=90)
			{
				System.out.println("March");
			}
			else if(i>=91 && i<=120)
			{
				System.out.println("April");
			}
			else if(i>121 && i<=151)
			{
				System.out.println("May");
			}
			else if(i>=152 && i<=181)
			{
				System.out.println("Jun");
			}
			else if(i>=182 && i<=212)
			{
				System.out.println("July");
			}
			else if(i>=213 && i<=243)
			{
				System.out.println("Aug");
			}
			else if(i>=244 && i<=273)
			{
				System.out.println("Sept");
			}
			else if(i>=274 && i<=304)
			{
				System.out.println("Oct");
			}
			else if(i>=305 && i<=334)
			{
				System.out.println("Nov");
			}
			else if(i>=335 && i<=365)
			{
				System.out.println("Dec");
			}
			else
			{
				System.out.println("");
			}
		}
	}

}
