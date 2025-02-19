import java.util.*;

public class MovieDemo {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input movie id: ");
        String movieId = input.nextLine();
        
        System.out.print("Input movie name : ");
        String movieName = input.nextLine();
        
        System.out.println();
        
        System.out.print("Input director name:");
        String directorName = input.nextLine();
        
        System.out.print("Input director e-mail:");
        String directorEmail = input.nextLine();
        
        System.out.print("Input director gender : ");
        char gender = input.nextLine().toUpperCase().charAt(0);
        
        while (true) {
        if(gender == 'M'|| gender=='F') {break;}
        System.out.print("Input director gender, again : ");
        gender = input.next().toUpperCase().charAt(0);
         
        }
        
        System.out.println();
        
        System.out.print("Input movie theater no. : ");
        int movieTheaterNo = input.nextInt();
        
        while (true) {
        	if (movieTheaterNo >= 1 && movieTheaterNo <= 15) 
            	{break;}
            System.out.print("Please input 1 - 15 only. : ");
            movieTheaterNo = input.nextInt();
            
        }
        System.out.println();
        
        Director director = new Director(directorName, directorEmail, gender);
        Theater theater = new Theater(movieId, movieName, director, movieTheaterNo);
        System.out.print(theater);
        
        input.close();
        
        }
        
}