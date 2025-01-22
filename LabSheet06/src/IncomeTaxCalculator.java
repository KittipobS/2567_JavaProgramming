
public class IncomeTaxCalculator {
	private double income;
	
	public void setIncome(double srtIncome) {
		income = srtIncome;
		
	}
	
	public double Calculate() {
		double texPayment = 0;
		
		if(income <= 150000) {
			texPayment = 0;
			
		}else if(income <= 300000) {
			texPayment = (income-150000)*0.05;
			
		}else if(income <= 500000) {
			texPayment = (150000*0.05)+((income-300000)*0.1);
			
		}else {
			texPayment = (150000*0.05)+(200000*0.1)+((income-500000)*0.2);
			
		}
		
		return 	texPayment;
	}
	
	public void displayTaxDetail() {
		System.out.println("Income: " + income);
		System.out.println("Tax: " + Calculate());
		
	}
	
}
