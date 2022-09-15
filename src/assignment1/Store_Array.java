package assignment1;
import java.util.*;
import java.util.Scanner;

public class Store_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int[] z=new int[10];
for(int i=0;i<z.length;i++) {
	System.out.println("Print the value of z["+i+"]");
	z[i]=s.nextInt();
	
}
for(int i=0;i<z.length;i++) {
	System.out.println("the value z["+i+"]is"+z[i]);

}
	}

}
