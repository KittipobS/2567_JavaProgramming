import java.util.Scanner;
import java.io.*;
public class StudentGrade {
   public static void main(String[] args) throws IOException {
      //(1) open 'score.txt' with Scanner Class.
      Scanner read = new Scanner(new File("src//score.txt"));
      int i = 1;
      //(2) check data in file with each line.
      while (read.hasNext()) {
         //(3) get data from file
         String id    = read.next();        //get student-id
         double score = read.nextDouble();  //get score
         read.next();  //get major-id
         System.out.println(i + "\t" + id + "\t" + (score>=60 ? "S" : "U"));
         i++;
      }
      read.close();  //(4) close file
   }
}
