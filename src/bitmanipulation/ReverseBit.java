package bitmanipulation;

/**
 * @author Anuj Pachauri
 *
 *         1:18:32 am
 */
public class ReverseBit {

	public static int reverseBits(int n) {
		int mask = 0, set_mask = 0;
		int ans = 0;

		for (int i = 0; i <= 31; i++) {

			mask = 1 << i;
			set_mask = 1 << (31 - i);
			if ((mask & n) != 0) {
				ans |= set_mask;
			}

		}

		return ans;
	}

	public static void main(String[] args) {
		int n = 43261596;
		System.out.println(reverseBits(n));
	}
}
