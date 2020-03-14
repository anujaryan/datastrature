package math;

/**
 * @author Anuj Pachauri
 *
11:51:13 pm
 */
public class UglyNumberII {

	public static int nthUglyDP(int n) {

		int[] merged = new int[n];

		merged[0] = 1;
		int p2 = 0, p3 = 0, p5 = 0;

		for (int i = 1; i < n; i++) {

			merged[i] = Math.min(Math.min(merged[p2] * 2, merged[p3] * 3), merged[p5] * 5);

			if (merged[i] == merged[p2] * 2) {
				p2++;
			}
			if (merged[i] == merged[p3] * 3) {
				p3++;
			}
			if (merged[i] == merged[p5] * 5) {
				p5++;
			}

		}

		return merged[n - 1];
		// return p5;

	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println("10th Ugly number : " + nthUglyDP(n));

	}
}
