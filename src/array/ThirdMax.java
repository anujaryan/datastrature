/**
10-Aug-2019
Dell

 * 
 */
package array;

import java.util.TreeSet;

/**
 * @author Dell
 *
 *         5:20:01 pm
 */
public class ThirdMax {

	public static void main(String[] args) {

		int[] arg = { 1, 2 };

		int[] arg1 = { 2, 2, 1, 3, 6, 3, 8, 5 };
		System.out.println("Third Largest Number :" + thirdLargest(arg1));
	}

	/**
	 * @param arg
	 * @return
	 */
	private static int thirdLargest(int[] arg) {

		TreeSet<Integer> set = new TreeSet<>();

		for (int num : arg) {

			if (set.contains(num))
				continue;
			if (set.size() <= 2)
				set.add(num);
			else if (num > set.first()) {
				set.pollFirst();
				set.add(num);
			}

		}

		if (set.size() <= 2)
			return set.pollLast();

		return set.pollFirst();
	}
}
