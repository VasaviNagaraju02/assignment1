package assignment1;
import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
System.out.println("Enter your age:");
int age= scan.nextInt();
if(age>=18) {
	System.out.println("Your are eligable for voting");
}else
{
	System.out.println("Your not eligable for voting");
		
}
	
	}

}
