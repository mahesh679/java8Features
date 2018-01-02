package with.outlambdaexpression;

import with.EmployeeInterface;

public class EmployeeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeInterface e = new EmployeeInterface() {
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("Employee doing his work very well...........");
			}
		};
		e.work();
	}

}
