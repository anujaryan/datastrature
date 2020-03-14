package math;

/**
 * @author Anuj Pachauri
 *
10:25:37 pm
 */
public class CheckStraightLine {

	public static boolean checkStraightLine(int nums[][]) {

		int nrow = nums.length;

		int x1 = nums[0][0], y1 = nums[0][1];
		int x2 = nums[1][0], y2 = nums[1][1];
		double slope = (double) (y2 - y1) / (x2 - x1);

		for (int row = 1; row < nrow - 1; row++) {
           
			x1 = nums[row][0];
			y1 = nums[row][1];
			x2 = nums[row + 1][0];
			y2 = nums[row + 1][1];
			double nextslope = (double) (y2 - y1) / (x2 - x1);


			if (slope != nextslope) {
					return false;
				}


		}

		return true;
	}

	public static void main(String[] args) {

		int nums[][] = { { -4, -3 }, { 1, 0 }, { 3, -1 }, { 0, -1 }, { -5, 2 } };
		System.out.println(checkStraightLine(nums));

	}
}
