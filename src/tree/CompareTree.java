package tree;

import java.util.HashSet;

public class CompareTree {
	static HashSet<Integer> hashset = new HashSet<>();

	static boolean isEqual = true;

	public static void main(String[] args) {

		BST tree1 = new BST();
		tree1.addNode(tree1.root, tree1.createNode(10));
		tree1.addNode(tree1.root, tree1.createNode(11));
		tree1.addNode(tree1.root, tree1.createNode(12));
		tree1.addNode(tree1.root, tree1.createNode(13));

		scanTree(tree1.root, true);

		BST tree2 = new BST();
		tree2.addNode(tree2.root, tree2.createNode(10));
		tree2.addNode(tree2.root, tree2.createNode(11));
		tree2.addNode(tree2.root, tree2.createNode(12));
		tree2.addNode(tree2.root, tree2.createNode(14));
		scanTree(tree2.root, false);

		if (tree1.size == tree2.size && isEqual) {
			System.out.println("Tree are equal !");
		} else {
			System.out.println("Tree are not equal");
		}

	}

	public static void scanTree(Node node, boolean isSaved) {

		if (node == null) {
			return;
		}
		// called by tree 1
		if (isSaved) {
			hashset.add(node.getValue());
		} else {
			// callled by tree2
			if (!hashset.contains(node.getValue())) {
				isEqual = false;
				return;
			}
		}
		scanTree(node.getLeft(), isSaved);
		scanTree(node.getRight(), isSaved);

	}
}
