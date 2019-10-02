package elementofprogramming.tree;

/**
 * @author Anuj Pachauri
 *
10:09:44 am
 */
public class BinaryTreeTraversal {


	public static void treeTraversal(Node root) {

		if (root != null) {

			// Inorder Process Left subTree then root and then right subtree

			treeTraversal(root.left);
			System.out.println("In Order " + root.val);
			treeTraversal(root.right);

			System.out.println("\n\n ##################################### \n\n");
			// preOrder Process root ,left subtree then right subtree

			System.out.println("Pre Order " + root.val);
			treeTraversal(root.left);
			treeTraversal(root.right);

			System.out.println("\n\n ##################################### \n\n");
			// post order left ,right then root;

			treeTraversal(root.left);
			treeTraversal(root.right);
			System.out.println("Post Order " + root.val);

		}
	}

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		Node root = tree.createBinaryTree();
		treeTraversal(root);

	}
}
