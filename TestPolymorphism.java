class Animal{
	void sound() {
		System.out.println("Animal makes a sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("cat meows");
	}
}

public class TestPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a;
		a = new Dog();
		a.sound();
		a = new Cat();
		a.sound();

	}

}
