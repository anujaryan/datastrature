package tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Anuj Pachauri
 *
 *         9:41:55 pm
 */
public class MinimumDepthOfTree {

	public int minDepth(TreeNode root) {

		if (root == null)
			return 0;

		int depth = bfs(root);
		return depth;

	}

	private int bfs(TreeNode root) {
		int depth = 0;
		Queue<TreeNode> q = new ArrayDeque<>();
		q.offer(root);
		while (!q.isEmpty()) {
			depth++;
			int size = q.size();
			while (size-- > 0) {
				TreeNode node = q.poll();
				if (node.left != null)
					q.offer(node.left);
				if (node.right != null)
					q.offer(node.right);
			}
		}
		return depth;
	}

	public static void main(String[] args) {

	}
}
