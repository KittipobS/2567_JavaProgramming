
public class Invoice {
	private int invid;
	private Customer customer;
	private double amount;
	
	Invoice (int invid, Customer customer, double amount) {
		this.invid = invid;
		this.customer = customer;
		this.amount = amount;
		
	}
	
	public int getInvoiceId () {
		return invid;
		
	}
	
	public double getAmount () {
		return amount;
		
	}
	
	public void setAmount (double amount) {
		this.amount = amount;
		
	}
	
	public Customer getCustomer () {
		return customer;
		
	}
	
	public void setCustomer (Customer customer) {
		this.customer = customer;
		
	}
	
	public int getCustomerID () {
		return this.getCustomer().getID();
		
	}
	
	public String getCustomerName () {
		return this.getCustomer().getName();
		
	}
	
	public int getCustomerDiscount () {
		return this.getCustomer().getDiscount();
		
	}
	
	public double getAmountAfterDiscount () {
		return this.getAmount() - (this.getAmount() * this.getCustomerDiscount() / 100);
		
	}
	
	public String toString () {
		return "Invoice[id=" + getInvoiceId() + ",customer=" + customer + ",amount=" + getAmountAfterDiscount() + "]";
		
	}
	
}
