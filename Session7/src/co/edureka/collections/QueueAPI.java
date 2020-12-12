package co.edureka.collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAPI {

	public static void main(String[] args) {
		
		//Queue<Integer> queue = new PriorityQueue<Integer>();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		
		// How we added data in Queue
		// 10 9 8 7 6 5 4 3 2 1
		
		// How data will be automatically sorted in PriorityQueue
		// Head: 1 2 3 4 5 6 7 8 9 10 :Tail
		
		int head = queue.peek();
		System.out.println("Head of Queue is: "+head);
		System.out.println("Size of Queue is: "+queue.size());
		
		// remove the head of Queue :)
		queue.poll();

		head = queue.peek();
		System.out.println("Head of Queue Now is: "+head);
		System.out.println("Size of Queue Now is: "+queue.size());
		
		ArrayDeque<Integer> dequeue = new ArrayDeque<Integer>();
		
		dequeue.add(1);
		dequeue.add(2);
		dequeue.add(3);
		dequeue.addFirst(10);
		dequeue.addLast(100);
		
		dequeue.removeFirst();
		dequeue.removeLast();
		
		System.out.println(dequeue.peek());	
		System.out.println(dequeue.size());	

	}

}
