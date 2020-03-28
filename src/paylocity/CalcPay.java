package paylocity;
/*
 * This class is a pay calculator
 * It calculates pay for the company
 * 
 */
/**
 * @author Matthew Castrigno
 *
 */
public class CalcPay {



	public static double getEmployeeCostPerCheck(EmployeeRecord employeeRecord) {

		double biWeeklyCost=0;
		// super discount for anyone with a first or last name that starts with a or A
		if((employeeRecord.getEmployeePerson().getFirstName().toUpperCase().charAt(0) == 'A') 
				||(employeeRecord.getEmployeePerson().getLastName().toUpperCase().charAt(0) == 'A'))
		{
			biWeeklyCost+= (Company.employeeBenefitCost * Company.netDiscount)/Company.numCheckPerYear;
		}else {
			biWeeklyCost+= (Company.employeeBenefitCost)/Company.numCheckPerYear;
		}
		for (Person p : employeeRecord.DependentList) {
			if((p.getFirstName().toUpperCase().charAt(0) == 'A') 
					||(p.getLastName().toUpperCase().charAt(0) == 'A'))
			{
				biWeeklyCost+= (Company.dependentBenefitCost * Company.netDiscount)/Company.numCheckPerYear;
			}else {
				biWeeklyCost+= (Company.dependentBenefitCost)/Company.numCheckPerYear;
			}
		}
		return biWeeklyCost;
	}
	
	/**
	 * 
	 * fully implemented this would have a company/department as an argument
	 * @return
	 */
	public static double getCompanyEmployeeCostPerYear() {
		double annualEmployeeCost= 0;
		for(EmployeeRecord s : Company.company) {
			// just counting records but employees has different costs we could capture it here
			annualEmployeeCost+=Company.employeeBenefitCost;
			for(Person p : s.DependentList) {
				annualEmployeeCost+=Company.dependentBenefitCost;
			}
		}
		return annualEmployeeCost;
	}
	
	/**
	 * 
	 * fully implemented this would have a company/department as an argument
	 * @return
	 */
	public static double getCompanyCostPerYear() {
		double annualCompanyCost =0;
		for(EmployeeRecord s : Company.company) {
			// just counting records but employees has different costs we could capture it here
			annualCompanyCost+= (s.getEmployeePerson().getPay()) * Company.numCheckPerYear;
			}
		return annualCompanyCost;
		}




}
