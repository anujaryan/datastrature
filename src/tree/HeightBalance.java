package tree;

/**
 * @author Anuj Pachauri
 *
10:09:07 am
 */
public class HeightBalance {

	public boolean balance;
	public int height;

	public HeightBalance(boolean balance, int height) {
		this.balance = balance;
		this.height = height;
	}

	public static boolean isBalance(Node root) {
		return checkBalance(root).balance;
	}

	/**
	 * @param root
	 * @return
	 */
	private static HeightBalance checkBalance(Node root) {

		if (root == null) {
			return new HeightBalance(true, -1); // base case
		}

		HeightBalance leftResult = checkBalance(root.left);
		if (!leftResult.balance) {
			return leftResult;
		}

		HeightBalance rightResult = checkBalance(root.right);
		if (!rightResult.balance) {
			return rightResult; // Right subtree is not balance..
		}
		boolean isBalance = Math.abs(leftResult.height - rightResult.height) <= 1;
		int height = Math.max(leftResult.height, rightResult.height) + 1;
		return new HeightBalance(isBalance, height);

	}

}
