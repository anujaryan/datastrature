package math;

/**
 * @author Anuj Pachauri
 *
 *         12:25:33 am
 */
public class HammingWeight {

	public static int hammingWeight(int n) {

		int bits = 0;
		int mask = 1;

		for (int i = 0; i < 32; i++) {

			if ((n & mask) != 0) {
				bits++;
			}
			mask <<= 1;
		}

		return bits;

	}

	public static int hammingWeightoptimal(int n) {
		int sum = 0;

		while (n != 0) {
			sum++;
			n &= (n - 1);
		}

		return sum;

	}

	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;
		System.out.println("Number Of 1's bits are :" + hammingWeight(n));

		System.out.println("Number Of 1's bits are :" + hammingWeightoptimal(n));

	}
}
