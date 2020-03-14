package array3;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Anuj Pachauri
 *
10:40:17 pm
 */
public class SortArrParity {

	public static int[] sortArrByParity(int arr[]) {

		int even = 0;
		int odd = 1;
		int temp[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				temp[even] = arr[i];
				even += 2;
			} else {
				temp[odd] = arr[i];
				odd += 2;
			}

		}

		return temp;
	}

	@Test
	public void testParitySortArr() {

		Assert.assertArrayEquals(new int[] { 4, 5, 2, 7 }, sortArrByParity(new int[] { 4, 2, 5, 7 }));
	}


}
