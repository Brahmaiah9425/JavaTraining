//2. Implement Circle, Rectangle classes

interface shape1{
	void draw();
	double area();
}
class Circle1 implements shape1{
	double radius;
	Circle1(double radius){
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public double area() {
		return 3.14 * radius * radius;
	}
}
class Rectangle implements shape1{
	double length, width;
	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
		
	}
	public double area() {
		return length * width;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectable");
		
	}
	
}
public class TestShape1 {
	public static void main(String[] args) {
		shape1 c = new Circle1(5);
		c.draw();
		System.out.println("Area of Circle:" +c.area());
		shape1 r = new Rectangle(4,6);
		r.draw();
		System.out.println("Area of Rectangle:" +r.area());
	}

}
