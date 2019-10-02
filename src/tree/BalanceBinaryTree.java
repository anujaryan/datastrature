package tree;

/**
 * @author Anuj Pachauri
 *
 *         9:50:48 pm
 */
public class BalanceBinaryTree {

	public boolean isBalanced(TreeNode root) {

		return dfsHeight(root) != -2;
	}

	/**
	 * @param root
	 * @return
	 */
	private int dfsHeight(TreeNode root) {
		if (root == null)
			return -1;

		int lh = dfsHeight(root.left);
		int rh = dfsHeight(root.right);

		if (lh == -2 || rh == -2 || Math.abs(lh - rh) > 1) {
			return -2;
		}

		return Math.max(lh, rh) + 1;

	}

}
