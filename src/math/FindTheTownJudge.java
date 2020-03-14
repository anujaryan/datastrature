package math;

/**
 * @author Anuj Pachauri
 *
12:01:25 am
 */
public class FindTheTownJudge {

	private static int findJudge(int N, int trust[][]) {


		int sum = N * (N + 1) / 2;
		for (int i = 1; i < N; i++) {

			for (int j = 0; j < trust.length; j++) {

				if (trust[j][0] == i) {
					sum -= i;
					break;
				}
			}

		}

		return sum == 0 ? -1 : sum;

	}

	public static int findJudgeII(int N, int[][] trust) {
		if (trust.length == 0)
			return N == 1 ? 1 : -1;
		int[] trustCount = new int[N + 1];
		for (int[] t : trust) {
			trustCount[t[1]]++;
			trustCount[t[0]]--;
		}
		for (int i = 1; i < trustCount.length; i++) {
			if (trustCount[i] == N - 1)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		int N = 2;
		int[][] trust = { { 1, 2 } };
		// System.out.println(findJudge(N, trust));
		System.out.println(findJudgeII(N, trust));
	}
}
