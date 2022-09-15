package assignment1;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		list.add("Vasavi");
		list.add("Kashyap");
		list.add("Vasu");
		ListIterator itr=list.listIterator(2);
		System.out.println("names are");
		while(itr.hasNext()) {
			System.out.print(itr.next()+"");
		}
	}

}
