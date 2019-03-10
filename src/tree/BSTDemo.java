package tree;

public class BSTDemo {

	public static void main(String[] args) {

		BST bst = new BST();

		bst.addNode(bst.root, bst.createNode(10));
		bst.addNode(bst.root, bst.createNode(12));
		bst.addNode(bst.root, bst.createNode(11));
		bst.addNode(bst.root, bst.createNode(13));
		bst.addNode(bst.root, bst.createNode(6));

		bst.searchNode(bst.root, 11);
		bst.searchNode(bst.root, 115);

	}
}
