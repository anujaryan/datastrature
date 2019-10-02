package math;

/**
 * @author Anuj Pachauri
 *
 *         12:13:45 am
 */
public class AddDigit {

	public static int addDigits(int num) {

		if (num % 10 == num)
			return num;
		int sum = 0;
		while (num != 0) {

			sum = sum + num % 10;
			num /= 10;

		}
		return addDigits(sum);

	}

	public static void main(String[] args) {

		int num = 38;
		int num1 = 123;
		int num2 = 45;
		System.out.println(addDigits(num));
		System.out.println(addDigits(num1));
		System.out.println(addDigits(num2));
	}
}
