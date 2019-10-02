package string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Anuj Pachauri
 *
10:20:59 pm
 */
public class ShortestCompletedWords {

	private static final int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 47, 53, 59, 61, 67, 71,
			73, 79, 83, 89, 97, 101, 103 };
	public static String shortestCompletedWord(String licensePlate, String[] words) {

		long charProduct = getCharProduct(licensePlate.toLowerCase());
		String shortest = "aaaaaaaaaaaaaaaaaaaa";// 16 a's
				for(String word:words) {
			if (word.length() < shortest.length() && getCharProduct(word) % charProduct == 0) {
				shortest = word;
			}

		}
		return shortest;
	}

	/**
	 * @param lowerCase
	 * @return
	 */
	private static long getCharProduct(String plate) {

		long product = 1l;

		for (char c : plate.toCharArray()) {

			int index = c - 'a';

			if (0 <= index && index <= 25) {
				product *= primes[index];
			}

		}
		return product;
	}

	@Test
	public void testShortestCompletedWord() {
		
		String licensePlate = "1s3 PSt";
		String[] words = { "step", "steps", "stripe", "stepple" };

		Assert.assertEquals("steps", shortestCompletedWord(licensePlate, words));
	}

	@Test
	public void testShortestCompletedWordII() {


		String licensePlate = "eD34382";
		String[] words = { "chance", "part", "degree", "raise", "radio", "state", "movie", "would", "create", "my" };

		Assert.assertEquals("degree", shortestCompletedWord(licensePlate, words));
	}
}
