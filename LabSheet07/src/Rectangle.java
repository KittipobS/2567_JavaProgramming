
public class Rectangle {
	/*private float length;
	private float width;
	
	Rectangle() {
		length = 1.0f;
		width = 1.0f;
		
	}*/
	
	private float length = 1.0f;
	private float width = 1.0f;
	
	Rectangle() {
		
	}
	
	Rectangle (float length, float width) {
		this.length = length;
		this.width = width;
		
	}
	
	public float getLength () {
		return this.length;
		
	}
	
	public float setLength (float length) {
		return this.length = length;
		
	}
	
	public float getWidth () {
		return this.width;
		
	}
	
	public float setWidth (float width) {
		return this.width = width;
		
	}
	
	public double getArea () {
		return this.length * this.width;
		
	}
	
	public double getPerimeter () {
		return 2 * (this.length + this.width);
		
	}
	
	public String showData () {
		return "Rectangle[length = " + this.length + ",width = " + this.width + "]";
		
	}
	
	public String toString () {
		return "Rectangle[length = " + this.length + ",width = " + this.width + "]";
		
	}
	
}
