/**
 * 
 */
package array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author anuj
 *
 */
public class ZeroSumSubArrays {

	public static void main(String[] args) {
		
		int arr[]={4,-6,3,-1,4,2,7};
		
		System.out.println(" Zero sum sub arrays..." +zeroSumSubArray(arr)   );
	}

	public static boolean zeroSumSubArray(int arr[]) {

		Set<Integer> set = new HashSet<>();

		set.add(0);

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (set.contains(sum)) {
				return true;

			}

			set.add(sum);

		}

		return false;

	}
	
}
