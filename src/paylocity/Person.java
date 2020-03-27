package paylocity;

public class Person {
	private String firstName;
	private String lastName;
	private String type = "employee";
	private double pay = 2000;
	
	Person(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public double getPay() {
		if(type.equals("employee")) {
			return pay;
		}else {
			return 0;
		}
	}	
		
	public void setPay(double pay) {
		if(type.equals("employee")) {
			this.pay = pay;
		}
	}
	public boolean getTypeEmployee() {
		if(type.equals("employee")) {
			return true;
		}else {
			return false;
		}
	}
	public boolean getTypeDependent() {
		if(type.equals("dependent")) {
			return true;
		}else {
			return false;
		}
	}
	public void setTypeEmployee() {
		this.type = "employee";
	}
	public void setTypeDependent() {
		this.type = "dependent";
	}
	@Override
	public String toString() {
		return (this.firstName + " " + this.lastName);
	}
}
