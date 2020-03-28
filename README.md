# paylocity
PayApp for paylocity interview.

The company provided the following description of an application:

Business Need:
One of the critical functions that we provide for our clients is the ability
to pay for their employees’ benefits packages. A portion of these costs
are deducted from their paycheck, and we handle that deduction. Please
demonstrate how you would code the following scenario:
 The cost of benefits is $1000/year for each employee
 Each dependent (children and possibly spouses) incurs a cost of
$500/year
 Anyone whose name starts with ‘A’ gets a 10% discount, employee or
dependent
We’d like to see this calculation used in an application where employers
input employees and their dependents, and get a preview of the costs.
This is of course a contrived example. We want to know how you would
implement the application structure and calculations and get a brief
preview of how you work.
Please implement an application based on these assumptions:
 All employees are paid $2000 per paycheck before deductions
 There are 26 paychecks in a year


I chose java as a language for this project as easily demonstrate OOP prinicpals and is
widely used in industry. The user interface is a command line. This was choosen so the 
eight hour time allotment could be spent on making a structured program and less on presentation 
details say, a web application would entail.

No persistance of data exisits in the program as again time constraints dictated that be ommitted.
If I were to more fully develop this application that would be accomplished with a database such as
mySQL. 

The main is found in PayApp.java. It consists of a scanner to take in commands from the command line
as well as some help/error messages.
