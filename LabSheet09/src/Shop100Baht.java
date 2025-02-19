import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		Product sold = new Product();
		
        if (JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?", "Run Program", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            sold = new PattanakarnBranch();
            
        }
        
        int productNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the number of product:"));
        
        sold.setUnit(productNumber);
        
        JOptionPane.showMessageDialog(null, sold);
		
	}

}
