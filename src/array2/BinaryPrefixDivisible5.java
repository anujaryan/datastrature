package array2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Anuj Pachauri
 *
 *         3:14:25 pm
 */
public class BinaryPrefixDivisible5 {

	public List<Boolean> prefixesDivBy5(int[] bin) {

		List<Boolean> list = new ArrayList<>();

		for (int i = 0; i < bin.length; i++) {

			if (isDivBy5(0, i, bin)) {
				list.add(true);
			} else {
				list.add(false);
			}

		}

		return list;
	}

	/**
	 * @param i
	 * @param bin
	 * @return
	 */
	private boolean isDivBy5(int start, int end, int[] bin) {
		int dec = 0;
		int pow = 0;
		for (int i = start; i <= end; i++) {
			dec += (int) (bin[i] * Math.pow(2, pow++));
		}
		if (dec % 5 == 0) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		BinaryPrefixDivisible5 bin = new BinaryPrefixDivisible5();
		int num[] = { 0, 1, 1 };
		int nums[] = { 1, 1, 1 };
		Consumer<Boolean> con = x -> System.out.println(x);
		List<Boolean> list = bin.prefixesDivBy5(num);
		// list.stream().forEach(con);

		System.out.println("####################Second test 2#################");
		List<Boolean> list1 = bin.prefixesDivBy5(nums);
		// list1.stream().forEach(con);

		int nums2[] = { 1, 1, 0, 0, 0, 1, 0, 0, 0 };
		bin.isDivBy5(nums2).stream().forEach(con);
	}

	private List<Boolean> isDivBy5(int[] bin) {

		if (bin == null || bin.length == 0) {
			return new ArrayList<>();
		}
		int sum = 0;
		List<Boolean> list = new ArrayList<>();
		for (int i = 0; i < bin.length; i++) {
			sum = sum * 2 + bin[i];

			if (sum % 5 == 0) {
				list.add(true);
			} else {
				list.add(false);
			}

			sum = sum % 5;

		}

		return list;
	}

}
