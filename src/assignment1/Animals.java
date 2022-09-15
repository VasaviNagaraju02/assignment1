package assignment1;
abstract class Animal{
	public abstract void printSound();
	public void displayInfo() {
		System.out.println("i am an Animal");
	}
}
class Dog extends Animal{
	public void printSound() {
		System.out.println("Dog Brak");
	}
}
class Cat extends Animal{
	public void printSound() {
		System.out.println("Dog Meow");
	}
}


public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Dog d=new Dog();
Cat c=new Cat();
d.printSound();
d.displayInfo();
c.printSound();
c.displayInfo();
	}

}
