import javax.swing.*;

public class Icecream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String flavor = "";
		String addtopping = "";
		int price = 0;
		
		int choose = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B." +
						"\n[2] Chocolate Flavor 15 B." +
						"\nPress number to choos flavor"));
		
		while (choose != 1 && choose != 2) {
			JOptionPane.showMessageDialog(null,
					"ERROR: Wrong choice!" +
					"\nTry again...",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			choose = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B." +
					"\n[2] Chocolate Flavor 15 B." +
					"\nPress number to choos flavor"));
		}
		
		if (choose == 1) {
			flavor = "Vanilla Flavor";
			price = 10;
		}else if (choose == 2) {
			flavor = "Chocolate Flavor";
			price = 15;
		}
		
		int topping = JOptionPane.showConfirmDialog(null, "Do you want to add topping?",
									"Topping",
									JOptionPane.YES_NO_OPTION);
		
		if (topping == JOptionPane.YES_OPTION) {
			addtopping = "with topping";
			price += 5;
		}else if (topping == JOptionPane.NO_OPTION) {
			addtopping = "no topping";
		}
		
		JOptionPane.showMessageDialog(null,
				"You choose " + flavor +
				"\nAnd " + addtopping +
				"\nTotal price = " + price);
		
	}

}
