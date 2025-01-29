import java.util.*;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product[] products = new Product[4];
		
		for (int i = 0; i < 4; i++) {
			products[i] = new Product();
			
			System.out.print("Input product Id    : ");
			products[i].setId(scan.nextLine());
			System.out.print("Input product Unit  : ");
			int unit = scan.nextInt();
			products[i].setUnit(unit);
			System.out.print("Input product Price : ");
			double price = scan.nextDouble();
			products[i].setPrice(price);
			scan.nextLine();
			
			System.out.println();
			
		}
		
		Line();
		
		double total = 0;
		
		for (Product pro : products) {
			System.out.println("Product ID : " + pro.getId() + ", Total price = " + pro.calculate() + " baht.");
			total += pro.calculate();
		}
		
		Line();
		
		System.out.println("Total price of all products is " + total + " baht.");
		
		scan.close();
	}
	
	public static void Line () {
		for (int i = 1; i <= 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
