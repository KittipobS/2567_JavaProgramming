import javax.swing.*;
import java.text.*;

public class Lab201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int BUFFET = 299;
		int isMember;
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalPrice = BUFFET * numberofCustomer;
		
		//System.out.printf("Total price is %,.2f baht.", totalPrice);
		
		do {
			isMember = JOptionPane.showConfirmDialog(null, "Total price is " + frm.format(totalPrice) + " baht." +
					"\nDo you have a member card?");
		}while(isMember == JOptionPane.CANCEL_OPTION); //(isMember == 2)
		
		if (isMember == JOptionPane.YES_OPTION) { //if (isMember == 0)
			double discount = totalPrice * 0.90;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(discount) + " baht.");
		}else if (isMember == JOptionPane.NO_OPTION) { //if (isMember == 1)
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalPrice) + " baht.");
		}
		
		
		
	}

}
