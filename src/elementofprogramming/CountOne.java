package elementofprogramming;

/**
 * @author Anuj Pachauri Since we perform 0(1) computation per bit, the time
 *         complexity is 0(n), 3:30:51 pm
 */
public class CountOne {

	public static int count1Bit(int num) {

		int count = 0;
		for (int i = 0; i < 32; i++) {
			if (((num >> i) & 1) == 1) {
				count++;
			}
		}

		return count;

	}

	public static int count1BitII(int num) {

		int count = 0;
		while (num != 0) {
			count += (num & 1);
			num >>>= 1;
		}

		return count;

	}


	public static void main(String[] args) {
		int num = 15;
		System.out.println(count1Bit(num));
		System.out.println(count1BitII(num));
		// System.out.println(Double.valueOf("l.23"));
		System.out.println(Boolean.valueOf("true"));
		double x = 2.3009;
		System.out.println(Double.compare(x, 2.3));
		
		char[] C = new char[] { 'a', 'b' };

		System.out.println('c' - 0);
	}
}
