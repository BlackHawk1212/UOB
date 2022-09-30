package product.code.com;

import java.util.ArrayList;
import java.util.Comparator;

public class productDemo {

	public static void main(String[] args) {
		
		ArrayList <Product> prod = new ArrayList <>();
		
		prod.add(new Product("A001","Milk",10.45));
		prod.add(new Product("B02","Rice",20.50));
		prod.add(new Product("C03","Soap",75.50));
		prod.add(new Product("D04","Cerials",50.50));
		prod.add(new Product("E05","Biscuits",10.50));
		

		System.out.println(prod);
		prod.sort(null);
		
		System.out.println(prod);
		
		prod.remove(new Product("B02","Rice",100.50));
		
		System.out.println(prod);
		
		prod.sort(new Comparator <Product>(){

			@Override
			public int compare(Product arg0, Product arg1) {
				double obj1 = arg0.getPrice();
				double obj2 = arg1.getPrice();
				
				return obj2.compareTo(obj1);
			}
			
		});
		
		System.out.println(prod);
	
	}

}
