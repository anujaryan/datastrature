package dynamicProgramming;

public class Knapsack {

	public static void main(String[] args) {

		int set[] = { 1, 5, 6, 9, 10 };
		int basket = 6;
		// 2^5
		// 100000

		for (int i = 0; i < (1 << set.length); i++) {
			// System.out.println(Integer.toBinaryString(i));
			// System.out.println(i);

			String packet = "";
			int sum = 0;

			for (int j = 0; j < set.length; j++) {
				if ((i & (1 << j)) > 0) {
					packet = packet + set[j] + " ";
					sum += set[j];

				}
			}

			if (sum == basket) {
				System.out.println(packet);
			}

		}
	}
}
