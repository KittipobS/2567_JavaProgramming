import java.util.*;

public class Lab303 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			int space = 0;
			int word = 0;
			
			System.out.print("Input sentense : ");
			String words = input.nextLine();
			
			while(!words.endsWith("."))
			{
				System.out.print("Input sentense, again : ");
				words = input.nextLine();
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
			
			System.out.println();
			System.out.println("This sentence has "+ space +" spacebars.");
			System.out.println("This sentence has "+ word +" words.");
			
			
				
			}		
}
