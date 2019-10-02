package elementofprogramming.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anuj Pachauri
 *
8:13:18 pm
 */
public class PathSumII {

	public List<List<Integer>> pathSum(BinaryNode root, int sum) {

		List<List<Integer>> res = new ArrayList<>();
		List<Integer> path = new ArrayList<>();

		pathSum(root, sum, res, path);
		return res;
	}

	/**
	 * @param root
	 * @param sum
	 * @param res
	 * @param path
	 */
	private void pathSum(BinaryNode root, int sum, List<List<Integer>> res, List<Integer> path) {

		if (root == null)
			return;

		path.add(root.data);

		if (root.left == null && root.right == null) {
			if (sum == root.data) {
				res.add(new ArrayList<>(path));
				return;
			}
		}

		if (root.left != null) {
			pathSum(root.left, sum - root.data, res, path);
			path.remove(path.size() - 1);
		}
		if (root.right != null) {
			pathSum(root.right, sum - root.data, res, path);
			path.remove(path.size() - 1);
		}


	}


}
