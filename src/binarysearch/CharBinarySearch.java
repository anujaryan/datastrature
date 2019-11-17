/**
01-Sep-2019
Anuj Pachauri

 * 
 */
package binarysearch;

/**
 * @author Anuj Pachauri
 *
 *         4:51:41 pm
 */
public class CharBinarySearch {

	public static int searchChar(char[] chars, char target) {

		int low = 0;
		int high = chars.length - 1;
		int mid = 0;

		while (low <= high) {

			mid = low + (high - low) / 2;

			if (chars[mid] > target) {
				low = mid + 1;

			} else if (chars[mid] < target) {
				high = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;

	}

	public static char nextGreatestCharacter(char[] letters, char target) {

		int low = 0;
		int high = letters.length - 1;
		char ans = '&';
		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (letters[mid] > target) {
				high = mid - 1;
				ans = letters[mid];
			} else {
				low = mid + 1;
			}
		}

		if (ans == '&')
			return letters[0];
		return ans;

	}

	public static void main(String[] args) {

		char[] chars = { 'a', 'c', 'f', 'g', 'i', 'm' };
		char target = 'e';
		System.out.println("Chars Index in arrays " + searchChar(chars, target));

		System.out.println("Chars Index in arrays " + nextGreatestCharacter(chars, target));
	}
}
