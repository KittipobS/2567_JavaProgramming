import java.util.Scanner;

public class CheckStockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many product list in stock : ");
		int manyStock = scan.nextInt();
		scan.nextLine();
		
		System.out.println();
		
		Product[] products = new Product[manyStock];
		
		for (int i = 0; i < manyStock; i++) {
			products[i] = new Product();
			
			System.out.print("Input product Id    : ");
			products[i].setId(scan.nextLine());
			System.out.print("Input product Unit  : ");
			int unit = scan.nextInt();
			products[i].setUnit(unit);
			scan.nextLine();
			
			System.out.println();
			
		}
		
		Line();
		System.out.println("List of product in 'LOW' status.");
		Line();
		
		for (Product pro : products) {
			if (pro.getUnit() < 5) {
				System.out.println(">> " + pro.getId() + " has " + pro.getUnit() + " units");
			}
		}
		
		Line();
		System.out.println("List of product in 'NORMAL' status.");
		Line();
		
		for (Product pro : products) {
			if (pro.getUnit() >= 5 && pro.getUnit() < 50) {
				System.out.println(">> " + pro.getId() + " has " + pro.getUnit() + " units");
			}
		}
		
		Line();
		System.out.println("List of product in 'HIGH' status.");
		Line();
		
		for (Product pro : products) {
			if (pro.getUnit() >= 50) {
				System.out.println(">> " + pro.getId() + " has " + pro.getUnit() + " units");
			}
		}
		
		scan.close();
	}
	
	public static void Line () {
		for (int i = 1; i <= 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
