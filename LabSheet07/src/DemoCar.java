import java.util.*;

public class DemoCar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Car car = new Car("Chevrolet", "Cruze", 2009, 150000.0);
		
		String companyName;
		String modelName;
		int year;
		
		System.out.println(car);
		
		System.out.println();
		
		System.out.println("Updated Car Detail:");
		System.out.print("Company Name: ");
		companyName = input.nextLine();
		System.out.print("Model Name: ");
		modelName = input.nextLine();
		System.out.print("Year: ");
		year = input.nextInt();
		
		car.setCompanyName(companyName);
		car.setModelName(modelName);
		car.setYear(year);
		
		car.setYear(1000);
		car.setCompanyName("");

		
		input.close();
	}

}
