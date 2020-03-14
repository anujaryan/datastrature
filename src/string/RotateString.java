package string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Anuj Pachauri
 *
8:57:04 pm
 */
public class RotateString {

	public static boolean rotateString(String A, String B) {

		if (A.length() != B.length()) {
			return false;
		}

		A = A + A;
		if (A.contains(B)) {
			return true;
		}

		return false;


	}

	@Test
	public void testRotateString() {
		Assert.assertTrue(rotateString("abcde", "cdeab"));
	}

	@Test
	public void testRotateStringII() {
		Assert.assertFalse(rotateString("abcde", "abced"));
	}
}
