package paylocity;
/*
 * This class is a pay calculator
 * It calculates pay for the company
 * 
 */
public class CalcPay {
	private static double employeeBenefitCost = 1000;
	private static double dependentBenefitCost = 500;
	public static double numCheckPerYear = 26; //should use getter/setter done for expediency  
	private static double netDiscount = .9; //reflects a 10% discount
	
	private double annualCostEmployee= 0;
	private double annualCostDependent = 0;
	//private int numEmpDiscount = 0;
	
	
	public static double getEmployeeCostPerCheck(EmployeeRecord employeeRecord) {

	 double biWeeklyCost=0;
	 
		if((employeeRecord.getEmployeePerson().getFirstName().toUpperCase().charAt(0) == 'A') 
			||(employeeRecord.getEmployeePerson().getLastName().toUpperCase().charAt(0) == 'A'))
		{
				biWeeklyCost+= (employeeBenefitCost * netDiscount)/numCheckPerYear;
		}else {
				biWeeklyCost+= (employeeBenefitCost)/numCheckPerYear;
		}
		for (Person p : employeeRecord.DependentList) {
			if((p.getFirstName().toUpperCase().charAt(0) == 'A') 
				||(p.getLastName().toUpperCase().charAt(0) == 'A'))
			{
				biWeeklyCost+= (dependentBenefitCost * netDiscount)/numCheckPerYear;
			}else {
				biWeeklyCost+= (dependentBenefitCost)/numCheckPerYear;
			}
		}
		return biWeeklyCost;
	}
	
	

}
