import javax.swing.*;

public class Lab203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String meaning = "";
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight: "));
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height: "));
		
		double bmi = weight / ((height / 100) * (height / 100));
		
		if (bmi <= 18.5) {
			meaning = "Underweight";
		}else if (bmi <= 24.9) {
			meaning = "Normal-weight";
		}else if (bmi <= 29.9) {
			meaning = "Overweight";
		}else if (bmi > 29.9) {
			meaning = "Obesity";
		}
		String frmbmi = String.format("%,.1f" , bmi);
		JOptionPane.showMessageDialog(null,
				"BMI = " + frmbmi +
				"\nYou're " + meaning,
				"BMI",
				JOptionPane.WARNING_MESSAGE);
		
	}

}
