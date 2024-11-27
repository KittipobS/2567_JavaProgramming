import java.util.*;

public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Product name   : ");
		String productName = input.nextLine();
		
		System.out.print("Input Product unit   : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input price per unit : ");
		float productPrice = input.nextFloat();
		
		System.out.println("-------------------------------------------");
		
		float totalPriceofProduct = productUnit * productPrice;
		String frmtotalPrice = String.format("%,.2f" , totalPriceofProduct);
		System.out.println("Total Price is " + frmtotalPrice + " baht.");
		
		System.out.println("-------------------------------------------");
		
		System.out.print("How many discount (%) : ");
		float howmanydiscount = input.nextFloat();
		
		System.out.println("-------------------------------------------");
		
		float discount = totalPriceofProduct * (howmanydiscount / 100);
		float totalwithDiscount = totalPriceofProduct - discount;
		
		String frmdiscount = String.format("%,.2f" , discount);
		
		System.out.println("Discount from " + howmanydiscount + "%\t" + frmdiscount + " baht.");
		System.out.printf("Amount to be paid\t%,.2f baht." , totalwithDiscount);
		
		input.close();
	}

}
