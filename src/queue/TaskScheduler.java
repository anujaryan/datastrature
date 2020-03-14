package queue;

import java.util.Arrays;

/**
 * @author Anuj Pachauri
 *
 *         10:56:47 pm
 */
public class TaskScheduler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] tasks = { 'A', 'A', 'A', 'B', 'B', 'B' };
		int n = 2;
		TaskScheduler ts = new TaskScheduler();
		System.out.println(ts.leastInterval(tasks, n));

	}

	public int leastInterval(char[] tasks, int n) {

		int[] map = new int[26];

		for (char c : tasks) {
			map[c - 'A']++;
		}

		Arrays.sort(map);

		int max_val = map[25] - 1, idle_slots = max_val * n;

		for (int i = 24; i >= 0 && map[i] > 0; i--) {
			idle_slots -= Math.min(map[i], max_val);
		}

		return idle_slots > 0 ? idle_slots + tasks.length : tasks.length;
	}

}
