
public class TestLoanCalculator {

	public static void main(String[] args) {
		LoanCalculator loan = new LoanCalculator();
		
		loan.setLoanDetails("Laptop", 50000, 5, 2);
		
		loan.displayLoanDetails();
		
	}

}
