package reference.to;
interface Sayable1{
	void say();
}
public class StaticMethodReferenceExample{
	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}
	public static void main(String[] args) {
		Sayable1 s=StaticMethodReferenceExample::saySomething;
		s.say();
	}
}