import java.util.*;

public class Lab505 {
	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] indexArray = {78, 36, 58, 41, 25, 92, 75};
        
        System.out.print("Input index of array : ");
        
        int numberArray = input.nextInt();
        
        while (numberArray < 0 || numberArray >= indexArray.length){
            System.out.print("Input index of array, again : ");
            numberArray = input.nextInt();
            
        }
        
        System.out.println("\nValue in current index is " + indexArray[numberArray]);
        nextData(numberArray,indexArray);
        
    }
    
    public static void nextData(int numberArray01, int[] indexArray01) {
        if (numberArray01 < indexArray01.length - 1) {
        	System.out.println("Value in next    index is " + indexArray01[numberArray01 + 1]); 
        	
        }
        else {
        	System.out.println("Sorry, 6 is the last index in array."); 
        	
        }
        
    }
}