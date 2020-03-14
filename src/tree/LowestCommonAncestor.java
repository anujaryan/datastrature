package tree;

/**
 * @author Anuj Pachauri
 *
 *         10:19:08 pm
 */
public class LowestCommonAncestor {

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		int parentVal = root.val;

		int pVal = p.val;

		int qVal = q.val;

		if (pVal > parentVal && qVal > parentVal) {
			// both p and q are greater than root
			return lowestCommonAncestor(root.right, p, q);
		} else if (pVal < parentVal && qVal < parentVal) {
			// both p and q are greater than root
			return lowestCommonAncestor(root.left, p, q);
		} else {
			return root;
		}

	}

	public static TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {

		TreeNode node = root;

		int pVal = p.val;

		int qVal = q.val;

		while (node != null) {
			int parentVal = node.val;
			if (pVal > parentVal && qVal > parentVal) {
				// both p and q are greater than root
				node = node.right;
			} else if (pVal < parentVal && qVal < parentVal) {
				// both p and q are greater than root
				node = node.left;
			} else {
				return root;
			}

		}
		return null;

	}
}
