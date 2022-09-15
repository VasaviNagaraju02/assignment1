package assignment1;
import java.util.*;
public class Hash_Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hset=new HashSet<String>();
		hset.add("Black");
		hset.add("Green");
		hset.add("Blue");
		System.out.println("Original hash set:"+hset);
		HashSet<String>new_hset=new HashSet<String>();
		new_hset=(HashSet)hset.clone();
		System.out.println("Cloned hash set:"+new_hset);
	}

}
