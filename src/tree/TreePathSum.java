package tree;

/**
 * @author Anuj Pachauri
 *
 *         1:27:35 am
 */
public class TreePathSum {

	public boolean pathSum(TreeNode root, int sum) {

		if (root == null)
			return false;

		return checkPath(root, root.val, sum);
	}

	/**
	 * @param root
	 * @param val
	 * @param sum
	 * @return
	 */
	private boolean checkPath(TreeNode root, int count, int sum) {

		if (root.right == null && root.left == null)
			return count == sum;

		boolean resLeft = false, resRight = false;

		if (root.left != null)
			resLeft = checkPath(root.left, count + root.left.val, sum);
		if (root.right != null)
			resRight = checkPath(root.right, count + root.right.val, sum);

		return (resLeft || resRight);

	}
}
