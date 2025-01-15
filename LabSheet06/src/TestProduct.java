
public class TestProduct {

	public static void main(String[] args) {
		Product product1 = new Product();
		
		product1.setProductDetails("Smartphone", 30000.0, 7.0);
		
		System.out.println("Product Details:");
		product1.displayProductDetails();
		
	}

}
