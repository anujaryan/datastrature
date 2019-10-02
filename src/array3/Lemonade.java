package array3;

/**
 * @author Anuj Pachauri
 *
6:49:34 pm
 */
public class Lemonade {

	public static boolean lemonadeChange(int[] bills) {

		int five = 0;
		int tens = 0;
		for (int bill : bills) {

			if (bill == 5) {
				five++;
			} else if (bill == 10) {

				if (five == 0) {
					return false;
				}

				five--;
				tens++;
			} else {

				if (tens == 0) {
					if (five < 3) {
						return false;
					} else {
						five -= 3;

					}
				} else {
					if (five == 0)
						return false;
					tens--;
					five--;
				}

			}
		}

		return true;
	}

	public static void main(String[] args) {

		int[] bills = { 5, 5, 5, 10, 20 };
		System.out.println(lemonadeChange(bills));

	}
}
