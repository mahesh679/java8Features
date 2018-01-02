package foreachloop.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForeachExample {
	public static void main(String[] args) {
		List<Integer> myList=new ArrayList<>();
		for(int i=0;i<100;i++)
			myList.add(i);
		
		/*//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()) {
			Integer itr = it.next();
			System.out.println("Normal iteration :"+itr);
			
		}
		*/
		//traversing through for each method
		
		myList.forEach(i->System.out.println("Custom Iteration"+i));
		
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("forEach anonymous class Value ::"+t);
			}
		});
	}
}
