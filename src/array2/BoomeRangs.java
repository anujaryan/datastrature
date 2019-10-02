package array2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         12:00:10 am
 */
public class BoomeRangs {

	public static int numberOfBoomerangs(int[][] points) {

		if (points == null || points.length == 0 || points[0].length == 0) {
			return 0;
		}

		int count = 0;

		Map<Integer, Integer> hashmap = new HashMap<>();

		for (int i = 0; i < points.length; i++) {

			// count distances for every i with an empty hashmap

			hashmap.clear();

			for (int j = 0; j < points.length; j++) {
				// it's unnecessary when i==j

				if (i == j)
					continue;

				int distance = (points[j][0] - points[i][0]) * (points[j][0] - points[i][0])
						+ (points[j][1] - points[i][1]) * (points[j][1] - points[i][1]);

				count += hashmap.getOrDefault(distance, 0) * 2;

				hashmap.put(distance, hashmap.getOrDefault(distance, 0) + 1);

			}

		}
		return count;
	}

	public static void main(String[] args) {

		int[][] points = { { 0, 0 }, { 1, 0 }, { 2, 0 } };

		System.out.println("Tuple :" + numberOfBoomerangs(points));

	}
}
