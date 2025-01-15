import java.util.*;

public class Lab504 {
	
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double[] scores = new double[5];
        
        for (int i = 0; i < scores.length; i++){
            System.out.print("Tnput score of student " + (i + 1) + " : ");
            scores[i] = input.nextDouble();
            
        }
        double average = scoresAverage(scores);
        
        System.out.printf("\nAverage of 5 students is %.2f\n", average);
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > average) {
                System.out.printf("> Student %d (%.2f)\n", i + 1, scores[i]);
                
            }
            
        }
        
    }
    public static double scoresAverage(double[] scores01){
        double sumAverage = 0.0;
        
        for (double average : scores01){
            sumAverage += average;
            
        }
        
        return sumAverage / scores01.length;
    }
}