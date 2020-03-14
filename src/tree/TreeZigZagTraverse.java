package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author Anuj Pachauri
 *
 *         5:39:16 pm
 */
public class TreeZigZagTraverse {

	TreeNode root;

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		if (root == null)
			return res;

		bfs(root, res);
		return res;

	}

	/**
	 * @param root
	 * @param res
	 */
	private void bfs(TreeNode root, List<List<Integer>> res) {

		int level = 0;
		Queue<TreeNode> q = new ArrayDeque<>();

		q.offer(root);

		while (!q.isEmpty()) {

			int size = q.size();

			List<Integer> list = new ArrayList<>();
			while (size-- > 0) {

				TreeNode node = q.poll();
				if (level % 2 == 0) {
					list.add(node.val);
				} else {
					list.add(0, node.val);
				}

				if (node.left != null)
					q.offer(node.left);
				if (node.right != null)
					q.offer(node.right);
			}
			level++;
			res.add(list);

		}

	}

	private void doInsert(TreeNode p, int val) {

		if (p == null) {
			new TreeNode(val);
		} else if (p.val > val) {
			doInsert(p.left, val);
		} else if (p.val > val) {
			doInsert(p.right, val);

		}

	}

	public void bfs1(TreeNode root, List<List<Integer>> res) {

		int level = 0;
		Queue<TreeNode> q = new ArrayDeque<>();

		q.offer(root);

		while (!q.isEmpty()) {

			int size = q.size();
			List<Integer> list = new ArrayList<>();
			while (size-- > 0) {

				TreeNode node = q.poll();

				if (level % 2 == 0) {
					list.add(node.val);
				} else {
					list.add(node.val);
				}

				if (node.left != null) {
					q.offer(node.left);
				}
				if (node.right != null) {
					q.offer(node.right);
				}

			}
			level++;
			res.add(list);

		}

	}

	public static void main(String[] args) {
		TreeZigZagTraverse bst = new TreeZigZagTraverse();
		int arr[] = { 10, 3, 5, 7, 15, 20 };
		for (int i = 0; i < arr.length; i++) {
			bst.doInsert(bst.root, arr[i]);
		}

		bst.zigzagLevelOrder(bst.root).stream().forEach(x -> System.out.println(x.toString()));

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}

}