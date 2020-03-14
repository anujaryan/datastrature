package elementofprogramming;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Anuj Pachauri
 *
10:30:43 pm
 */

public class DecimalPalindrome {

	public static void main(String[] args) {
		long d = 24;
		long d1 = 11;
		System.out.println(checkPalindrome(d));
		System.out.println(checkPalindrome(d1));
	}

	@Test
	public void testPalindrome() {
		assertTrue(checkPalindrome(11));
		assertTrue(isPalindromeNumber(11));

	}

	@Test
	public void testPalindrome_2() {
		assertEquals(true, checkPalindrome(0));
		assertEquals(true, isPalindromeNumber(0));
	}

	@Test
	public void testPalindrome_large() {
		assertEquals(false, checkPalindrome(87690020));
		assertEquals(false, isPalindromeNumber(87690020));
	}

	@Test
	public void testPalindrome_minus() {
		assertEquals(false, checkPalindrome(-111));
	}

	@Test
	public void testPalindrome1() {
		assertEquals(false, checkPalindrome(12));
		assertEquals(false, isPalindromeNumber(12));
	}
	
	private static boolean isPalindromeNumber(int x) {
		if (x < 0)
			return false;

		final int numOfDigits = (int) Math.floor(Math.log10(x)) + 1;
		int msdMask = (int) Math.pow(10, numOfDigits - 1);

		for (int i = 0; i < numOfDigits / 2; i++) {

			if (x / msdMask != x % 10) {
				return false;
			}
			x %= msdMask;// remove most significant digit;
			x /= 10; // remove least significant digit
			msdMask /= 100;

		}

		return true;

	}

	/**
	 * @param d time complextiy is O(n) where n is n of digit in K
	 */
	private static boolean checkPalindrome(long d) {

		if (d < 0)
			return false;
		long revN = 0;
		long x = d;
		while (d != 0) {
			revN = revN * 10 + d % 10;
			d /= 10;
		}
		if (x == revN)
			return true;

		return false;
	}
}
