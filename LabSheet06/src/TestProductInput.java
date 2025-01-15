import java.util.*;

public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product product1 = new Product();
		
		System.out.print("Enter product name: ");
		String productName = scan.nextLine();
		System.out.print("Enter product price: ");
		double productPrice = scan.nextDouble();
		System.out.print("Enter VAT rate (%): ");
		double productVAT = scan.nextDouble();
		
		product1.setProductDetails(productName, productPrice, productVAT);
		
		System.out.println("\nProduct Details:");
		product1.displayProductDetails();
		
		scan.close();
	}
	

}


