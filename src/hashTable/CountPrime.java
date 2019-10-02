/**
12-Aug-2019
Anuj Pachauri

 * 
 */
package hashTable;

/**
 * @author Anuj Pachauri
 *
 *         9:52:57 pm
 */
public class CountPrime {

	public static void main(String str[]) {

		int n = 1000000000;
		System.out.println("Number of Prime Numbers: " + countPrime(n));
	}

	/**
	 * @param n
	 * @return
	 */
	private static int countPrime(int n) {

		int count = 0;

		boolean isPrime[] = new boolean[n];

		for (int i = 2; i <= (int) Math.sqrt(n); i++) {

			for (int j = i * i; j < n; j += i) {
				isPrime[j] = true;

			}

		}
		for (int i = 2; i < n; i++) {
			if (!isPrime[i]) {
				count++;
			}
		}

		return count;
	}
}
