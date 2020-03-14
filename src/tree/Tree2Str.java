package tree;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author Anuj Pachauri
 *
12:37:18 am
 */
public class Tree2Str {

	public String tree2str(TreeNode root) {

		if (root == null) {
			return "";

		}
		
		Stack<TreeNode> stack = new Stack<>();
		
		
		stack.push(root);

		Set<TreeNode> visitor = new HashSet<>();

		StringBuilder sb = new StringBuilder();

		while (!stack.isEmpty()) {

			root = stack.peek();

			if (visitor.contains(root)) {
				stack.pop();
				sb.append(")");
			} else {

				visitor.add(root);
				sb.append("(" + root.val);

				if (root.left == null && root.right != null) {
					sb.append("()");
				}

				if (root.right != null) {
					stack.add(root.right);
				}
				if (root.left != null) {
					stack.add(root.left);
				}

			}

		}

		return sb.substring(1, sb.length() - 1);
	}

	public String tree2Str(TreeNode root) {

		if (root == null)
			return "";

		if (root.left == null && root.right == null) {
			return root.val + "";
		}
		if (root.right == null) {
			return root.val + "(" + tree2Str(root.left) + ")";
		}

		return root.val + "(" + tree2Str(root.left) + ")(" + tree2Str(root.right) + ")";
	}

}
