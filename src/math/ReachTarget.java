package math;

/**
 * @author Anuj Pachauri
 *
9:20:19 pm
 */
public class ReachTarget {


	public static void main(String[] args) {

		int target = 2;
		System.out.println(reachNumber(target));
	}

	/**
	 * @param target
	 * @return
	 */
	private static int reachNumber(int target) {

		target = Math.abs(target);
		int step = 0;
		int sum = 0;
		while (sum < target) {
			step++;
			sum += step;
		}
		while ((sum - target) % 2 != 0) {
			step++;
			sum += step;
		}
		return step;
	}
}
