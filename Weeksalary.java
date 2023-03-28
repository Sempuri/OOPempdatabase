
import java.text.DecimalFormat;

public class Weeksalary {

	//attributes
	private double sumhoursworked;
	private double hourlyrate;
	
	//constructor
	public Weeksalary(double sumhoursworked, double hourlyrate) {
		this.sumhoursworked = sumhoursworked;
		this.hourlyrate = hourlyrate;
	}

	
	//getter method
	public double getSumhoursworked() {
		return sumhoursworked;
	}
	
	public double getHourlyrate() {
		return hourlyrate;
	}
	
	//format for values
		public static final DecimalFormat df = new DecimalFormat("0.00"); //used to format the resulting values of hours and salary computations to 2 decimal places
		
		
	//method
	public void weeklysalary() {
		double wsalary = hourlyrate*sumhoursworked; //formula for weekly salary
		
		System.out.println("============================================");
    	System.out.println("|| 10/24 to 10/28 WEEK SALARY BY EMPLOYEE ||");
    	System.out.println("============================================");
    	System.out.println("");
    	System.out.println("*Hours worked from 10/24/2022 to 10/28/2022 is: " + df.format (sumhoursworked));
    	System.out.println("Employee's one week salary from 10/24 to 10/28 is: P " + df.format (wsalary));
    	
    	System.out.println("");
    	System.out.println("");
	}
}
