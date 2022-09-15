package assignment1;
import java.util.Scanner;

public class Ten_Integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		float sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of a array");
		int n= sc.nextInt();
		float arr[]=new float[n];
		System.out.println("enter"+n+"array element:");
		while(i<n) {
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			i++;
		}
		float average=sum/n;
		System.out.println("Average of the numbers is:"+average);

	}

}
