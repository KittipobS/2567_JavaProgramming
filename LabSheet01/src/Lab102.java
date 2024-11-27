import java.util.*;

public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the number of minutes : ");
		int minutesNumber = input.nextInt();
		
		//int years = minutesNumber / 525600;
		int years = minutesNumber / (60*24*30*12);
		int days = (minutesNumber - (years * 525600)) / 1440;
		
		System.out.println(minutesNumber + "minutes is approximately " + years + " years and " + days + " days");
		
		input.close();
	}

}
