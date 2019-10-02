package tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
3:22:21 pm
 */
public class TreeCousins {

	// Time Complexity: O(N)O(N), where NN is the number of nodes in the tree.

	// Space Complexity: O(N)O(N).
	Map<Integer, Integer> depth;
	Map<Integer, TreeNode> parent;

	public boolean isCousins(TreeNode root, int x, int y) {
		
		depth = new HashMap<Integer, Integer>();
		parent = new HashMap<>();
		
		dfs(root, null);
		return (depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y));


	}

	/**
	 * @param root
	 * @param object
	 */
	private void dfs(TreeNode root, TreeNode par) {

		if (root != null) {
			depth.put(root.val, par != null ? 1 + depth.get(par.val) : 0);
			parent.put(root.val, par);

			dfs(root.left, root);
			dfs(root.right, par);

		}

	}

	public static void main(String[] args) {

	}
}
