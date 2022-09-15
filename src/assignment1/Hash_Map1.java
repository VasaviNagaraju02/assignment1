package assignment1;
import java.util.*;
public class Hash_Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hmap=new HashMap<Integer,String>();
		hmap.put(1, "Blcak");
		hmap.put(2, "Blue");
		hmap.put(3, "Green");
		for(Map.Entry x:hmap.entrySet()){
			System.out.println(x.getKey()+""+x.getValue());
		}
		
	}

}
