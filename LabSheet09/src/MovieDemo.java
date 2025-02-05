import java.util.*;

public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input movie id   : ");
		String movieId = scan.nextLine();
		System.out.print("Input movie name : ");
		String movieName = scan.nextLine();
		
		System.out.println();
		
		System.out.print("Input director name   : ");
		String directorName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String directorEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		String directorGender = scan.nextLine().toLowerCase();
		for (directorGender != "m" || directorGender != "f") {
			System.out.print("Input director gender, again : ");
			directorGender = scan.nextLine().toLowerCase();
		}
		
		System.out.println();
		
		
		
		scan.close();
	}

}
