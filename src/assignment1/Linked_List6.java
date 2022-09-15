package assignment1;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>linkedlist=new LinkedList<String>();
linkedlist.add("Vasavi");
linkedlist.add("Vasu");
linkedlist.add("Kashyap");
linkedlist.add("Nagaraj");
linkedlist.add("Mysuru");
linkedlist.add(4,"NEW ELEMENT");
System.out.println("LinkedList element After addition:");
Iterator it=linkedlist.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

	}

}
