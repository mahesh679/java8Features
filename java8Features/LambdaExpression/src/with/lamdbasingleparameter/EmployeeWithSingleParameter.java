package with.lamdbasingleparameter;

interface Employee {
	String work(String n);
}

public class EmployeeWithSingleParameter {
	public static void main(String[] args) {
		Employee e=(name) -> {
			return "Employee working in "+name;
		};
		System.out.println(e.work("nisum"));
	}
}
