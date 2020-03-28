package paylocity;

import java.util.ArrayList;

/**
 * @author Matthew Castrigno
 *
 * This is a hook to make the program support more than one company or department 
 * that has different costs for benefits.
 * Fully implemented it would have a constructor, setters, getters
 *
 */
public class Company {
	
	static double employeeBenefitCost = 1000; //These would normally be private with setters and getters
											  //Omitted due to time constraints 
	static double dependentBenefitCost = 500;
	static double netDiscount = .9; 		  //reflects a 10% discount
	static double numCheckPerYear = 26; 	  //This would support other pay periods 
	
	static  ArrayList<EmployeeRecord> company = new ArrayList<EmployeeRecord>();

	public static void addEmployeeRecord(EmployeeRecord employeeRecord) {
		company.add(employeeRecord);
	}
}
