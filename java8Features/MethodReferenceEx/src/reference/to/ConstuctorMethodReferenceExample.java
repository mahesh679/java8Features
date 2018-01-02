package reference.to;
interface Messageable{
	Message getMessage(String message);
}
class Message{
	Message(String str){
		System.out.println(str);
	}
}
public class ConstuctorMethodReferenceExample {
	public static void main(String[] args) {
		Messageable m=Message::new;
		m.getMessage("Hello, it is a method reference example for constructor");
		m.getMessage("Hello this java 8 ");
	}

}
