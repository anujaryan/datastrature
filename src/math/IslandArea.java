package math;

/**
 * @author Anuj Pachauri
 *
7:20:16 pm
 */
public class IslandArea {

	public static int isLandPerimeter(int[][] grid) {

		if (grid == null || grid.length == 0) {
			return 0;
		}

		int sum = 0;

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == 1) {

					sum += calculate(grid, i, j);
				}

			}

		}
		return sum;
	}

	/**
	 * @param grid
	 * @param i
	 * @param j
	 * @return
	 */
	private static int calculate(int[][] grid, int i, int j) {

		int res = 0;

		if (i == 0 || grid[i - 1][j] == 0) {
			res += 1;
		}
		if (i == grid.length - 1 || grid[i + 1][j] == 0) {
			res += 1;
		}
		if (j == 0 || grid[i][j - 1] == 0) {
			res += 1;
		}
		if (j == grid[0].length - 1 || grid[i][j + 1] == 0) {
			res += 1;
		}

		return res;
	}

	public static void main(String[] args) {

		int[][] nums = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 0 } };
		System.out.println(isLandPerimeter(nums));

	}
}
