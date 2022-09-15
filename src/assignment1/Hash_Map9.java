package assignment1;
import java.util.HashMap;
import java.util.Set;
public class Hash_Map9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hmap1=new HashMap<Integer,String>();
		hmap1.put(1, "Blcak");
		hmap1.put(2, "Blue");
		hmap1.put(3, "Green");
		System.out.println("Elemnts of map1"+hmap1);
		Set set=hmap1.entrySet();
		System.out.println("Set view:"+set);
	}

}
