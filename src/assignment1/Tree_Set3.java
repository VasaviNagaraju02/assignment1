package assignment1;
import java.util.TreeSet;
import java.util.Iterator;

public class Tree_Set3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>tree_set=new TreeSet<String>();
		tree_set.add("Blue");
		tree_set.add("Green");
		tree_set.add("Black");
		System.out.println("Original tree set:"+tree_set);
		Iterator it=tree_set.descendingIterator();
		System.out.println("Elemnt in Reverse Order:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
