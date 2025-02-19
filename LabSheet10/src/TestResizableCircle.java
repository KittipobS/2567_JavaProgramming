
public class TestResizableCircle {

	public static void main(String[] args) {
		ResizableCircle rc = new ResizableCircle(10.0);
		
		System.out.println(rc);
		System.out.println("Perimeter: " + rc.getPerimeter());
		System.out.println("Area: " + rc.getArea());
		Line();
		rc.resize(50);
		System.out.println("After resize(50%): " + rc);
		System.out.println("Perimeter: " + rc.getPerimeter());
		System.out.println("Area: " + rc.getArea());
		
	}
	
	public static void Line() {
		for (int i = 1; i <= 50; i++)
			System.out.print("*");
		System.out.println();
	}

}
