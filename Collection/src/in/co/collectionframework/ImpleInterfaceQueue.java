package in.co.collectionframework;
import java.*;
import java.util.LinkedList;
import java.util.Queue;
public class ImpleInterfaceQueue {

	public static void main(String[] args) {

		 Queue q1=new LinkedList();//new PriorityQueue
		 q1.add(1001);
		 q1.add(2002);
		 q1.add(450);
		 q1.add(500);
		 q1.add(550);
		 q1.add(800);
		 q1.add("SKODA");
		 q1.add("HONDA");
		 q1.add("TOYOTA");
		 q1.offer(1000);//Add elements to the Queue
		 System.out.println(q1.element());//retrive but does not remove the head
	     System.out.println(q1.peek());//retrive but does not remove the head
		 System.out.println("*************");
		 System.out.println(q1.remove());//retrive and remove the head
		 System.out.println(q1.poll());//retrive and remove the head
		 
		 
	}

}
