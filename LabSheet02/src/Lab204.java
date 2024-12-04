import java.util.*;

public class Lab204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int count;
		
		System.out.print("Input value of x : ");
		int numberX = input.nextInt();
		
		System.out.print("Input value of y : ");
		int numberY = input.nextInt();
		
		do {
			System.out.print("Input value of y, again : ");
			numberY = input.nextInt();
		}while(numberY < numberX);
		
		count = numberX + 1;
		
		do {
			System.out.println(numberX + " + " + count + " = " + (numberX + count));
			numberX = numberX + count;
			count += 1;
		}while(count <= numberY);
		
		
		input.close();
	}

}
