package assignment1;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		list.add("Vasavi");
		list.add("Kashyap");
		list.add("Vasu");
		System.out.println("Before adding:"+list);
		LinkedList<String>newlist=new LinkedList<String>();
		newlist.add("Nagaraju");
		newlist.add("Hebbasuru");
		list.addAll(1,newlist);
		System.out.println("After changes:"+list);
	}

}
