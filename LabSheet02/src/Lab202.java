import java.util.*;

public class Lab202 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int beforenumber;
		
		System.out.print("Input number : ");
		int number = input.nextInt();
		
		beforenumber = number -1;
		
		while (true) {
			if (beforenumber > number) {
				break;
			}
			
			beforenumber = number;
			
			System.out.print("Input number : ");
			number = input.nextInt();
			
		}
		
		System.out.print("BYE BYE");
		
		input.close();
	}

}
