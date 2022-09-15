package assignment1;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked_list5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		list.add("Vasavi");
		list.add("Kashyap");
		list.add("Vasu");
		ListIterator lt=list.listIterator();
		System.out.println("element are");
		while(lt.hasNext()) {
			System.out.println(lt.next()+"");
		}
	}

}
