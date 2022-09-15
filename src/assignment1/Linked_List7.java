package assignment1;
import java.io.*;

import assignment1.Linked_Lits4.Node;

public class Linked_List7 {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void insertfront(int data)
	{
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	public void print()
	{
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"");
			temp=temp.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Linked_List7 l=new Linked_List7();
l.insertfront(6);
l.insertfront(5);
l.insertfront(8);
l.insertfront(9);
l.print();
	}
	

}
