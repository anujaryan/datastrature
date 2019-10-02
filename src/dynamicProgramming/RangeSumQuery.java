/**
31-Aug-2019
Anuj Pachauri

 * 
 */
package dynamicProgramming;

/**
 * @author Anuj Pachauri
 *
 *         6:34:20 pm
 */
public class RangeSumQuery {

	private int nums[];

	RangeSumQuery(int nums[]) {
		this.nums = nums;
	}

	public int sumRange(int i, int j) {

		int sum = 0;

		for (int k = i; k <= j; k++) {
			sum += nums[k];
		}
		return sum;
	}

	public static void main(String[] args) {
		int nums[] = { -2, 0, 3, -5, 2, -1 };

		RangeSumQuery obj = new RangeSumQuery(nums);

//		sumRange(0, 2) -> 1
//		sumRange(2, 5) -> -1
//		sumRange(0, 5) -> -3

		System.out.println("Range Sum is  : " + obj.sumRange(0, 2));
		System.out.println("Range Sum is  : " + obj.sumRange(2, 5));
		System.out.println("Range Sum is  : " + obj.sumRange(0, 5));

	}

}
