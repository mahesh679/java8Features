package reference.to;
interface sayable{
	void say();
}
public class InstanceMethodReferenceExample {
	public void saySomething() {
		System.out.println("Hello, it is a non-static method.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceMethodReferenceExample methodReferenceExample = new InstanceMethodReferenceExample();
		sayable s=methodReferenceExample::saySomething;
		s.say();
	}

}
