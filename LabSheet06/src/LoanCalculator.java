
public class LoanCalculator {
	private String Name;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails (String productName, double productPrice, double productInterestRate, int manyYears) {
		Name = productName;
		price = productPrice;
		interestRate = productInterestRate;
		years = manyYears;
		
	}
	
	public double calculateMonthlyPayment () {
		double monthrate = (interestRate / 100) / 12;
		int manymonth = years * 12;
		
		double payment = (price * monthrate * Math.pow(1 + monthrate, manymonth)) / ((Math.pow(1 + monthrate, manymonth)) - 1);
		
		return payment;
	}
	
	public void displayLoanDetails () {
		System.out.println("Product: " + Name);
		System.out.println("Price: " + price);
		System.out.println("Intrest Rate: " + interestRate + "%");
		System.out.println("Loan Period: " + years + " years");
		System.out.println("Monthly Payment: " + calculateMonthlyPayment());
	}
	
}
