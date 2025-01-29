
public class Product {
	 private String productId;
	 private int productUnit;
	 private double productPrice;
	 
	 public void setId (String pid) {
		 productId = pid;
	 }
	 
	 public String getId () {
		 return productId;
	 }
	 
	 public void setUnit (int proUnit) {
		 productUnit = proUnit;
	 }
	 
	 public int getUnit () {
		 return productUnit;
	 }
	 
	 public void setPrice (double proPrice) {
		 productPrice = proPrice;
	 }
	 
	 public double getPrice () {
		 return productPrice;
	 }
	 
	 public double calculate () {
		 return productUnit * productPrice;
	 }
	 
}
