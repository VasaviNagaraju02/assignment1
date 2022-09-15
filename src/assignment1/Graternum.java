package assignment1;
import java.util.Scanner;
public class Graternum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your first number");
x=sc.nextInt();
System.out.println("Enter your second number");
y=sc.nextInt();
if(x>y) {
	System.out.println("first number is grater:");
}
else {
	System.out.println("second number is grater:"+x);
}
	}

}
