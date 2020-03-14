package tree;

/**
 * @author Anuj Pachauri
 *
 *         10:49:34 pm
 */
public class LowestCommonAncestorII {

	private TreeNode ans;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		recurseTree(root, p, q);
		return this.ans;
	}

	/**
	 * @param root
	 * @param p
	 * @param q
	 * @return
	 */
	private boolean recurseTree(TreeNode root, TreeNode p, TreeNode q) {

		if (root == null)
			return false;

		// left recursion. if left recursion returns true,set left =1 else 0
		int left = this.recurseTree(root.left, p, q) ? 1 : 0;

		// right recursion. if right recursion returns true,set left =1 else 0
		int right = this.recurseTree(root.right, p, q) ? 1 : 0;

		// if current node is one of p and q

		int mid = (root == p || root == q) ? 1 : 0;

		// if any two of the flags left,right or mid become true

		if (mid + left + right >= 2) {
			this.ans = root;
		}

		return (mid + left + right > 0);
	}
}
