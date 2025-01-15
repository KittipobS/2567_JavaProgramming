
public class Product {
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails (String productName, double productPrice, double productVatRate) {
		name = productName;
		price = productPrice;
		vatRate = productVatRate;
		
	}
	
	public double calculateTotalPrice () {
		double vat = price * vatRate / 100;
		double totalPrice = price + vat;
		return totalPrice;
	}
	
	public void displayProductDetails () {
		System.out.println("Product Name: " + name);
		System.out.println("Price (Before VAT): " + price);
		System.out.println("Price (After VAT): " + calculateTotalPrice());
		
	}
	
}
