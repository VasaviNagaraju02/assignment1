package assignment1;
import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks[]=new int[6];
int i;
float total=0,avg;
Scanner scanner= new Scanner(System.in);
for(i=0;i<6;i++)
{
	System.out.println("enter marks of subhect"+(i+1)+":");
	marks[i]=scanner.nextInt();
	total=total+marks[i];
}
scanner.close();
avg=total/6;
System.out.print("the student grad is:");
if(avg>=80)
{
	System.out.print("A");
}
else if(avg>=60 && avg<80)
{
	System.out.print("B");
}
else if(avg>=40 && avg<60)
{
	System.out.print("C");
}
else
{
	System.out.print("D");
}
	}

}
