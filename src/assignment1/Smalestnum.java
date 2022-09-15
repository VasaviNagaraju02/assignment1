package assignment1;

import java.util.Scanner;

public class Smalestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first number");
		x=sc.nextInt();
		System.out.println("Enter your second number");
		y=sc.nextInt();
		System.out.println("Enter your second number");
		z=sc.nextInt();
		
		if(x>y && x>z) {
			System.out.println("Smallest number is:"+x);
			
		}
		else if(y<z) {
			System.out.println("Smallest number is:"+y);
		}
		else  {
			System.out.println("Smallest number is:"+z);
		}
	}

}
