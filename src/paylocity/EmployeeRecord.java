package paylocity;

import java.util.ArrayList;

/**
 * @author Matthew Castrigno
 *
 */
public class EmployeeRecord {
	private Person employee;
	// getters and setter with more time
	protected ArrayList<Person> DependentList = new ArrayList<Person>(); 

	/**
	 * Constructor
	 * @param employee
	 */
	EmployeeRecord(Person employee){
		this.employee = employee;
	}
	/**
	 * @return
	 */
	public Person getEmployeePerson() {
		return this.employee;
	}
	/**
	 * @return
	 */
	public String getEmployeeName() {
		return employee.toString();
	}

	/**
	 * @param person
	 */
	public void addDependent(Person person) {
		DependentList.add(person);
	}
}
