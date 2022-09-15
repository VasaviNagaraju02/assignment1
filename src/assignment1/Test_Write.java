package assignment1;
import java.io.File;
import java.io.FileWriter;
public class Test_Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	FileWriter  myWrite=new FileWriter("Example.txt");
	myWrite.write("hello");
	myWrite.write("welcome to java ");
	myWrite.close();
}catch (Exception e) {
	System.out.println(e);
}
	}

}
