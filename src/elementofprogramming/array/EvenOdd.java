package elementofprogramming.array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Anuj Pachauri
 *
10:29:14 am
 */
public class EvenOdd {
	final int size = 100000;
	int num[];

	@Before
	public void createLargeArr() {
		System.out.println("hello");
	}

	public static int[] evenOddII(int arr[]) {

		int nextEven = 0, nextOdd = arr.length;
		while (nextEven < nextOdd) {
			if (arr[nextEven] % 2 == 0) {
				nextEven++;
			} else {
				int temp = arr[nextEven];
				arr[nextEven] = arr[nextOdd];
				arr[nextOdd] = temp;
				nextOdd--;
			}
		}
		return arr;
	}

	public static int[] evenOdd(int arr[]) {

		int len = arr.length;
		int even[] = new int[len];
		int odd[] = new int[len];
		int evenIndex = 0;
		int oddIndex = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] % 2 == 0) {
				even[evenIndex++] = arr[i];
			} else {
				odd[oddIndex++] = arr[i];
			}
		}

		int temp = 0;
		while (temp < evenIndex) {
			arr[temp] = even[temp];
			temp++;
		}

		int j = 0;
		while (j < oddIndex) {
			arr[temp] = odd[j++];
			temp++;
		}
		return arr;
	}

	@Test
	public void testEvenOddII() {

		assertArrayEquals(new int[] { 2, 4, 1, 3, 5 }, evenOdd(new int[] { 1, 2, 3, 4, 5 }));
	}

	@Test
	public void testEvenOdd() {
		assertArrayEquals(new int[] { 2, 4, 1, 3, 5 }, evenOdd(new int[] { 1, 2, 3, 4, 5 }));
	}

	@Test
	public void testEvenOdd_Empty() {
		assertArrayEquals(new int[] {}, evenOdd(new int[] {}));
	}

	@Test
	public void testEvenOdd_odd() {
		assertArrayEquals(new int[] { 1, 3, 5, 7 }, evenOdd(new int[] { 1, 3, 5, 7 }));
	}

	@Test
	public void testEvenOdd_even() {
		assertArrayEquals(new int[] { 2, 4, 6, 8 }, evenOdd(new int[] { 2, 4, 6, 8 }));
	}
}
