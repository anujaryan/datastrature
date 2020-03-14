package array2;

/**
 * @author Anuj Pachauri
 *
 *         11:23:04 pm
 */
public class PlaywithChips {

	public static int minCostToMoveChips(int chips[]) {
		int[] cnt = new int[2];

		for (int chip : chips) {
			++cnt[chip % 2];
		}
		return Math.min(cnt[0], cnt[1]);
	}

	public static void main(String[] args) {

		int chips1[] = { 1, 2, 3 };
		int chips2[] = { 2, 2, 2, 3, 3 };
		int chips3[] = { 1, 2, 2, 2, 2 };
		System.out.println(minCostToMoveChips(chips1));

		System.out.println(minCostToMoveChips(chips2));
		System.out.println(minCostToMoveChips(chips3));

	}
}
