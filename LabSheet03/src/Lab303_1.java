import javax.swing.*;

public class Lab303_1 {

	public static void main(String[] args) {
		int space = 0;
		int word = 0;
		
		String words = JOptionPane.showInputDialog(null,"Input sentense : ");
		
		
		while(!words.endsWith("."))
		{
			words = JOptionPane.showInputDialog(null,"Input sentense, again : ");
			
			if (words.endsWith(".")) {
				break;
			}
			
		}
		
		for(int i = 0; i < words.length(); i++)
		{
			if(words.charAt(i) == ' ')
			{
				space++;
			}
		}
		
		String[] splitword = words.split(" ");
		for(int i = 0; i < splitword.length; i++)
		{
			word++;
		}
		
		JOptionPane.showMessageDialog(null,"This sentence has "+ space +" spacebars. "+"\nThis sentence has "+ word +" words.");
		
	}

}
