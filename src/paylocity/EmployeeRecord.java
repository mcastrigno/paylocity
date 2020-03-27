package paylocity;

import java.util.ArrayList;

public class EmployeeRecord {
		private Person employee;
		// getters and setter with more time
		protected ArrayList<Person> DependentList = new ArrayList<Person>(); 
		
		EmployeeRecord(Person employee){
			this.employee = employee;
		}
		public Person getEmployeePerson() {
			return this.employee;
		}
		public String getEmployeeName() {
			return employee.toString();
		}
		
		public void addDependent(Person person) {
			DependentList.add(person);
		}
}
