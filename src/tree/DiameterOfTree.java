package tree;

/**
 * @author Anuj Pachauri
 *
 *         11:22:16 pm
 */
public class DiameterOfTree {

	public int diameterOfBinaryTree(TreeNode root) {

		int ans[] = new int[1];
		ans[0] = root2Any(root, ans);
		return ans[0];

	}

	/**
	 * @param root
	 * @param ans
	 */
	private int root2Any(TreeNode root, int[] ans) {

		if (root == null) {
			return -1;
		}

		int l = root2Any(root.left, ans);
		int r = root2Any(root.right, ans);
		ans[0] = Math.max(ans[0], l + r + 2);
		return Math.max(l, r) + 1;

	}

}
