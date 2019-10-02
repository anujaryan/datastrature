package grid;

/**
 * @author Anuj Pachauri
 *
9:14:41 am
 */
public class ProjectionArea {

	public static int projectionArea(int[][] grid) {

		int N = grid.length;
		int ans = 0;

		for (int i = 0; i < N; i++) {

			int bestRow = 0; // largest of grid[i][j]
			int bestCol = 0; // largest of grid[j][i]

			for (int j = 0; j < N; j++) {

				if (grid[i][j] > 0)
					ans++; // top shadow;
				bestRow = Math.max(bestRow, grid[i][j]);
				bestCol = Math.max(bestCol, grid[j][i]);
			}
			ans += bestCol + bestRow;

		}

		return ans;
	}

	public static void main(String[] args) {

		int grid[][] = { { 2 } };
		System.out.println("Projection Area: " + projectionArea(grid));

	}
}
