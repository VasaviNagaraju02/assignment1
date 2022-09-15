package assignment1;
import java.util.Scanner;

public class Array_Sum_Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[],sum=0,prod=1,num;
Scanner in =new Scanner(System.in);
System.out.println("Enthe the number of array element");
num=in.nextInt();
a= new int[num];
System.out.println("enter the array element:");
for(int i=0;i<num;i++)
{
	System.out.println("enter the "+(i+1)+"elemets");
	a[i]=in.nextInt();
}
	for(int i=0;i<num;i++) {
		sum=sum+a[i];
		prod=prod*a[i];
	}

	System.out.println("sum of array elemen tis"+sum);
	System.out.println("Product of array element is"+prod);
}
	}


