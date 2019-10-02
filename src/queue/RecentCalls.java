package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anuj Pachauri
 *
11:13:40 pm
 */
public class RecentCalls {

	Queue<Integer> queue;

	RecentCalls() {
		this.queue = new LinkedList<Integer>();
	}

	public int ping(int t) {

		queue.add(t);

		while (queue.peek() < t - 3000) {
			queue.poll();
		}
		return queue.size();
	}
	public static void main(String[] args) {
		RecentCalls tc = new RecentCalls();
		System.out.println(tc.ping(30000));

	}
}
