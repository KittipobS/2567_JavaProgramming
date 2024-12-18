import java.util.*;

public class Lab306 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//String word = "";	
		
		System.out.print("Message : ");
		String message = (scan.nextLine()).toLowerCase();
		
		if(message.indexOf("nichi") >= 0) {
			System.out.print("Nichi is a sentence");
			
		}else {
			System.out.print(message);
		}
		
		scan.close();
	}

}
