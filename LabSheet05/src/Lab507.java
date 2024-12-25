import javax.swing.*;

public class Lab507 {

	public static void main(String[] args) {
		int[] number = new int [5];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "input number " + (i + 1) + " :"));
		}
		
		showEven(number);
		showOdd(number);
		
	}
	
	public static void showEven (int[] nums) {
		String number = "";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] %2 == 0) {
				number += nums[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n" + number);
	}
	
	public static void showOdd (int[] nums) {
		String number = "";
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] %2 != 0) {
				number += nums[i] + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n" + number);
	}
	
}
