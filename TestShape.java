//1. Create interface Shape
interface shape {
	void draw();
	double area();

}
class Circle implements shape {
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public double area() {
		return 3.14 * radius * radius;
	}
}
class TestShape{
	public static void main(String[] args) {
		Circle c = new Circle(5);
		c.draw();
		System.out.println("Area of circle is :" +c.area());
	}
	
}
