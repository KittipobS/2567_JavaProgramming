import java.util.*;

public class PensionContributionCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;
		
		int salary, age;
		int contributableSalary;
		double employeeContribution, employerContribution, totalContribution;
		
		System.out.print("Enter the monthly salary: $");
		salary = scan.nextInt();
		
		System.out.print("Enter the age: ");
		age = scan.nextInt();
		
		
		if (age <= 55) { // 55 and below
			employeeContribution = salary * EMPLOYEE_RATE_55_AND_BELOW;
			employerContribution = salary * EMPLOYER_RATE_55_AND_BELOW;
			} else if (age <= 60) { // (60, 65]
				employeeContribution = salary * EMPLOYEE_RATE_55_TO_60;
				employerContribution = salary * EMPLOYER_RATE_55_TO_60;
			} else if (age <= 65) { // (55, 60]
				employeeContribution = salary * EMPLOYEE_RATE_60_TO_65;
				employerContribution = salary * EMPLOYER_RATE_60_TO_65;
			} else { // above 65
				employeeContribution = salary * EMPLOYEE_RATE_65_ABOVE;
				employerContribution = salary * EMPLOYER_RATE_65_ABOVE;
			}
		
		if (employeeContribution > 6000) {
			employeeContribution = 6000;
		}
		if (employerContribution > 6000) {
			employerContribution = 6000;
		}
		
		totalContribution = employeeContribution + employerContribution;
		
		System.out.printf("The employee's contribution is: $%,.2f\n" , employeeContribution);
		System.out.printf("The employer's contribution is: $%,.2f\n" , employerContribution);
		System.out.printf("The total contribution is: $%,.2f\n" , totalContribution);
		
		scan.close();
	}

}
