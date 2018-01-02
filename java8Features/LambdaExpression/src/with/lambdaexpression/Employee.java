package with.lambdaexpression;

import with.EmployeeInterface;

public class Employee {
	
	public static void main(String[] args) {
		EmployeeInterface e=()->	System.out.println("It is a Simple Lamdba Expression");
		e.work();
	e.running();
	EmployeeInterface.walkinbg();
	}
}
