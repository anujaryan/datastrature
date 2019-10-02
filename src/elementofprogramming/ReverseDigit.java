
package elementofprogramming;

/**
 * @author Anuj Pachauri
 *
10:02:14 pm
 */
public class ReverseDigit {

	public static void main(String[] args) {
		int d=24;
		int d1 = -423;

		long l1 = 24;
		long l2 = -423;
		reverseDigit(d);
		reverseDigit(d1);
		System.out.println(optimalReverse(l1));
		System.out.println(optimalReverse(l2));
	}


	/**
	 * @param d optiomal soln time complexity is O(n) where n is number of digit in
	 *          k
	 */
	private static long optimalReverse(long d) {

		long dremaining = 0;
		long adigit = Math.abs(d);
		while (adigit != 0) {

			dremaining = dremaining * 10 + adigit % 10;
			adigit /= 10;
		}
		return d < 0 ? -dremaining : dremaining;

	}

	/**
	 * @param d
	 * 
	 *          naive approach...
	 */
	private static void reverseDigit(int d) {
		String s = String.valueOf(d);
		StringBuilder sb = new StringBuilder();

		if (d < 0) {
			sb.append("-");
			for (int i = s.length() - 1; i > 0; i--) {
				sb.append(s.charAt(i));
			}

		} else {

			for (int i = s.length() - 1; i >= 0; i--) {
				sb.append(s.charAt(i));
			}
		}

		System.out.println(sb.toString());

	}
}
