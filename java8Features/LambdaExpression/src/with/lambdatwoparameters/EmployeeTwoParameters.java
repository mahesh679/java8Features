package with.lambdatwoparameters;
interface Employee{
	String working(String employeerName,String projectName);
}

public class EmployeeTwoParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee s=(e,p) -> {
			return "Employee working in "+e+" and assigned to a project "+p;
		};
		System.out.println(s.working("Nisum", "macy's"));
	}

}
