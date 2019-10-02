package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
10:13:37 pm
 */
public class Songs60 {

	public static int songDivisibleBy60(int[] times) {

		int count = 0;
		for (int i = 0; i < times.length; i++) {

			for (int j = i + 1; j < times.length; j++) {
				if ((times[i] + times[j]) % 60 == 0) {
					count++;
				}
			}
		}

		return count;
	}

	public static int songDivisibleBy60III(int[] times) {

		Map<Integer, Integer> map = new HashMap<>();
		int ans = 0;
		for (int t : times) {

			int d = (60 - t % 60) % 60;
			if (map.containsKey(d)) {
				ans += map.get(d);
			}

			map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);

		}

		return ans;
	}

	public static int songDivisibleBy60II(int[] times) {

		int res = 0;
		int dp[] = new int[60];
		for (int t : times) {

			res += dp[(600 - t) % 60];
			dp[t % 60] += 1;

		}

		return res;
	}

	public static void main(String[] args) {

		int times[] = { 30, 20, 150, 100, 40 };
		int times1[] = { 60, 60, 60 };
		// System.out.println(songDivisibleBy60(times));
		// System.out.println(songDivisibleBy60(times1));
		// System.out.println(songDivisibleBy60II(times1));
		System.out.println(songDivisibleBy60III(times1));
	}
}
