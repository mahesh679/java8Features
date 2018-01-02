package lambdaexpression.withcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class Stores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> list=new ArrayList<>();
		//Adding products to list
		
		list.add(new Product(1,"Apple",35000));
		list.add(new Product(2,"HTC",25000));
		list.add(new Product(3,"Samsung",20000));
		list.add(new Product(4,"Nokia",19000));
		list.add(new Product(5,"sony",19500));
		list.add(new Product(6,"Motorola",19500));
		list.add(new Product(7,"LG",19500));
		list.add(new Product(8,"Huawei",19500));
		
		System.out.println("Sorting on the basis of product name ..........");
		
		Collections.sort(list, (p1,p2) ->{
			return p1.getPname().compareTo(p2.getPname());
		});
		
		list.forEach(p->System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPprice()));
		
		System.out.println("Sorting on the basis of product id............");
		
		Collections.sort(list, (p1,p2) -> {return Integer.compare(p1.getPid(), p2.getPid());});
		
		list.forEach(p->System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPprice()));
		
		System.out.println("Sorting on the basis of product price............");
		
		Collections.sort(list, (p1,p2) ->{return Double.compare(p1.getPid(), p2.getPid());});
		
		list.forEach(p->System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPprice()));
		System.out.println("filter on the basis of product price............");
		
		Stream<Product> filter = list.stream().filter(p->p.getPprice() > 20000);
		
		filter.forEach(p -> System.out.println(p.getPid()+ " "+p.getPname()+ " "+p.getPprice()));
	}

}
