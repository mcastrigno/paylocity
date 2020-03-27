package paylocity;


import java.util.Scanner;

public class Commands{
	
	static Scanner commandScanner = new Scanner(System.in);
	
	public static void adde() {
		Character addCommand = ' ';
		String firstName = "";
		String lastName = "";
		System.out.println("Please enter the employee's first name: ");
		firstName = commandScanner.next();
		commandScanner.nextLine();
		System.out.println("Please enter the employee's last name: ");
		lastName = commandScanner.next();
		commandScanner.nextLine();
		Person employeePerson = new Person(firstName, lastName);
		EmployeeRecord employeeRecord = new EmployeeRecord(employeePerson);
		employeePerson.setTypeEmployee();
		Company.addEmployeeRecord(employeeRecord);
		
		
		
		//loop to add dependents
		//this piece of code could easily be made to a separate function
		//to allow async add of a dependent to an employee record
		System.out.println("Do you want to add a dependent for " + employeeRecord.getEmployeeName()+ "? y or n ?" );
		while(commandScanner.hasNext()) {
			addCommand = commandScanner.nextLine().toLowerCase().charAt(0);
				switch(addCommand) {
				case 'y':
					
							System.out.println("Please enter the dependent's first name: ");
							firstName = commandScanner.next();
							commandScanner.nextLine();
							System.out.println("Please enter the dependent's last name: ");
							lastName = commandScanner.next();
							commandScanner.nextLine();
							Person dependentPerson = new Person(firstName, lastName);
							dependentPerson.getTypeDependent();
							employeeRecord.DependentList.add(dependentPerson);
							System.out.println("Do you want to add a dependent for " + employeeRecord.getEmployeeName()+ "? y or n ?" );
							break;				
				case 'n':
							System.out.println("Employee record entry completed");
							System.out.print("Cost of benefits to employee per pay period: ");
							System.out.printf("$ %6.2f %n",CalcPay.getEmployeeCostPerCheck(employeeRecord));
							return;
				default:			
							//commandScanner.nextLine();
							System.out.println("Do you want to add a dependent for " + employeeRecord.getEmployeeName()+ "? y or n ?" );
							break;
				}
		
		}
}
		
	
	public static void addd(EmployeeRecord employeeRecord, Person person) {
		employeeRecord.DependentList.add(person);
	}
	
	
	
	public static void list() {
		
		for(EmployeeRecord s : Company.company) {
			System.out.println("Employee: " + s.getEmployeeName());
			System.out.println("Dependents of " + s.getEmployeeName());
				for(Person p : s.DependentList) {
					System.out.println("    " + p.getFirstName() + " " + p.getLastName());
				}
				
			System.out.print("Cost of benefits to employee per pay period: ");
			System.out.printf("$ %6.2f %n",CalcPay.getEmployeeCostPerCheck(s));
		}
	}

}
