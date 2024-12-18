import java.util.*;

public class Lab404 {

	public static void main(String[] args) {
		inputStudent();

	}
	
	public static void inputStudent () {
		Scanner scan = new Scanner(System.in);
		
		String studentID, subjectCode;
		boolean isStudentIDValid, isSubjectCodeValid;
		
		while (true) {
			System.out.print("Enter Student id: ");
			studentID = scan.nextLine();
			
			System.out.print("Enter Subject id: ");
			subjectCode = scan.nextLine();
			
			isStudentIDValid = isLength(studentID, 10);
			isSubjectCodeValid = isLength(subjectCode, 7);
			
			if (isStudentIDValid && isSubjectCodeValid) {
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
				
				displayData(isITStudent,isITSubject,studentID);
				break;
			}
			
		}
		
	}
	
	public static boolean isLength (String input, int len) {
		return input.length() == len;
	}
	
	public static boolean isITStudent (String input)  {
		String[] splitword = input.split(" ");
		
		if  (splitword[0] == "2") {
			if (splitword[1] == "1" && splitword[2] == "1" && splitword[4] == "1" && splitword[5] == "1") {
				if (splitword[3] == "3") {
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	public static boolean isITSubject (String input)  {
		String[] splitword = input.split(" ");
		
		if  (splitword[0] == "2") {
			if (splitword[1] == "1" && splitword[4] == "1") {
				return true;
			}
		}
		
		return false;
		
	}
	
	public static void displayData (boolean isITStudent, boolean isITSubject, String studentID)  {
		if (isITStudent && isITSubject) {
			System.out.println("\nStudent id: " + studentID + " 1st year student in IT" +
					"\nEnroll in courses for Year 1");
		}else if (isITStudent) {
			System.out.println("\nStudent id: " + studentID + " 1st year student in IT" +
					"\nnot enroll in courses for Year 1");
		}else if (isITSubject) {
			System.out.println("\nStudent id: " + studentID + " is not 1st year student in IT" +
					"\nnot enroll in courses for Year 1");
		}
	}

}
