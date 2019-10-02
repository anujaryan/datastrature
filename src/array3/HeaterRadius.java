package array3;

import java.util.TreeSet;

/**
 * @author Anuj Pachauri
 *
3:37:21 pm
 */
public class HeaterRadius {

	public static int findRadius(int[] houses, int[] heaters) {

		TreeSet<Integer> set = new TreeSet<>();
		for (int i : heaters) {
			set.add(i);
		}



		int res = 0;

		for (int house : houses) {
			int dist1 = set.ceiling(house) == null ? Integer.MAX_VALUE : set.ceiling(house) - house;
			int dist2 = set.floor(house) == null ? Integer.MAX_VALUE : house - set.floor(house);

			res = Math.max(res, Math.min(dist1, dist2));
		}
		return res;
	}

	public static void main(String[] args) {

		int[] houses = { 1, 2, 3 };
		int[] heaters = { 2 };

		TreeSet<Integer> set = new TreeSet<>();

		set.add(1);

		set.add(3);
		set.add(5);

		System.out.println(findRadius(houses, heaters));


	}
}
