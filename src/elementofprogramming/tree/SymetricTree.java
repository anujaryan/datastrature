package elementofprogramming.tree;

/**
 * @author Anuj Pachauri
 *
3:31:41 pm
 */
public class SymetricTree {

	// time complexity is o(n) and space complexity o(h) where is n is number of
	// node in tree and h is height of tree
	public boolean isSymetricTree(BinaryNode root) {

		return root == null || checkSymertic(root.left, root.right);
	}

	/**
	 * @param root
	 */
	private boolean checkSymertic(BinaryNode left, BinaryNode right) {

		if(left==null && right==null) {
			
			return true;
		}
		else if (left != null && right != null) {
			return left.data == right.data && checkSymertic(left.left, right.right)
					&& checkSymertic(left.right, right.left);
		} else {
			return false;
		}
		
		
	}

	public static void main(String[] args) {

		BinaryNode root = BinaryNode.createNode(1);
		root.left = BinaryNode.createNode(2);
		root.right = BinaryNode.createNode(2);
		root.left.left = BinaryNode.createNode(3);
		root.left.right = BinaryNode.createNode(4);
		root.right.left = BinaryNode.createNode(3);
		root.right.right = BinaryNode.createNode(4);
		System.out.println(new SymetricTree().isSymetricTree(root));

	}

}
