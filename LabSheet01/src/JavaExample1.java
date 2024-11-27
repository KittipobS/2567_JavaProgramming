
import java.util.*;
import java.text.*;

public class JavaExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input Product name   : ");
		String productName = input.nextLine();
		
		System.out.print("Input Product unit   : ");
		int productUnit = input.nextInt();
		
		System.out.print("Input price per unit : ");
		float productPrice = input.nextFloat();
		
		System.out.println();
		
		float totalPriceofProduct = productUnit * productPrice;
		System.out.println("Total Price is " + frm.format(totalPriceofProduct) + " baht.");
		
		float totalwithVat = totalPriceofProduct + (totalPriceofProduct * 7 / 100);
		System.out.println("Add VAT 7%  is " + frm.format(totalwithVat) + " baht.");
		
		System.out.println();
		//output using String.format and printf
		String frmtotalwithVat = String.format("%,.2f" , totalwithVat);
		System.out.println("output using String.format");
		System.out.println("Add VAT 7%  is " + frmtotalwithVat + " baht.");
		System.out.println();
		System.out.println("output using printf");
		System.out.printf("Add VAT 7%%  is %,.2f baht." , totalwithVat);
		
		input.close();
	}

}
