/**
05-Sep-2019
Anuj Pachauri

 * 
 */
package slidingwindow;

/**
 * @author Anuj Pachauri
 *
 *         10:58:07 pm
 */
public class DietPlain {

	public static int dietPlanPerformance(int calories[], int k, int lower, int upper) {

		int N = calories.length;
		if (N == 0)
			return 0;
		// running sum of points
		int res = 0;
		// sum of the current sequence of k days

		int sum = 0;

		int p = 0;

		for (; p < k; p++) {
			sum += calories[p];
		}

		// check if first sequence get any points

		if (sum < lower) {
			res--;
		}
		if (sum > upper)
			res++;

		// start loop for the rest of days

		while (p < N) {
			// count sum of next sequence

			sum -= calories[p - k];

			sum += calories[p];

			// check for points

			if (sum < lower)
				res--;
			if (sum > upper)
				res++;

			p++;
		}

		return res;
	}

	public static void main(String[] args) {

		int[] calories = { 1, 2, 3, 4, 5 };
		int k = 2, lower = 3, upper = 3;
		System.out.println("Diet Plan Performance :" + dietPlanPerformance(calories, k, lower, upper));

	}
}
