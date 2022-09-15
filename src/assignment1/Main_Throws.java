package assignment1;

public class Main_Throws {
	static  void checkAge(int age) throws
	ArithmeticException{
		if(age<18) {
			throw new
			ArithmeticException("Access Denied-you must be at least 18 yearts old");
			
			
		}
		else {
			System.out.println("Access Granted-You are old enough!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
checkAge(12);
	}

}
