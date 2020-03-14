package string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Anuj Pachauri
 *
8:20:26 pm
 */
public class ReverseLetters {

	public static String reverseString(String S) {

		char[] str = S.toCharArray();
		int len = str.length - 1;
		int i=0;
		while (i <= len) {
			if (Character.isLetter(str[i]) && Character.isLetter(str[len])) {

				char c = str[i];
				str[i] = str[len];
				str[len] = c;
				i++;
				len--;
			} else if (!Character.isLetter(str[i])) {
				i++;
			} else {
				len--;
			}
		}

		return String.valueOf(str);
	}

	@Test
	public void testReverseString() {
		Assert.assertEquals("dc-ba", reverseString("ab-cd"));
	}

	@Test
	public void testReverseStringII() {
		Assert.assertEquals("j-Ih-gfE-dCba", reverseString("a-bC-dEf-ghIj"));
	}

	@Test
	public void testReverseStringIII() {
		Assert.assertEquals("Qedo1ct-eeLg=ntse-T!", reverseString("Test1ng-Leet=code-Q!"));
	}

	@Test
	public void testReverseStringIV() {
		Assert.assertEquals("", reverseString(""));
	}

	@Test
	public void testReverseStringV() {
		Assert.assertEquals("!", reverseString("!"));
	}
}
