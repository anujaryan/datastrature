package dynamicProgramming;

/**
 * @author Anuj Pachauri
 *
8:18:30 am
 */
public class MiniSumGrid {

	public int minPathSum(int[][] grid) {

		int[] memo[] = new int[grid.length][grid[0].length];

		return minPathSumHelper(grid, 0, 0, memo);

	}

	/**
	 * @param grid
	 * @param i
	 * @param j
	 * @param memo
	 * @return
	 */
	private int minPathSumHelper(int[][] grid, int row, int col, int[][] memo) {

		if (row == grid.length - 1 && col == grid[0].length - 1)
			return grid[row][col];

		if (memo[row][col] != 0)
			return memo[row][col];

		int rowInc = Integer.MAX_VALUE, colInc = Integer.MAX_VALUE;

		if (row < grid.length - 1)
         rowInc = minPathSumHelper(grid, row + 1, col, memo);

		if (col < grid[0].length - 1)
			rowInc = minPathSumHelper(grid, row, col + 1, memo);

		memo[row][col] = Math.min(rowInc, colInc) + grid[row][col];

		return memo[row][col];
	}

	public static void main(String[] args) {
	int grid[][]	= {
		  {1,3,1},
		  {1,5,1},
		  {4,2,1}
		};
		MiniSumGrid min = new MiniSumGrid();
		System.out.println(min.minPathSum(grid));
	}

}
