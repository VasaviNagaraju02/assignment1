package assignment1;
import java.io.File;

public class Test_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
File fileObj=new File("example.txt");
try {
	boolean success=fileObj.createNewFile();
	if(success) {
		System.out.println("File got Created");
		
	}else {
		System.out.println("File already exists");
	}
}catch (Exception e) {
	System.out.println(e);
}
	}
	

}
