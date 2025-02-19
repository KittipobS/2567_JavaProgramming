
public class ResizableCircle extends Circle implements Resizable {
	ResizableCircle (double radius) {
		super(radius);
		
	}
	
	@Override
	public void resize (int percent) {
		this.radius *= percent /100.0;
		
	}
	
	public String toString () {
		return "ResizableCircle[" + super.toString() + "]";
		
	}
	
}
