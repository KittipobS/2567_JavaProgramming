
public class Coffee extends Drink{
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	Coffee (int type, int typeCoffee, char sizeCoffee, Barista barista) {
		this.typeCoffee = typeCoffee;
		this.sizeCoffee = sizeCoffee;
		this.barista = barista;
		super(type, sizeCoffee);
	}
	
	Coffee (int type, int typeCoffee) {
		this.typeCoffee = typeCoffee;
		super(type,' ');
	}
	
	public Barista getBarista() {
		return this.barista;
	}
	
	public String getTypeName() {
		return super.getTypeName();
	}
	
	public int getTypePrice() {
		return super.getTypePrice();
	}
	
	public String getSizeName () {
		return super.getSizeName();
	}
	
	public int getSizePrice() {
		return super.getSizePrice();
	}
	
	public int getTotalPrice() {
		return super.getTotalPrice();
	}
	
	public String toString () {
		
	}
	
}
