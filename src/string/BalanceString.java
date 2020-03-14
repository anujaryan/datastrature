package string;

/**
 * @author Anuj Pachauri
 *
12:44:56 am
 */
public class BalanceString {

	public static int balanceStringSplit(String s) {

		char[] chr = s.toCharArray();

		int balance = 0;
		int num = 0;

		for (int i = 0; i < chr.length; i++) {

			if ('L' == chr[i])
				balance++;
			else
				balance--;
			if (balance == 0)
				num++;
		}

		return num;
	}

	public static void main(String[] args) {

		String s = "RLRRLLRLRL";
		System.out.println(balanceStringSplit(s));
	}
}
