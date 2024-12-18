import java.util.*;

public class Lab304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Full name: ");
		String fullName = scan.nextLine();
		
		int space = fullName.indexOf(" ");
		
		if(space == -1) {
			System.out.println("Incorrect Name");
			
		}else {
			String firstName = (fullName.substring(0,space)).toUpperCase();
			String lastName = (fullName.substring(space + 1)).toLowerCase();
			
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
		}
		
		scan.close();
		
	}
	
}
