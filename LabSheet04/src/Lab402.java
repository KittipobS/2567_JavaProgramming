import javax.swing.*;

public class Lab402 {

	public static void main(String[] args) {
		String word = JOptionPane.showInputDialog("Input year:");
		int year = Integer.parseInt(word);
		
		while (!checkYear(year)) {
			word = JOptionPane.showInputDialog("Input year, again:");
			year = Integer.parseInt(word);
		}
		
		JOptionPane.showMessageDialog(null, 
				isLeapYear(year)
				?year + " is Leap year."
				:year + " is NOT Leap year.");
		
	}
	
	public static boolean isLeapYear (int year) {
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				return true;
			}else if (year % 100 == 0 && year % 400 == 0) {
				return true;
			}
			
		}
		return false;	
	
	}
	
	public static boolean checkYear (int year) {
		if (year >= 1000 && year <= 3000) {
			return true;

		}
		return false;
		
	}
	
}
