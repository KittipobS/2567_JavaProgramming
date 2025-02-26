import javax.swing.*;

public class CoffeeShopDemo {

	public static void main(String[] args) {
		Barista staff1 = new Barista("Leon", 'M');
        Barista staff2 = new Barista("Claire", 'F');

        int drinkType = Integer.parseInt(JOptionPane.showInputDialog("Enter Drink type\n1 - Hot\n2 - Cold"));
        int coffeeType = Integer.parseInt(JOptionPane.showInputDialog("Enter Coffee type:\n1 - Americano\n2 - Espresso\n3 - Cappuccino"));
        char coffeeSize = JOptionPane.showInputDialog("Enter Coffee size\nS - Short\nT - Tall\nG - Grande\nV - Venti").toUpperCase().charAt(0);
        int baristaNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Barista number:\n1 - Leon\n2 - Claire"));

        Barista selectedBarista = (baristaNumber == 2) ? staff2 : staff1;
        Coffee order = new Coffee(drinkType, coffeeType, coffeeSize, selectedBarista);
        String output = order.toString() + "\nBarista: " + selectedBarista.getName() + " (" + selectedBarista.getGenderName() + ")";

        JOptionPane.showMessageDialog(null, output);
		
	}

}
