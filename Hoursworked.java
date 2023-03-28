/**
 * 
 */
import java.text.DecimalFormat;

public class Hoursworked {

	//attributes
	private double timein;
	private double timeout;
	
	//constructor
	public Hoursworked(double timein, double timeout) {
		this.timein = timein;
		this.timeout = timeout;
	}

	
	//getter method
	public double getTimein() {
		return timein;
	}
	
	public double getTimeout() {
		return timeout;
	}
	
	//format for values
	public static final DecimalFormat df = new DecimalFormat("0.00"); //used to format the resulting values of hours and salary computations to 2 decimal places
	
	//method
	public void calchours() {
		double workedhours = timeout - timein; //formula for worked hours
		
    	System.out.println("==============================");
    	System.out.println("|| HOURS WORKED BY EMPLOYEE ||");
    	System.out.println("==============================");
    	System.out.println("");
    	System.out.println("*Hours worked on 09/01/2022: " + df.format (workedhours));
    	
    	if (workedhours>=8)
    	{
    	System.out.println("Employee has completed 8 hours of work for 09/01/2022.");
    	}
    	else
    	{
    		System.out.println("Employee has not completed 8 hours of work for 09/01/2022");
    	}
    	
    	System.out.println("");
    	System.out.println("");
		
		
	}
}
