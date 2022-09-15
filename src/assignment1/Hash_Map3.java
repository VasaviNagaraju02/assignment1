package assignment1;
import java.util.HashMap;
import java.util.Map;
public class Hash_Map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hmap1=new HashMap<Integer,String>();
		hmap1.put(1, "Blcak");
		hmap1.put(2, "Blue");
		hmap1.put(3, "Green");
		System.out.println("Elemnts of map1"+hmap1);
		
		HashMap<Integer,String>hmap2=new HashMap<Integer,String>();
		hmap2.put(1, "Blcak");
		hmap2.put(2, "Blue");
		hmap2.put(3, "Green");
		System.out.println("Elemnts of map1"+hmap2);
		
		hmap2.putAll(hmap1);;
		System.out.println("now the elements of map2:"+hmap2);
	}

}
