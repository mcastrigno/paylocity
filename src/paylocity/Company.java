package paylocity;

import java.util.ArrayList;

public class Company {
	static ArrayList<EmployeeRecord> company = new ArrayList<EmployeeRecord>();
		
	public static void addEmployeeRecord(EmployeeRecord employeeRecord) {
			company.add(employeeRecord);
		}
}
