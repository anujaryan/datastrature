/**
01-Sep-2019
Anuj Pachauri

 * 
 */
package binarysearch;

/**
 * @author Anuj Pachauri
 *
 *         5:27:32 pm
 */
public class GuessNumberGame extends Guess {

	public int GuessNumber(int n) {
		int low = 0;
		int high = n;
		int mid = 0;

		while (low <= high) {
			mid = low + (high - low) / 2;

			int result = guess(mid);
			if (result == 1) {
				high = mid - 1;
			} else if (result == -1) {
				low = low + 1;
			} else {
				return mid;
			}

		}
		return mid;
	}

	public static void main(String[] args) {

		int n = 20;
		GuessNumberGame obj = new GuessNumberGame();
		System.out.println(" Guess is : " + obj.GuessNumber(n));
	}
}

class Guess {

	int picked = 12;

	public int guess(int num) {
		if (num < picked) {
			return -1;
		} else if (num > picked) {
			return 1;
		} else {
			return 0;
		}
	}
}