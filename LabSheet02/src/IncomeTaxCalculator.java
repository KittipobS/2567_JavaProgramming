import java.util.*;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		
		int taxableIncome;
		double taxPayable;
		
		System.out.print("Enter the taxable income: $");
		taxableIncome = scan.nextInt();
		

		
		if (taxableIncome <= 20000) {
			taxPayable = taxableIncome + (taxableIncome * TAX_RATE_ABOVE_20K);
			} else if (taxableIncome <= 40000) {
				taxPayable = taxableIncome + (taxableIncome * TAX_RATE_ABOVE_40K);
			} else if (taxableIncome <= 60000) {
				taxPayable = taxableIncome + (taxableIncome * TAX_RATE_ABOVE_60K);
			} else {
				taxPayable = taxableIncome + (taxableIncome * TAX_RATE_ABOVE_60K);
			}
		
		System.out.print("The income tax payable is: " + taxPayable);
		
		
		scan.close();
	}

}
