package array3;

import java.util.PriorityQueue;

/**
 * @author Anuj Pachauri
 *
8:50:15 pm
 */
public class LastStoneWeight {

	public static int lastStoneWeight(int[] stones) {

		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);

		for (int i : stones) {
			queue.offer(i);
		}

		for (int i = 0; i < stones.length - 1; i++) {

			queue.offer(queue.poll() - queue.poll());
		}

		return queue.poll();


	}

	public static void main(String[] args) {

		int stones[] = { 2, 7, 4, 1, 8, 1 };
		System.out.println(lastStoneWeight(stones));
	}
}
