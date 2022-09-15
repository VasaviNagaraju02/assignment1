package assignment1;

public class Java_Exception_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int data=100/0;
}catch(ArithmeticException e)
{
	System.out.println(e);
}
System.out.println("Welcome to Java Exception");
	}

}
