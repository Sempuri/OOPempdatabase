
import java.text.DecimalFormat;

public class Monthlynetwage {
	
	//attribute
	private double basicsalary;

	//constructor
	public Monthlynetwage(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	
	//getter method
	public double getBasicsalary() {
		return basicsalary;
	}
	
	//format for values
	public static final DecimalFormat df = new DecimalFormat("0.00"); //used to format the resulting values of hours and salary computations to 2 decimal places
			
	//method
	public void calcmonthlynetwage() {
		
		if (basicsalary >= 24750) { //SSS contribution computation
			
			double sssdeduc = 1125;
			double philhealth = (basicsalary*0.03)*0.5;
	    	double pagibig = 100; //always 100
	    	double totdeduc = sssdeduc+philhealth+pagibig;
	    	double taxincome = basicsalary-totdeduc;
	    	
	    	if (taxincome >= 33333) // withholding tax and net monthly income computation
	    	{
	    		double witax = (taxincome-33333.00)*0.25+2500.00;
	    		double netwage = taxincome-witax;
	    	
	    		System.out.println("=========================");
	        	System.out.println("||  SALARY of EMPLOYEE ||");
	        	System.out.println("=========================");
	        	System.out.println("");
            	System.out.println("**Monthly Basic Salary of Employee is: P " + df.format((basicsalary)));
            	System.out.println("");
            	System.out.println("SSS contribution of Employee: P " + df.format((sssdeduc)));
            	System.out.println("Philhealth Contribution of Employee: P " + df.format(philhealth));
            	System.out.println("Pag-ibig Contribution of Employee: P " + df.format(pagibig));
            	System.out.println ("Total Contributions of Employee: P " + df.format(totdeduc));
            	System.out.println("");
            	System.out.println("**Taxable Income of Employee: P " + df.format(taxincome));
            	System.out.println("Withholding Tax of Employee: P " + df.format(witax));
            	System.out.println("");
            	System.out.println("**Net Monthly Wage of Employee: P " + df.format(netwage));
            	System.out.println("");
            	System.out.println("");
	    	}
	    	else if (taxincome < 33333) //connected to if statement for withholding tax and net monthly income
	    	{
	    		double witax = (taxincome-20833.00)*0.20;
	    		double netwage = taxincome-witax;
	    		
	    		System.out.println("=========================");
	        	System.out.println("||  SALARY of EMPLOYEE ||");
	        	System.out.println("=========================");
	        	System.out.println("");
            	System.out.println("**Monthly Basic Salary of Employee is: P " + df.format((basicsalary)));
            	System.out.println("");
            	System.out.println("SSS contribution of Employee: P " + df.format((sssdeduc)));
            	System.out.println("Philhealth Contribution of Employee: P " + df.format(philhealth));
            	System.out.println("Pag-ibig Contribution of Employee: P " + df.format(pagibig));
            	System.out.println ("Total Contributions of Employee: P " + df.format(totdeduc));
            	System.out.println("");
            	System.out.println("**Taxable Income of Employee: P " + df.format(taxincome));
            	System.out.println("Withholding Tax of Employee: P " + df.format(witax));
            	System.out.println("");
            	System.out.println("**Net Monthly Wage of Employee: P " + df.format(netwage));
            	System.out.println("");
            	System.out.println("");
	    	}
		}
        	else if (basicsalary < 24750) { //connected to the if statement for SSS contribution
    			double sssdeduc = basicsalary/22.4691;
    			double philhealth = (basicsalary*0.03)*0.5;
    	    	double pagibig = 100; //always 100 since it is the max contribution according to their salary
    	    	double totdeduc = sssdeduc+philhealth+pagibig;
    	    	double taxincome = basicsalary-totdeduc;
    	    	
    	    	if (taxincome >= 33333) // withholding tax and net monthly income computation
    	    	{
    	    		double witax = (taxincome-33333.00)*0.25+2500.00;
    	    		double netwage = taxincome-witax;
    	    	
    	    		System.out.println("=========================");
    	        	System.out.println("||  SALARY of EMPLOYEE ||");
    	        	System.out.println("=========================");
    	        	System.out.println("");
                	System.out.println("**Monthly Basic Salary of Employee is: P " + df.format((basicsalary)));
                	System.out.println("");
                	System.out.println("SSS contribution of Employee: P " + df.format((sssdeduc)));
                	System.out.println("Philhealth Contribution of Employee: P " + df.format(philhealth));
                	System.out.println("Pag-ibig Contribution of Employee: P " + df.format(pagibig));
                	System.out.println ("Total Contributions of Employee: P " + df.format(totdeduc));
                	System.out.println("");
                	System.out.println("**Taxable Income of Employee: P " + df.format(taxincome));
                	System.out.println("Withholding Tax of Employee: P " + df.format(witax));
                	System.out.println("");
                	System.out.println("**Net Monthly Wage of Employee: P " + df.format(netwage));
                	System.out.println("");
                	System.out.println("");
    	    	}
    	    	else if (taxincome < 33333) //connected to if statement for withholding tax and net monthly income
    	    	{
    	    		double witax = (taxincome-20833.00)*0.20;
    	    		double netwage = taxincome-witax;
    	    		
    	    		System.out.println("=========================");
    	        	System.out.println("||  SALARY of EMPLOYEE ||");
    	        	System.out.println("=========================");
    	        	System.out.println("");
                	System.out.println("**Monthly Basic Salary of Employee is: P " + df.format((basicsalary)));
                	System.out.println("");
                	System.out.println("SSS contribution of Employee: P " + df.format((sssdeduc)));
                	System.out.println("Philhealth Contribution of Employee: P " + df.format(philhealth));
                	System.out.println("Pag-ibig Contribution of Employee: P " + df.format(pagibig));
                	System.out.println ("Total Contributions of Employee: P " + df.format(totdeduc));
                	System.out.println("");
                	System.out.println("**Taxable Income of Employee: P " + df.format(taxincome));
                	System.out.println("Withholding Tax of Employee: P " + df.format(witax));
                	System.out.println("");
                	System.out.println("**Net Monthly Wage of Employee: P " + df.format(netwage));
                	System.out.println("");
                	System.out.println("");
        	}
        	}
	}
}
