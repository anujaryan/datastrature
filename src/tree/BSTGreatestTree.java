package tree;

import java.util.Stack;

/**
 * @author Anuj Pachauri
 *
11:13:38 am
 */
public class BSTGreatestTree {

	// time complexity O(n) and space complexity O(n)
	public static TreeNode convertBST(TreeNode root) {

		int sum = 0;
		if (root != null) {

			convertBST(root.right);
			sum += root.val;
			root.val = sum;
			convertBST(root.left);

		}
		return root;
		


	}
	// time complexity O(n) and space complexity O(n)

	public static TreeNode convertBST_stack(TreeNode root) {

		int sum = 0;

		TreeNode node = root;

		Stack<TreeNode> stack = new Stack<>();

		while (!stack.isEmpty() || node != null) {

			while (node != null) {
				stack.push(node);
				node = node.right;
			}

			node = stack.pop();
			sum += node.val;
			node.val = sum;

			node = node.left;
		}
		return root;

	}

	public static void main(String[] args) {

	}
}
