import javax.swing.*;

public class Lab104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Welcome to the payroll application");
		String employeeName = JOptionPane.showInputDialog("Enter employee name");
		double totalH = Double.parseDouble(JOptionPane.showInputDialog("Enter total hours for this employee."));
		double hourly = totalH * 7.5;
		double taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter total hours for this employee."));
		
	}

}
