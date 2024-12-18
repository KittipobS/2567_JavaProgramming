import java.util.*;

public class Lab305 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input some sentence: ");
		String senTence = scan.nextLine();
		
		while(!senTence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			senTence = scan.nextLine();
			
		}	
		
		System.out.println();
		
		for (int i = 0;	i<senTence.length(); i++) {
			char alphabet = senTence.charAt(i);
			
			if (alphabet == ' ') {
				System.out.println();
			}else {
				System.out.print(alphabet);
			}
		}
		
		scan.close();
		
	}

}
