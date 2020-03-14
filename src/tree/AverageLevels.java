package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anuj Pachauri
 *
12:13:44 am
 */
public class AverageLevels {

	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> list = new ArrayList<>();
		if (root == null) {
			return list;
		}

		Queue<TreeNode> q = new ArrayDeque<TreeNode>();

		q.offer(root);
		double averagesum = 0;
		while (q.size() > 0) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode cur = q.poll();
				averagesum += cur.val;
				if (cur.left != null) {
					q.add(cur.left);
				}
				if (cur.right != null) {
					q.add(cur.right);
				}

			}
			list.add(averagesum / size);

		}
		return list;
	}

	public static void main(String str[]) {

	}
}
