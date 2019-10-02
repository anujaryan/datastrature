/**
28-Aug-2019
Anuj Pachauri

 * 
 */
package array;

/**
 * @author Anuj Pachauri
 *
 *         9:56:55 pm
 */
public class OneBitTwoBitCharacters {

	public static boolean isOneBitCharacter(int bits[]) {

		int len = bits.length;
		boolean flag = false;
		if (len == 0) {
			return flag;
		}

		int i = 0;
		do {
			if (i == len - 1)
				return true;
			if (bits[i] == 0)
				i++;
			else
				i += 2;

		} while (i <= len - 1);

		return flag;
	}

	public static void main(String[] args) {

		int bits[] = { 1, 1, 1, 0 };

		int bits1[] = { 1, 1, 0, 0 };

		int bits2[] = { 1 };

		int bits3[] = { 1, 0 };

		int bits4[] = { 0 };
		int bits5[] = {};

		int bits6[] = { 1, 1, 0 };
		int bits7[] = { 0, 1, 0 };

		System.out.println("One Character : " + isOneBitCharacter(bits));

		System.out.println("One Character : " + isOneBitCharacter(bits1));

		System.out.println("One Character : " + isOneBitCharacter(bits2));

		System.out.println("One Character : " + isOneBitCharacter(bits3));

		System.out.println("One Character : " + isOneBitCharacter(bits4));

		System.out.println("One Character : " + isOneBitCharacter(bits5));

		System.out.println("One Character : " + isOneBitCharacter(bits6));

		System.out.println("One Character : " + isOneBitCharacter(bits7));
	}
}
