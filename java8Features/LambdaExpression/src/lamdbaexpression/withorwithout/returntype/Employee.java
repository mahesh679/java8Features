package lamdbaexpression.withorwithout.returntype;
interface dividable{
	double divide(int a,int b);
}

public class Employee {
	public static void main(String[] args) {
		// Lambda Expression with out return type
		dividable d1=(x,y)-> (x/y);
		System.out.println(d1.divide(10, 5));
		
		//Lambda Expression with return type
		//for return "{ }" curly brasses is mandatory 
		dividable d2=(s,t) -> {
			return s/t;
		};
		System.out.println(d2.divide(50, 5));
	}
}
