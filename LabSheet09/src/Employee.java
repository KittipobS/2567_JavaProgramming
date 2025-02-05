
public class Employee {
	private String id;
	private String name;
	private double salary;
	
	Employee (String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	
	Employee (String id, String name) {
		this(id,name,0.0);
		
	}
	
	public String getId () {
		return id;
	}
	
	public String getName () {
		return name;
	}

	public double getSalary () {
		return salary;
	}
	
}
