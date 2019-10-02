package array2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         12:12:16 am
 */
public class DominoPairs {

	public static int numEquivDominoPairs(int[][] dominos) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int[] d : dominos) {
			String key = d[0] < d[1] ? d[0] + " " + d[1] : d[1] + " " + d[0];
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		int res = 0;
		for (int d : map.values()) {
			res += helper(d);
		}

		return res;
	}

	/**
	 * @param d
	 * @return
	 */
	private static int helper(int d) {

		if (d < 2)
			return 0;
		return d * (d - 1) / 2;

	}

	public static void main(String[] args) {

		int[][] dominoes = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 5, 6 } };
		System.out.println("Dominos : " + numEquivDominoPairs(dominoes));

	}
}
