import javax.swing.JOptionPane;

public class Lab103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int timeparking = Integer.parseInt(JOptionPane.showInputDialog("Input Time parking (minute) : "));
		
		int timeparkingho = timeparking / 60;
		int timeparkingmi = timeparking - (timeparkingho * 60);
		double paidho = timeparkingho * 50;
		double paidmi = timeparkingmi * 0.25;
		double amountpaid = paidho + paidmi;
		
		
		
		JOptionPane.showMessageDialog(null, "You parking " + timeparkingho + " Hour " + timeparkingmi + " Minute."
				+ "\nAmount to be paid is " + amountpaid + " baht.");
		
	}

}
