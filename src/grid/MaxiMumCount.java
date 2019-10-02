package grid;

/**
 * @author Anuj Pachauri
 *
11:48:20 am
 */
public class MaxiMumCount {

	public static int maxCount(int m, int n, int[][] ops) {

		int[][] grid = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				grid[i][j] = 0;
			}
		}

		for (int i = 0; i < ops.length; i++) {
			int a = ops[i][0];
			int b = ops[i][1];
			for (int x = 0; x < a; x++) {
				for (int y = 0; y < b; y++) {
					grid[x][y] += 1;
				}
			}

			
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] > max) {
					max = grid[i][j];
				}
			}
		}
		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == max) {
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		int m = 3, n = 3;
		// int[][] ops = { { 2, 2 }, { 3, 3 }, { 2, 2 }, { 3, 3 } };
		int ops[][] = { { 2, 2 }, { 3, 3 }, { 3, 3 }, { 3, 3 }, { 2, 2 }, { 3, 3 }, { 3, 3 }, { 3, 3 }, { 2, 2 },
				{ 3, 3 }, { 3, 3 }, { 3, 3 } };
		
		System.out.println(maxCount(m, n, ops));
	}
}
