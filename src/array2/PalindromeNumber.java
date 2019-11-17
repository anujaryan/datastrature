package array2;

/**
 * @author Anuj Pachauri
 *
 *         3:09:33 pm
 */
public class PalindromeNumber {

	public static boolean isPalindrome(int x) {

		int temp = x;
		int result = 0;
		while (temp != 0) {
			result = result * 10 + temp % 10;
			temp /= 10;
		}
		if (result == x)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		int x = 121;
		System.out.println(isPalindrome(x));
	}
}
