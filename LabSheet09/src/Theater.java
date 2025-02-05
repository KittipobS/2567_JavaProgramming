
public class Theater extends Movie {
	private int theater;
	
	Theater (String id, String name, Director director, int theater) {
		super(id,name,director);
		this.theater = theater;
	}
	
	Theater () {
		super(null,null,null);
		this.theater = 0;
	}
	
	public String getTheaterName () {
		if (theater < 12) {
			return "Basic Theater";
		}else if (theater < 14) {
			return "Sweet Theater";
		}else if (theater == 15) {
			return "Premium Theater";
		}else {
			return null;
		}
	}
	
	public String toString () {
		return super.getName() + ": " + super.toString() ;
	}
	
}
