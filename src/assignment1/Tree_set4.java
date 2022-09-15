package assignment1;
import java.util.*;

public class Tree_set4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>tree_set=new TreeSet<String>();
		tree_set.add("02");
		tree_set.add("04");
		tree_set.add("01");
		System.out.println("TreeSet:"+tree_set);
		System.out.println("the first element;"+tree_set.first());
		System.out.println("the last element;"+tree_set.last());
	}

}
