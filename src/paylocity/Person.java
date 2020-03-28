package paylocity;

/**
 * @author Matthew Castrigno
 *
 */
public class Person {
	private String firstName;
	private String lastName;
	private String type = "employee";
	private double pay = 2000;

	/**
	 * @param firstName
	 * @param lastName
	 */
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * @return
	 */
	public String getFirstName() {
		return this.firstName;
	}
	/**
	 * @return
	 */
	public String getLastName() {
		return this.lastName;
	}
	/**
	 * @return
	 */
	public double getPay() {
		if(type.equals("employee")) {
			return pay;
		}else {
			return 0;
		}
	}	

	/**
	 * @param pay
	 */
	public void setPay(double pay) {
		if(type.equals("employee")) {
			this.pay = pay;
		}
	}
	/**
	 * @return
	 */
	public boolean getTypeEmployee() {
		if(type.equals("employee")) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * @return
	 */
	public boolean getTypeDependent() {
		if(type.equals("dependent")) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * 
	 */
	public void setTypeEmployee() {
		this.type = "employee";
	}
	/**
	 * 
	 */
	public void setTypeDependent() {
		this.type = "dependent";
	}
	@Override
	public String toString() {
		return (this.firstName + " " + this.lastName);
	}
}
