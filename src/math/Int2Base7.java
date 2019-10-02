package math;

/**
 * @author Anuj Pachauri
 *
 *         12:31:18 am
 */
public class Int2Base7 {

	public static String convertToBase7(int num) {

		StringBuffer sb = new StringBuffer();

		int flag = Integer.signum(num);
		num = Math.abs(num);

		while (num != 0) {
			sb.append(num % 7);
			num = num / 7;

		}
		if (flag == -1)
			sb.append("-");
		sb = sb.reverse();

		return sb.toString();
	}

	public static void main(String[] args) {

		int num = 100;
		int num1 = -7;
		System.out.println(convertToBase7(num));
		System.out.println(convertToBase7(num1));
	}

}
