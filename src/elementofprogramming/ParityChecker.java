package elementofprogramming;

/**
 * @author Anuj Pachauri
 *
 *         How would you compute the parity of a very large number of 64-bit
 *         words? 3:55:53 pm
 */
public class ParityChecker {

//The time complexity is 0(n), where n is the word size.
	public static short parity(long x) {
		short result=0;
		while(x!=0) {
			
			result ^=(x&1);
			x>>>=1;
		}
		return result;
	}

	// Let k be the number of bits set to1in a particular word. (For example, for
	// 10001010,
	// k = 3.) Then time complexity of the algorithm above is0(k).
	public static short parityII(long x) {
		short result = 0;
		while (x != 0) {

			result ^= 1;
			x &= x - 1;
		}
		return result;
	}


	public static void main(String[] args) {

		System.out.println(parity(2));
		System.out.println(parityII(2));
	}
}
