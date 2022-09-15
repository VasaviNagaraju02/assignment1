package assignment1;

import java.util.HashMap;

public class Hash_Map7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hmap1=new HashMap<Integer,String>();
		hmap1.put(1, "Blcak");
		hmap1.put(2, "Blue");
		hmap1.put(3, "Green");
		System.out.println("Elemnts of map1"+hmap1);
		System.out.println("Does HashMap Contain key:");
		if(hmap1.containsKey(3)) {
			System.out.println("yes ,key is present");
		}else {
			System.out.println("No,key is not present:");
		}
	}

}
