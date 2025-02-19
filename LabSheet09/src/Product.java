
public class Product {
	private int unit;
	
    public void setUnit(int unit) {
        this.unit = unit;
        
    }
    
    public int getUnit() {
        return this.unit;
        
    }
    
    public int getTotalPrice() {
        return getUnit() * 100;
        
    }
    
    public String toString() {
        return String.format("You buy %s units (%s).", getUnit(), getTotalPrice());
        
    }
	
}
