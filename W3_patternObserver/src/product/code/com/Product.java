package product.code.com;

import java.text.NumberFormat;
import java.util.Locale;

public class Product implements Comparable <Product> {
	
	public String code;
	public String description;
	public double price;
	
	public Product(String code, String description, double price) {
		this.code = code;
		this.description = description;
		this.price = price;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getformattedPrice() {
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale ("en","LK"));
		return nf.format(price);
	}
	
	public String toString() {
		String msg = code + ":" + description + ":" + getformattedPrice();
		return msg;
	}

	@Override
	public int compareTo(Product arg0) {
		
		return this.code.compareTo(arg0.getCode());
	}
	
	public boolean equals(Object obj) {
		
		Product temp = (Product) obj;
		
		if (this.code.equals(temp.getCode()))
		
			return true;
		
		return false;
		
	}


}
