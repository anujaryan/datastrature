package array2;

/**
 * @author Anuj Pachauri
 *
 *         6:44:06 pm
 */
public class JewelStones {

	public static int numJewelInStone(String J, String S) {
		if (J.length() == 0 || S.length() == 0) {
			return 0;
		}

		int count = 0;
		for (char j : S.toCharArray()) {
			if (J.indexOf(j) != -1) {
				count++;
			}

		}

		return count;
	}

	public static void main(String[] args) {

		String J = "aA", S = "aAAbbbb";
		String J1 = "z", S1 = "ZZ";
		System.out.println("Number of Jewels .. " + numJewelInStone(J, S));
		System.out.println("Number of Jewels .. " + numJewelInStone(J1, S1));
	}
}
