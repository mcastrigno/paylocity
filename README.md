# paylocity
PayApp for paylocity interview.

The company provided the following description of an application:

---
Business Need:
One of the critical functions that we provide for our clients is the ability
to pay for their employees’ benefits packages. A portion of these costs
are deducted from their paycheck, and we handle that deduction. Please
demonstrate how you would code the following scenario:
• The cost of benefits is $1000/year for each employee
• Each dependent (children and possibly spouses) incurs a cost of
$500/year
• Anyone whose name starts with ‘A’ gets a 10% discount, employee or
dependent
We’d like to see this calculation used in an application where employers
input employees and their dependents and get a preview of the costs.
This is of course a contrived example. We want to know how you would
implement the application structure and calculations and get a brief
preview of how you work.
Please implement an application based on these assumptions:
• All employees are paid $2000 per paycheck before deductions
• There are 26 paychecks in a year

---
###  Application Description 
I chose java as the language for this project as easily demonstrates OOP principles and is
widely used in industry. The user interface is a command line. This was chosen so the less than
eight-hour time allotment could be spent on making a structured program and less on presentation 
details a web application would entail.

No persistence of data exists in the program as again time constraints dictated that be omitted.
If I were to more fully develop this application that would be accomplished with a database such as
mySQL. The application was however structured with objects that would map well into database records.

### PayApp.java (Main)
The main is found in PayApp.java. It consists of a scanner to take in commands from the command line
as well as some help/error messages.

### Other Classes
#### Person.java
Person objects have names which are used to determine if a discount is applied. They also have a "type" of being
an employee or dependent. This class could be extended to provide any number of attributes. Employee pay was put in 
here as an example.

#### EmployeeRecord.java
The employee record has the Person that is the employee as well as a list of dependent Persons.

#### SingleCompany.java
This singleton object class is used to hold company specific values. In this problem there is only one company but 
using this class allow for the program to be easily modified to handle multiple companies. It would provide instance 
variables that would be company specific, such as benefit costs and pay period.

#### Commands.java
This class contains the logic to execute the various commands. 

#### CalcPay.java
This class contains the methods to calculate the pay and benefit costs as required by the problem description.
