package with.lambdaexpressionnoparameters;


interface Employees{
	String work();
}


public class EmployeeWithNoParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees s = () -> {
			return "It is lambda expression with no paramters";
		};
		System.out.println(s.work());
	}

}
