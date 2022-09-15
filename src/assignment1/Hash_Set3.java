package assignment1;
import java.util.*;

public class Hash_Set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hset1=new HashSet<String>();
		hset1.add("Black");
		hset1.add("Green");
		hset1.add("Blue");
		System.out.println("First hash Content");
		HashSet<String>hset2=new HashSet<String>();
		hset2.add("Black");
		hset2.add("Green");
		hset2.add("Blue");
		System.out.println("Second hash Content");
		hset1.retainAll(hset2);
		System.out.println("HashSet Content:");
		System.out.println(hset1);
	}

}
