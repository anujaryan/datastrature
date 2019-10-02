package queue;

import java.util.PriorityQueue;

/**
 * @author Anuj Pachauri
 *
 *         5:05:17 pm
 */
public class PriorityQueueImpl {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(45);
		pq.add(12);
		pq.add(20);
		pq.add(30);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
	}

}
