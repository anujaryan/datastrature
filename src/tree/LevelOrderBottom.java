package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anuj Pachauri
 *
 *         12:43:41 am
 */
public class LevelOrderBottom {

	public List<List<Integer>> levelOrderbBottom(TreeNode root) {

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();

		queue.add(root);

		while (!queue.isEmpty()) {

			List<Integer> tlist = new LinkedList<>();
			int size = queue.size();
			while (size-- > 0) {
				TreeNode node = queue.poll();
				tlist.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}

			}
			list.addFirst(tlist);
		}

		return list;

	}
}
