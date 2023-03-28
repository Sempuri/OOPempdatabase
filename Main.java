/**
 * 
 */

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//scanner is used for the user to type in the employee number to access the database
		Scanner input = new Scanner (System.in);
		
		//first thing that will show up once the program is started
		System.out.println("");
        System.out.println("===========================================");
    	System.out.println("|| Welcome to MotorPH Employee Database! ||");
    	System.out.println("===========================================");
    	System.out.println("");
    	System.out.println("What is your Employee Number?");
    	
    	//scanner input function is used here for the user to be able to enter the employee number in the app
    	 int employeenumber = input.nextInt();
	        input.close();
    	
	    //switch is used to trigger the info of employees via employee numbers
	     switch (employeenumber) {
	      
	     case 10001:
	    	 //the employee information is based upon the "Employee" class
	    	 Employee e1 = new Employee("Crisostomo", "Jose", "02/14/1998", "17/85 Stracke Via Suite 042, Poblacion, Las Piñas 4783 Dinagat Islands", "918-621-603", "49-1632020-8");
	    	 e1.display();
	    	 
	    	 //worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h1 = new Hoursworked(8.00, 17.00);
	    	 h1.calchours();
	    	 
	    	 //salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w1 = new Weeksalary(45.00, 373.04);
	    	 w1.weeklysalary();
	    	
	    	 //monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m1 = new Monthlynetwage(62670.00);
	    	 m1.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10002:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e2 = new Employee("Mata", "Christian", "10/21/1987", "90 O'Keefe Spur Apt. 379, Catigbian 2772 Sulu", "783-776-744", "49-2959312-6");
	    	 e2.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h2 = new Hoursworked(8.00, 17.00);
	    	 h2.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w2 = new Weeksalary(45.00, 255.80);
	    	 w2.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m2 = new Monthlynetwage(42975.00);
	    	 m2.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10003:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e3 = new Employee("San Jose", "Brad", "03/15/1996", "99 Strosin Hills, Poblacion, Bislig 5340 Tawi-Tawi", "797-009-261", "40-2400714-1");
	    	 e3.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h3 = new Hoursworked(8.00, 17.00);
	    	 h3.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w3 = new Weeksalary(41.95, 255.80);
	    	 w3.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m3 = new Monthlynetwage(42975.00);
	    	 m3.calcmonthlynetwage();
	    	 break;
	    
	     case 10004:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e4 = new Employee("Salcedo", "Anthony", "09/14/1993", "93/54 Shanahan Alley Apt. 183, Santo Tomas 1572 Masbate", "070-766-300", "26-9647608-3");
	    	 e4.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h4 = new Hoursworked(8.00, 17.00);
	    	 h4.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w4 = new Weeksalary(45.00, 362.05);
	    	 w4.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m4 = new Monthlynetwage(60825.00);
	    	 m4.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10005:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e5 = new Employee("Romualdez", "Alice", "05/14/1992", "12A/33 Upton Isle Apt. 420, Roxas City 1814 Surigao del Norte", "983-606-799", "55-4476527-2");
	    	 e5.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h5 = new Hoursworked(8.00, 17.00);
	    	 h5.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w5 = new Weeksalary(44.75, 133.93);
	    	 w5.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m5 = new Monthlynetwage(22500.00);
	    	 m5.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10006:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e6 = new Employee("Atienza", "Rosie", "09/24/1948", "90A Dibbert Terrace Apt. 190, San Lorenzo 6056 Davao del Norte", "266-036-427", "41-0644692-3");
	    	 e6.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h6 = new Hoursworked(8.00, 17.00);
	    	 h6.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w6 = new Weeksalary(45.00, 133.93);
	    	 w6.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m6 = new Monthlynetwage(22500.00);
	    	 m6.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10007:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e7 = new Employee("Farala", "Martha", "01/11/1942", "42/25 Sawayn Stream, Ubay 1208 Zamboanga del Norte", "329-034-366", "45-5656375-0");
	    	 e7.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h7 = new Hoursworked(8.45, 17.00);
	    	 h7.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w7 = new Weeksalary(45.00, 142.86);
	    	 w7.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m7 = new Monthlynetwage(24000.00);
	    	 m7.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10008:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e8 = new Employee("Martinez", "Leila", "07/11/1970", "37/46 Kulas Roads, Maragondon 0962 Quirino", "877-110-749", "27-2090996-4");
	    	 e8.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h8 = new Hoursworked(8.0167, 17.00);
	    	 h8.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w8 = new Weeksalary(44.833, 142.86);
	    	 w8.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m8 = new Monthlynetwage(24000.00);
	    	 m8.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10009:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e9 = new Employee("San Jose", "Allison", "06/24/1986", "08 Grant Drive Suite 406, Poblacion, Iloilo City 9186 La Union", "179-075-129", "45-3251383-0");
	    	 e9.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h9 = new Hoursworked(8.083, 17.00);
	    	 h9.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w9 = new Weeksalary(45.00, 133.93);
	    	 w9.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m9 = new Monthlynetwage(22500.00);
	    	 m9.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10010:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e10 = new Employee("Rosario", "Cydney", "10/06/1996", "93A/21 Berge Points, Tapaz 2180 Quezon", "868-819-912", "49-1629900-2");
	    	 e10.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h10 = new Hoursworked(8.00, 17.00);
	    	 h10.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w10 = new Weeksalary(45.00, 133.93);
	    	 w10.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m10 = new Monthlynetwage(22500.00);
	    	 m10.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10011:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e11 = new Employee("Lopez", "Josie", "01/14/1937", "49 Springs Apt. 266, Poblacion, Taguig 3200 Occidental Mindoro", "478-355-427", "44-8563448-3");
	    	 e11.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h11 = new Hoursworked(8.00, 17.00);
	    	 h11.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w11 = new Weeksalary(42.50, 229.02);
	    	 w11.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m11 = new Monthlynetwage(38475.00);
	    	 m11.calcmonthlynetwage();
	    	 break;
	     
	     case 10012:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e12 = new Employee("De Leon", "Selena", "02/20/1945", "89A Armstrong Trace, Compostela 7874 Maguindanao", "975-432-139", "27-2090208-8");
	    	 e12.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h12 = new Hoursworked(8.00, 17.00);
	    	 h12.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w12 = new Weeksalary(45.00, 249.11);
	    	 w12.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m12 = new Monthlynetwage(41850.00);
	    	 m12.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10013:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e13 = new Employee("Romualdez", "Fredrick", "03/10/1985", "22A/52 Lubowitz Meadows, Pililla 4895 Zambales", "023-079-009", "26-8768374-1");
	    	 e13.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h13 = new Hoursworked(8.00, 17.00);
	    	 h13.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w13 = new Weeksalary(43.00, 377.98);
	    	 w13.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m13 = new Monthlynetwage(63500.00);
	    	 m13.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10014:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e14 = new Employee("Bautista", "Mark", "02/12/1961", "65 Murphy Center Suite 094, Poblacion, Palayan 5636 Quirino", "683-725-348", "49-1647342-5");
	    	 e14.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h14 = new Hoursworked(8.00, 17.00);
	    	 h14.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w14 = new Weeksalary(43.00, 138.39);
	    	 w14.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m14 = new Monthlynetwage(23250.00);
	    	 m14.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10015:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e15 = new Employee("Lazaro", "Darlene", "11/25/1985", "47A/94 Larkin Plaza Apt. 179, Poblacion, Caloocan 2751 Quirino", "740-721-558", "45-5617168-2");
	    	 e15.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h15 = new Hoursworked(8.00, 17.00);
	    	 h15.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w15 = new Weeksalary(43.00, 138.39);
	    	 w15.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m15 = new Monthlynetwage(23250.00);
	    	 m15.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10016:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e16 = new Employee("Delos Santos", "Kolby", "02/26/1980", "06A Gulgowski Extensions, Bongabon 6085 Zamboanga del Sur", "739-443-033", "52-0109570-6");
	    	 e16.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h16 = new Hoursworked(8.467, 17.00);
	    	 h16.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w16 = new Weeksalary(43.00, 142.86);
	    	 w16.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m16 = new Monthlynetwage(24000.00);
	    	 m16.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10017:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e17 = new Employee("Santos", "Vella", "12/31/1983", "99A Padberg Spring, Poblacion, Mabalacat 3959 Lanao del Sur", "955-879-269", "52-9883524-3");
	    	 e17.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h17 = new Hoursworked(8.00, 17.00);
	    	 h17.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w17 = new Weeksalary(42.917, 133.93);
	    	 w17.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m17 = new Monthlynetwage(22500.00);
	    	 m17.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10018:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e18 = new Employee("Del Rosario", "Tomas", "12/18/1978", "80A/48 Ledner Ridges, Poblacion, Kabankalan 8870 Marinduque", "882-550-989", "45-5866331-6");
	    	 e18.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h18 = new Hoursworked(8.00, 17.00);
	    	 h18.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w18 = new Weeksalary(36.00, 133.93);
	    	 w18.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m18 = new Monthlynetwage(22500.00);
	    	 m18.calcmonthlynetwage();
	    	 break;
	    	
	     case 10019:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e19 = new Employee("Tolentino", "Jacklyn", "05/19/1944", "96/48 Watsica Flats Suite 734, Poblacion, Malolos 1844 Ifugao", "675-757-366", "47-1692793-0");
	    	 e19.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h19 = new Hoursworked(8.00, 17.00);
	    	 h19.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w19 = new Weeksalary(43.00, 142.86);
	    	 w19.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m19 = new Monthlynetwage(24000.00);
	    	 m19.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10020:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e20 = new Employee("Gutierrez", "Percival", "12/18/1970", "58A Wilderman Walks, Poblacion, Digos 5822 Davao del Sur", "512-899-876", "40-9504657-8");
	    	 e20.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h20 = new Hoursworked(8.00, 17.00);
	    	 h20.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w20 = new Weeksalary(43.00, 147.32);
	    	 w20.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m20 = new Monthlynetwage(24750.00);
	    	 m20.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10021:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e21 = new Employee("Manalaysay", "Garfield", "08/28/1966", "60 Goyette Valley Suite 219, Poblacion, Tabuk 3159 Lanao del Sur", "948-628-136", "45-3298166-4");
	    	 e21.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h21 = new Hoursworked(8.183, 17.00);
	    	 h21.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w21 = new Weeksalary(38.00, 147.32);
	    	 w21.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m21 = new Monthlynetwage(24750.00);
	    	 m21.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10022:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e22 = new Employee("Villegas", "Lizeth", "12/12/1981", "66/77 Mann Views, Luisiana 1263 Dinagat Islands", "332-372-215", "40-2400719-4");
	    	 e22.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h22 = new Hoursworked(8.00, 17.00);
	    	 h22.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w22 = new Weeksalary(43.00, 142.86);
	    	 w22.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m22 = new Monthlynetwage(24000.00);
	    	 m22.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10023:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e23 = new Employee("Ramos", "Carol", "08/20/1978", "72/70 Stamm Spurs, Bustos 4550 Iloilo", "250-700-389", "60-1152206-4");
	    	 e23.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h23 = new Hoursworked(8.00, 17.00);
	    	 h23.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w23 = new Weeksalary(42.00, 133.93);
	    	 w23.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m23 = new Monthlynetwage(22500.00);
	    	 m23.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10024:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e24 = new Employee("Maceda", "Emelia", "04/14/1963", "50A/83 Bahringer Oval Suite 145, Kiamba 7688 Nueva Ecija", "973-358-041", "54-1331005-0");
	    	 e24.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h24 = new Hoursworked(8.35, 17.00);
	    	 h24.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w24 = new Weeksalary(43.00, 133.93);
	    	 w24.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m24 = new Monthlynetwage(22500.00);
	    	 m24.calcmonthlynetwage();
	    	 break;
	    	 
	     case 10025:
	    	//the employee information is based upon the "Employee" class
	    	 Employee e25 = new Employee("Aguilar", "Delia", "01/27/1939", "95 Cremin Junction, Surallah 2809 Cotabato", "529-705-439", "52-1859253-1");
	    	 e25.display();
	    	 
	    	//worked hours of employee is based upon the "Hoursworked" class
	    	 Hoursworked h25 = new Hoursworked(8.00, 17.00);
	    	 h25.calchours();
	    	 
	    	//salary for a week of employee is based on the "Weeksalary" class
	    	 Weeksalary w25 = new Weeksalary(43.00, 133.93);
	    	 w25.weeklysalary();
	    	 
	    	//monthly net wage of employee is based on the "Monthlynetwage" class
	    	 Monthlynetwage m25 = new Monthlynetwage(22500.00);
	    	 m25.calcmonthlynetwage();
	    	 break;
	      }
	}

}
