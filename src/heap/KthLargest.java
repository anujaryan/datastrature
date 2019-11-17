package heap;

import java.util.PriorityQueue;

/**
 * @author Anuj Pachauri
 *
 *         2:28:45 pm
 */
public class KthLargest {

	int capasity;
	PriorityQueue<Integer> pq;
	int nums[];

	KthLargest(int k, int nums[]) {
		this.capasity = k;
		this.nums = nums;
		this.pq = new PriorityQueue<>();
		build(nums);
	}

	public int add(int val) {
		build(val);

		if (!pq.isEmpty()) {
			return pq.poll();
		}
		return -1;
	}

	/**
	 * @param nums2
	 */
	private void build(int[] nums2) {

		for (int i : nums) {
			build(i);
		}

	}

	/**
	 * @param i
	 */
	private void build(int i) {
		pq.offer(i);
		if (pq.size() > capasity) {
			pq.poll();
		}

	}

	public static void main(String[] args) {

		int k = 3;
		int[] nums = { 4, 5, 8, 2 };
		KthLargest kth = new KthLargest(k, nums);
		System.out.println(kth.add(3));
		System.out.println(kth.add(5));
	}
}
