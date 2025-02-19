
public class Drink {
	private int type;
	private char size;
	
	Drink (int type, char size) {
		this.type = type;
		this.size = size;
	}
	
	Drink () {
		this(0,' ');
	}
	
	public String getTypeName () {
		if (this.type == 1) {
			return "Hot";
		}else if (this.type == 2) {
			return "Cold";
		}
		return null;
	}
	
	public int getTypePrice () {
		if (this.type == 1) {
			return 10;
		}else if (this.type == 2) {
			return 20;
		}
		return 0;
	}
	
	public String getSizeName () {
		if (this.size == 'S') {
			return "Small";
		}else if (this.size == 'M') {
			return "Medium";
		}else if (this.size == 'L') {
			return "Large";
		}
		return null;
	}
	
	public int getSizePrice () {
		if (this.size == 'S') {
			return 15;
		}else if (this.size == 'M') {
			return 20;
		}else if (this.size == 'L') {
			return 25;
		}
		return 0;
	}
	
	public int getTotalPrice () {
		return getTypePrice() + getSizePrice();
	}
	
}
