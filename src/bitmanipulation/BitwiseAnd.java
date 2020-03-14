package bitmanipulation;

/**
 * @author Anuj Pachauri
 *
 *         1:25:17 am
 */
public class BitwiseAnd {

	public static int bitWiseAnd(int m, int n) {
		int ans = n;
		while (ans > m) {
			ans = ans & (ans - 1);
		}

		return ans;
	}

	public static void main(String[] args) {
		int m = 5, n = 7;
		System.out.println(bitWiseAnd(m, n));
	}
}
