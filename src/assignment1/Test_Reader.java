package assignment1;
import java.io.File;
import java.util.Scanner;

public class Test_Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	File fileObj=new File("Example.txt");
	Scanner myReader= new Scanner(fileObj);
	while (myReader.hasNextLine()) {
		String data=myReader.nextLine();
		System.out.println(data);
		}
}catch (Exception e) {
	System.out.println(e);
	}
}
	}


