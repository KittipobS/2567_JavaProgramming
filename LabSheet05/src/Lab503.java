import java.util.*;

public class Lab503 {
	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int numberOdd = 0;
        int[] inputNumber = new int[7];
        
        for (int i = 0; i < inputNumber.length; i++){
            System.out.print("Input number " + (i + 1) + " : ");
            inputNumber[i] = input.nextInt();
            
        }
        
        for (int inputNumberOdd : inputNumber){
            int x = (inputNumberOdd%2 != 0) ? numberOdd++ : numberOdd;
            
        }
        
        System.out.print("\nThere are " + numberOdd + " of odd number." +
                         "\nList of odd number :");
        
        for (int inputNumberOdd : inputNumber) {
            if (inputNumberOdd % 2 != 0) { System.out.print(" " + inputNumberOdd); }
            
        }
        
    }
}