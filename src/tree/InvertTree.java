package tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Anuj Pachauri
 *
 *         9:53:38 pm
 */
public class InvertTree {

	public static TreeNode invertTree(TreeNode root) {

		if (root == null)
			return null;

		TreeNode left = invertTree(root.left);

		TreeNode right = invertTree(root.right);
		root.right = left;
		root.left = right;

		return root;
	}

	public static TreeNode invertTreeUsingIterative(TreeNode root) {

		if (root == null)
			return null;

		Queue<TreeNode> queue = new ArrayDeque<TreeNode>();

		queue.add(root);

		while (!queue.isEmpty()) {

			TreeNode current = queue.poll();
			TreeNode temp = current.left;
			current.left = current.right;
			current.right = temp;
			if (current.left != null) {
				queue.add(current.left);

			}

			if (current.right != null) {
				queue.add(current.right);

			}

		}

		return root;
	}
}
