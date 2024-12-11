import java.util.*;

public class Lab303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String sentence = "";
		int space = 0;
		int word = 0;
		
		System.out.print("Input a sentence : ");
		sentence = scan.nextLine();
		
		while (!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			
			if (ch == ' ') {
				space++;
			}else {
				word++;
			}
			
			
		}
		System.out.println("\nThis sentence has " + space + " spacebar.");
		System.out.println("This sentence has " + word + " word.");
		
		scan.close();
	}

}
