package elementofprogramming.tree;

/**
 * @author Anuj Pachauri
 *
7:12:27 pm
 */
public class SumOfRootToLeaf {

	public static int sumRootToLeaf(BinaryNode root) {

		return sumRootToLeaf(root, 0);
	}

	/**
	 * @param root
	 * @param i
	 * @return
	 */

	// Time complexity is o(Lh) where L is number of root-to- leaf paths
	private static int sumRootToLeaf(BinaryNode root, int partialPathSum) {

		if (root == null)
			return 0;

		partialPathSum = partialPathSum * 2 + root.data;

		if (root.left == null && root.right == null) {
			return partialPathSum;
		}

		return sumRootToLeaf(root.left, partialPathSum) + sumRootToLeaf(root.right, partialPathSum);

	}

	public static void main(String[] args) {

		BinaryNode root = BinaryNode.createNode(1);

	}

}
