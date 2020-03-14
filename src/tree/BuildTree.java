package tree;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anuj Pachauri
 *
 *         8:54:18 pm
 */
public class BuildTree {

	public TreeNode buildTree(int[] inorder, int[] preorder) {

		Map<Integer, Integer> inMap = new HashMap<>();

		for (int i = 0; i < inorder.length; i++) {

			inMap.put(inorder[i], i);
		}

		TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, inMap);
		;
		return root;

	}

	/**
	 * @param preorder
	 * @param i
	 * @param j
	 * @param inorder
	 * @param k
	 * @param l
	 * @param inMap
	 * @return
	 */
	private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
			Map<Integer, Integer> inMap) {

		if (preStart > preEnd || inStart > inEnd)
			return null;

		TreeNode root = new TreeNode(preorder[preStart]);

		int inRoot = inMap.get(root.val);
		int numsLeft = inRoot - inStart;

		root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, inMap);
		root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);
		return root;
	}

}
