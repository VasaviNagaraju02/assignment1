package assignment1;

import java.util.HashMap;

public class Hash_Map4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hmap1=new HashMap<Integer,String>();
		hmap1.put(1, "Blcak");
		hmap1.put(2, "Blue");
		hmap1.put(3, "Green");
		System.out.println("Elemnts of map1"+hmap1);
		hmap1.clear();
		System.out.println("now element of map1:"+hmap1);
	}

}
