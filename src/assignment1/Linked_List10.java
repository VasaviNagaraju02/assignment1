package assignment1;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_List10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	LinkedList<String>list=new LinkedList<String>();
	list.add("Vasavi");
	list.add("Kashyap");
	list.add("Vasu");
	System.out.println("Elements are"+list);
	Object firstele=list.getFirst();
	Object lasttele=list.getLast();
	System.out.println("First elemnts ele:"+firstele);
	System.out.println("Last elemnts ele:"+lasttele);
	
}
}
