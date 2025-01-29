
public class Author {
	private String name;
	private String email;
	
	Author () {
		this(null,null);
	}
	
	Author (String name, String email) {
		this.name = name;
		this.email = email;
		
	}
	
	public String getName () {
		return name;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getEmail () {
		return email;
	}
	
	public String toString () {
		return getName() + " (" + getEmail() + ")";
	}
	
}
