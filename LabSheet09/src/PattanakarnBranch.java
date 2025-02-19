
public class PattanakarnBranch extends Product{
    public int payUnit() {
        return super.getUnit() / 2;
        
    }
    
    public int freeUnit() {
        return super.getUnit() / 2;
        
    }
    
    public int getTotalPrice() {
        return (super.getUnit() / 2) * 100;
        
    }
    
    public String toString() {
        return String.format("You buy %s units, get free %s units (%s)", this.payUnit(), this.freeUnit(), getTotalPrice());
        
    }
    
}
