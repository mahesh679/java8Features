package lambdaexpression.foreachloop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee {
	public static void main(String[] args) {
		List<String> countries=new ArrayList<>();{
			countries.add("India");
			countries.add("USA");
			countries.add("Australia");
			countries.add("Japan");
			countries.add("Pakistan");
			countries.add("Srilanka");
			}
		//countries.forEach(n->System.out.println(n));
		
		List<String> states=new ArrayList<>();
	Map<Integer,String> m=new HashMap<>();
	//	countries.stream().filter(p->states.add(p)).collect(Collectors.toList());
	//Map<Integer,String> m=countries.stream().collect(Collector.toMap(countries::indexOf, countries::get));
		System.out.println("Data for states:");
		states.forEach(p->System.out.println(p));
		
	}
	
}
