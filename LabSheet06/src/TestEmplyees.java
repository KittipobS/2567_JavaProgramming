
public class TestEmplyees {

	public static void main(String[] args) {
		//create
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//set
		emp1.setEmployeeDetails("Natcha", 45, 20.0);
		emp2.setEmployeeDetails("Attakorn", 38, 25.0);
		
		//Display
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetail();
		
		System.out.println("\nEmployee 2 Details");
		emp2.displayEmployeeDetail();
		
	}

}
