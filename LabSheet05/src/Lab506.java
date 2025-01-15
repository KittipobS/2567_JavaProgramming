import javax.swing.JOptionPane;

public class Lab506 {
	
    public static void main(String[] args){
        String[] greetings = {"Good Morning","Good Afternoon","Good Evening","Good Night"};
        String allGreetings = "";
        
        for (String greeting : greetings) {
            allGreetings += "-" + greeting + "\n";
            
        }
        
        JOptionPane.showMessageDialog(null , "The greeting words in Engilsh:\n" + allGreetings);
        
    }
}