import java.util.*;

public class BookDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input author name   :");
		String authorName = scan.nextLine();
		
		System.out.print("Input author e-mail :");
		String authorEmal = scan.nextLine();
		
		Author author1 = new Author(authorName,authorEmal);
		
		System.out.println(author1);
		
		System.out.print("\nInput book title :");
		String bookTitle = scan.nextLine();
		
		System.out.print("Input book page  :");
		int bookPage = scan.nextInt();
		
		Book book1 = new Book(bookTitle,author1,bookPage);
		
		System.out.println(book1);
		
		scan.close();
	}

}
