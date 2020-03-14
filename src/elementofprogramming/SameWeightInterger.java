package elementofprogramming;

/**
 * @author Anuj Pachauri
 *
7:03:45 pm
 */
public class SameWeightInterger {

	private static int NUM_UNSIGN_BITS = 63;

	public static long closestIntSameWeight(Long x) {

		for (int i = 0; i < NUM_UNSIGN_BITS; i++) {

			if (((x >>> i) & 1) != ((x >>> (i + 1)) & 1)) {

				x ^= (1l << i) | (1l << (i + 1));
				return x;
			}

		}

		throw new IllegalArgumentException("All bits are 0 or 1");
	}

	public static void main(String args[]) {

		System.out.println(closestIntSameWeight(6l));
		System.out.println(closestIntSameWeight(96l));
		System.out.println(closestIntSameWeight(8l));
		System.out.println(closestIntSameWeight(0l));
	}
}
