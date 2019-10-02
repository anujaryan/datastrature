package grid;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author Anuj Pachauri
 *
8:32:58 pm
 */
public class OddCells {

	public static int oddCells(int n, int m, int[][] indices) {

		int result[][] = new int[n][m];

		for (int i = 0; i < indices.length; i++) {
			int row = indices[i][0];
			int col = indices[i][1];
			for (int j = 0; j < m; j++) {
				result[row][j]++;
			}
			for (int j = 0; j < n; j++) {
				result[j][col]++;
			}
		}
		int odd = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if (result[i][j] % 2 == 1) {
					odd++;
				}
			}
		}

		return odd;
	}

	@Test
	public void testOddCount() {
		int n = 2, m = 2;
		int[][] indices = { { 1, 1 }, { 0, 0 } };
		assertEquals(0, oddCells(n, m, indices));
	}

	@Test
	public void testOddCount_1() {
		int n = 2, m = 3;
		int[][] indices = { { 0, 1 }, { 1, 1 } };
		assertEquals(6, oddCells(n, m, indices));
		
		Arrays.asList(1, 2);
	}


}
