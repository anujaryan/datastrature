package array2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         2:23:08 pm
 */
public class CandiesDistribution {

	public static int maxCandiDistribution(int[] candies) {

		Map<Integer, Integer> candiMap = new HashMap<Integer, Integer>();

		for (int i : candies) {
			candiMap.put(i, candiMap.getOrDefault(i, 0) + 1);
		}

		return Integer.min(candiMap.size(), candies.length / 2);

	}

	public static void main(String[] args) {
		int[] candies = { 1, 1, 2, 2, 3, 3 };
		int[] candies1 = { 1, 1, 2, 3 };
		int[] candies2 = { 1, 1, 2, 3, 4, 5, 5, 4 };

		System.out.println(maxCandiDistribution(candies));
		System.out.println(maxCandiDistribution(candies1));
		System.out.println(maxCandiDistribution(candies2));
	}
}
