import javax.swing.*;

public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String productName = JOptionPane.showInputDialog("Input Product Name : ");
		
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit : ");
		int productUnit = Integer.parseInt(strProductUnit);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per Unit : "));
		
		double totalPriceofProduct = productUnit * productPrice;
		
		double totalwithVat = totalPriceofProduct * 1.07;
		
		String frmtotalPrice = String.format("%,.2f" , totalPriceofProduct);
		String frmtotalwithVat = String.format("%,.2f" , totalwithVat);
		
		JOptionPane.showMessageDialog(null, "Total Price   is " + frmtotalPrice + " baht."
				+ "\nAdd VAT 7% is " + frmtotalwithVat + " baht.");
		
		
		
	}

}
