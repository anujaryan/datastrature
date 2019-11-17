package array;

/**
 * @author Anuj Pachauri
 *
 *         1:57:32 am
 */
public class CanPlaceFlowers {

	public static boolean canPlaceFlower(int nums[], int n) {

		int countzero = 0;
		for (int i : nums) {
			if (i == 0)
				countzero++;
		}

		if (countzero >= 2 * n) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		int[] flowerbed = { 1, 0, 0, 0, 1 };
		int n = 2;
		System.out.println("Flowers can place : " + canPlaceFlower(flowerbed, n));
	}
}
