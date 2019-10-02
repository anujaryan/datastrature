package array2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
 *         10:52:28 pm
 */
public class MagicSquare {

	public static int numMagicSquareInside(int nums[][]) {

		int rowsum = 0;

		int colsum = 0;

		int maindiasum = 0;

		int secondsum = 0;
		List<Integer> list = new ArrayList<>();
		for (int row = 0; row < nums.length; row++) {
			colsum = 0;
			for (int col = 0; col < nums[0].length - 1; col++) {
				colsum += nums[row][col];
				if (row == col) {
					maindiasum += nums[row][col];

				}

				if ((row == 0 && col == 2) || (row == 2 && col == 0) || col == 1 && row == 1) {
					secondsum += nums[row][col];

				}
			}
			list.add(colsum);

		}
		System.out.println(" Main dia" + maindiasum + " second-dia-sum  " + secondsum + " colsum " + list.get(2));

		return 0;
	}

	public static void main(String[] args) {

		// int nums[][] = { { 4, 3, 8, 4 }, { 9, 5, 1, 9 }, { 2, 7, 6, 2 } };

		// System.out.println(numMagicSquareInside(nums));

		System.out.println(" Main " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(7);
		System.out.println("Main " + Thread.currentThread().getPriority());

		Thread t = new Thread("New Thread");
		t.start();
		System.out.println(" New Thread " + t.currentThread().getPriority());

	}
}
