package tree;

/**
 * @author Anuj Pachauri
 *
 *         1:09:18 am
 */
public class ConvertSorted2BinaryTree {

	public TreeNode sortedArrayBST(int nums[]) {

		int start = 0;
		int end = nums.length;

		return heightBalanceBst(nums, start, end);

	}

	/**
	 * @param nums
	 * @param start
	 * @param end
	 * @return
	 */
	private TreeNode heightBalanceBst(int[] nums, int start, int end) {

		if (start == end)
			return new TreeNode(nums[start]);

		if (start + 1 == end) {
			TreeNode n1 = new TreeNode(nums[start]);

			TreeNode n2 = new TreeNode(nums[end]);
			n2.left = n1;
			return n2;
		}
		int mid = start + (end - start) / 2;

		TreeNode root = new TreeNode(nums[mid]);

		root.left = heightBalanceBst(nums, start, mid - 1);

		root.right = heightBalanceBst(nums, mid + 1, end);

		return root;
	}
}
