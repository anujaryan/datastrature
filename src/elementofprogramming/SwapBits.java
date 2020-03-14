package elementofprogramming;

/**
 * @author Anuj Pachauri
 *
4:29:23 pm
 */
public class SwapBits {

	public static long swapBits(long x, int i, int j) {

		if (((x >>> i) & 1) != ((x >>> j) & 1)) {


			long bitMask = (1l << i) | (1l << j);
			x ^= bitMask;

		}

		return x;
	}

	public static void main(String[] args) {
		long x = 40;
		int i = 3;
		int j = 6;
		System.out.println(swapBits(x, i, j));
	}

}
