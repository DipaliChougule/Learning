package assignments;

//A23:"Find Area of circle by making "pi" as Globalnd Final variable

public class AreaOfCircleUsingGlobalFinalVar {
	final double pi=3.14;
	
	public static void main(String[] args) {
		double redius=16;
		AreaOfCircleUsingGlobalFinalVar v1= new AreaOfCircleUsingGlobalFinalVar();
		
		double area=v1.pi*redius*redius;
		System.out.println(area);
	}

}
