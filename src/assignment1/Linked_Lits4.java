package assignment1;

public class Linked_Lits4 {
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int d){data=d;next=null;}
	}
	void printReverse (Node head)
	{
		if(head==null)
			return;
		printReverse(head.next);
		System.out.print(head.data+"");
	}
	public void push(int new_data)
	{
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Linked_Lits4 llist=new Linked_Lits4();
llist.push(4);
llist.push(3);
llist.push(2);
llist.push(1);

llist.printReverse(llist.head);
	}

}
