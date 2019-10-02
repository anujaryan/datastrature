package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Anuj Pachauri
 *
 *         12:26:43 am
 */
public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {

		return isMirrorUsingRecursive(root, root);

	}

	/**
	 * @param root
	 * @param root2
	 */
	private boolean isMirrorUsingRecursive(TreeNode root1, TreeNode root2) {

		// if tree is symmetric then it should satisfy three conditions.
		// 1. root of both tree should same
		// 2. left subtree of left tree same as right subtree of right tree
		// 3. right subtree of left tree same as left subtree of right tree
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;

		if (root1.val == root2.val)
			return isMirrorUsingRecursive(root1.left, root2.right) && isMirrorUsingRecursive(root1.right, root2.left);

		return false;

	}

	private boolean isMirrorUsingIterative(TreeNode root1, TreeNode root2) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root1);
		queue.add(root1);

		while (!queue.isEmpty()) {

			TreeNode t1 = queue.poll();

			TreeNode t2 = queue.poll();

			if (t1 == null && t2 == null)
				return true;
			if (t1 == null || t2 == null)
				return false;
			if (t1.val != t2.val)
				return false;
			queue.add(t1.left);
			queue.add(t2.right);
			queue.add(t1.right);
			queue.add(t2.left);

		}

		return true;
	}

	public static void main(String[] args) {

	}
}
