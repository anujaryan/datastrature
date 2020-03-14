package elementofprogramming.tree;

/**
 * @author Anuj Pachauri
 *
 *         9:43:22 am
 */
public class BinaryTree {

	static Node root;

	BinaryTree(int val) {
		root = new Node(val);
	}

	BinaryTree() {
		root = null;
	}

	public Node createBinaryTree() {


		return root;
	}

	public void preTraversal(Node root) {

		if (root != null) {
			// preOrder Process root ,left subtree then right subtree

			System.out.print(root.val + " ");
			preTraversal(root.left);
			preTraversal(root.right);



		}
	}

	public void inTraversal(Node root) {
		// Inorder Process Left subTree then root and then right subtree

		if (root != null) {
			inTraversal(root.left);
			System.out.print(root.val + " ");
			inTraversal(root.right);
		}

	}

	public void postTraversal(Node root) {

		if (root != null) {

			// post order left ,right then root;

			postTraversal(root.left);
			postTraversal(root.right);
			System.out.print(root.val + " ");
		}
	}


	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		BinaryTree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		System.out.println("Pre Order ");
		tree.preTraversal(root);
		System.out.println(" \n In Order traversal");
		tree.inTraversal(root);

		System.out.println("\n Post order traversal");
		tree.postTraversal(root);
	}

}

class Node {
	public int val;
	public Node left, right;

	Node(int val) {
		this.val = val;
		left = right = null;

	}
}