package tree;

/**
 * @author Anuj Pachauri
 *
1:25:37 am
 */
public class TreeTilt {

	int tilt = 0;
	public int findTilt(TreeNode root) {

		if (root == null)
			return 0;

		getTilt(root);
		return tilt;

	}

	/**
	 * @param root
	 */
	private int getTilt(TreeNode root) {
		
		if (root == null)
			return 0;
		
		int left = getTilt(root.left);

		int right = getTilt(root.right);
		tilt += Math.abs(left - right);
		return left + right + root.val;
		
		
		
		

	}
}
