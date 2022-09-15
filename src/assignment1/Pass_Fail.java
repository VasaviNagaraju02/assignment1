package assignment1;
import java.util.Scanner;

public class Pass_Fail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter score");
i=sc.nextInt();
if(i>=80) {
	System.out.println("Disitintion");
	
}
else if(i>=40 && i<=80) {
	System.out.println("pass");
}
else {
	System.out.println("Fail");
}
	}

}
