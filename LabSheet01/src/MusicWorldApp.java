import javax.swing.*;

public class MusicWorldApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = JOptionPane.showInputDialog("This progeam calculates the total cost of a CD order\nPlease enter the ID of the CD");
		String title = JOptionPane.showInputDialog("Please enter the title of the CD");
		double priceCD = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
		double quantity = Double.parseDouble(JOptionPane.showInputDialog("Please enter the quantity to be purchased"));
		double subtotal = priceCD * quantity;
		double tax = subtotal * 6.25 / 100;
		double cdTotal = subtotal + tax;
		String frmquantity = String.format("%,.0f" , quantity);
		JOptionPane.showMessageDialog(null,"Summary of the transaction:" +
				"\n\nCD ID: " + id +
				"\nCD Title: " + title +
				"\nCD Unit Price: $" + priceCD +
				"\nCD Quantity: " + frmquantity +
				"\n\nSubtotal: $" + subtotal +
				"\nTax rate: 6.25%" +
				"\nTotal: $" + cdTotal +
				"\n\nEnd of Program");

	}

}
