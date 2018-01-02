package lambdaexpression.withmultuplestatements;
interface Sayable{
	String say(String message);
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable s=(message)->{
			String str1="I would like to say ";
			String str2=str1+message;
			return str2;
		};
		System.out.println(s.say("Time is precious"));
	}

}
