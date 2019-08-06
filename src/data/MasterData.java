/**
29-Jul-2019
Dell

 * 
 */
package data;

import java.util.Arrays;
import java.util.List;

/**
 * @author Dell
 *
 *         10:47:25 pm
 */
public class MasterData {

	public static int[] getSortedArrays() {
		int[] nums = { 5, 8, 9, 20, 67, 90, 134, 567, 890 };
		return nums;

	}

	public static int[] getUnSortedArrays() {
		int[] nums = { 5, 8, 9, 7, 20, 15, 67, 56, 90, 80, 134, 54, 567, 145, 200, 890 };
		return nums;
	}

	public static List<Integer> getIntegerList() {
		Integer[] nums = { 5, 8, 9, 7, 20, 15, 67, 56, 90, 80, 134, 54, 567, 145, 200, 890 };
		return Arrays.asList(nums);
	}
}
