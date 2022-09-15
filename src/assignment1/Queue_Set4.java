package assignment1;


import java.util.PriorityQueue;

public class Queue_Set4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>q1=new PriorityQueue<String>();
		q1.add("Black");
		q1.add("Green");
		q1.add("Blue");
		System.out.println("First hash Content:"+q1);
		PriorityQueue<String>q2=new PriorityQueue<String>();
		q2.add("Black");
		q2.add("Green");
		q2.add("Blue");
		System.out.println("Second hash Content"+q2);
		q1.retainAll(q2);
		System.out.println("Queue Content:");
		System.out.println(q1);
	}

}
