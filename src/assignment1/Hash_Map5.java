package assignment1;

import java.util.HashMap;

public class Hash_Map5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hmap1=new HashMap<Integer,String>();
		hmap1.put(1, "Blcak");
		hmap1.put(2, "Blue");
		hmap1.put(3, "Green");
		boolean result=hmap1.isEmpty();
		System.out.println("Elemnts of map1"+hmap1);
		hmap1.clear();
		result=hmap1.isEmpty();
		System.out.println("Elemnts of map1"+hmap1);

	}

}
