package with.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nisum.model.Product;

public class JavaStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> productsList = new ArrayList<>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productsList2 = productsList.stream().filter(p->p.getPrice()<30000).map(p->p.getPrice())
        .collect(Collectors.toList());
        System.out.println(productsList2);
	}

}
