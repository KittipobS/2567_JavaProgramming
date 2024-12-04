import javax.swing.*;

public class Lab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Welcome to the payroll application");
		String employeeName = JOptionPane.showInputDialog("Enter employee name");
		double totalH = Double.parseDouble(JOptionPane.showInputDialog("Enter total hours for this employee."));
		double hourly = Double.parseDouble(JOptionPane.showInputDialog("Enter hours wage for this employee."));
		double gross = totalH * hourly;
		double tax = gross * 0.15;
		double earnings = gross - tax;
		JOptionPane.showMessageDialog(null,"Employee name: " + employeeName +
				"\nHours worked: " + totalH +
				"\nHours wage: $" + hourly +
				"\nGross earnings: " + gross +
				"\nTax rate: 0.15" +
				"\nTax: $" + tax +
				"\nNet earnings: $" + earnings);
		
	}

}
