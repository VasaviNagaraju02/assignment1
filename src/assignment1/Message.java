package assignment1;

abstract class Parent{
	void message1() {
}
	class Subclass1 extends Parent{
		void message1() {
			System.out.println("this is first subclass");
			
		}
	}
	
class Subclass2 extends Parent{
	void message1() {
		System.out.println("this is second subclass");
		
	}
}
public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Subclass1 sb1=new Subclass1();
Subclass2 sb2=new Subclass2();
sb1.message1();
sb2.message1();

	}



}
