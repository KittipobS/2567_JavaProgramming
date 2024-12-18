import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int countSpace=0;
		System.out.print("Input a sentence: ");
		String sentence = input.nextLine();
		
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again: ");
			sentence = input.nextLine();
		}
		
		for (int i = 0; i < sentence.length(); i++) {
			if(sentence.charAt(i)== ' ') {
				countSpace++;
				
			}
		}
		
		System.out.println();
		System.out.println("This sentence has " + countSpace + " spacebar.");
		System.out.println("This sentence has " + (countSpace+1) + " word.");

	}

}
