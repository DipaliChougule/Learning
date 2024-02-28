package assignments;

//As14:Using if else check if the given year is a leap year

//Find whether given is leap or not
//C1= year%400==0 OR
//C2=year%4==0 && year%100!=0

public class leapYear {

	public static void main(String[] args) {
		int year = 2024;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Year is leap");
		} else {
			System.out.println("Year is not leap");
		}
	}

}
