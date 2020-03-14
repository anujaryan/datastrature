package tree;

/**
 * @author Anuj Pachauri
 *
8:29:39 am
 */
public class FindMode {

	private int currVal;
	private int currCount = 0;
	private int maxCount = 0;
	private int modeCount = 0;

	private int[] modes;

	public int[] findMode(TreeNode root) {

		inorder(root);
		modes = new int[modeCount];
		currCount = 0;
		modeCount = 0;
		inorder(root);
		return modes;
	}

	/**
	 * @param root
	 */
	private void inorder(TreeNode root) {

		if (root == null)
			return;
		inorder(root.left);
		handleValue(root.val);
		inorder(root.right);

	}

	/**
	 * @param val
	 */
	private void handleValue(int val) {
		if (val != currVal) {
			currCount = 0;
			currVal = val;
		}

		currCount++;
		if (currCount > maxCount) {
			maxCount = currCount;
			modeCount = 1;
		} else if (currCount == maxCount) {
			if (modes != null) {
				modes[modeCount] = currVal;
			}
			modeCount++;
		}

	}



	public static void main(String[] args) {

		// System.out.println(FindMode());

	}
}
