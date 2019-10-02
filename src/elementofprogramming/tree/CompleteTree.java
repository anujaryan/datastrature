package elementofprogramming.tree;

/**
 * @author Anuj Pachauri
 *
11:33:21 am
 */
public class CompleteTree {

	static class node {
		int data;
		node left, right;

		node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

	}

	static node newNode(int data) {
		node node = new node(data);
		return node;
	}

	static class returnType {

		// to store if sub-tree is perfect or not
		boolean isPerfect;
		// to store if subt-tree is complete or not
		boolean isComplete;

		// size of the tree

		int size;

		// Root of biggest complete sub-tree

		node rootTree;

	}

// helper function that returns height  
	// of the tree given size
	static int getHeight(int size) {
		return (int) Math.ceil(Math.log(size + 1) / Math.log(2));
	}

	// Function to return the biggest complete binary sub-tree

	static returnType finCompleteBinaryTree(node root) {

		// Declaring return the biggest
		// complete binary sub-tree

		returnType rt = new returnType();

		if (root == null) {
			rt.isComplete = true;
			rt.isPerfect = true;
			rt.size = 0;
			rt.rootTree = null;
			return rt;
		}

		returnType lv=finCompleteBinaryTree(root.left);
		returnType rv=finCompleteBinaryTree(root.right);
		
		
		// CASE -A
		
		
		if (lv.isPerfect && rv.isComplete && getHeight(lv.size) == getHeight(rv.size)) {

			rt.isComplete = true;
			rt.isPerfect = (rv.isPerfect ? true : false);

			rt.size = lv.size + rv.size + 1;
			rt.rootTree = root;
			return rt;

		}
		
		// CASE -B

		// if left sub-tree is complete and right is perfect and the ehgithof left is
		// greater
		// than right by one then sub-tree sub-tre root
		// is compete binary sub-tree withs ize equal to

		if (lv.isComplete && rv.isPerfect && getHeight(lv.size) == getHeight(rv.size) + 1) {

			rt.isComplete = true;
			rt.isPerfect = false;

			rt.size = lv.size + rv.size + 1;
			rt.rootTree = root;
			return rt;

		}

		// Case -c
		// Else this sub -tree can not be complete binary tree
		// and simply return the biggest sized complete sub-tree
		// found till now in the left or right sub-tree

		rt.isComplete = false;
		rt.isPerfect = false;

		rt.size = Math.max(lv.size, rv.size);

		rt.rootTree = (lv.size > rv.size ? lv.rootTree : rv.rootTree);

		return rt;

	}

	// Function to print the inOrder traversal of the tree

	static void inOrderPrint(node root) {
		if (root != null) {
			inOrderPrint(root.left);
			System.out.print(root.data + " ");
			inOrderPrint(root.right);
		}
	}

	public static void main(String[] args) {

		// Create the tree

		node root = newNode(50);
		root.left = newNode(30);
		root.right = newNode(60);
		root.left.left = newNode(5);
		root.left.right = newNode(20);
		root.right.left = newNode(45);
		root.right.right = newNode(70);
		root.right.left.left = newNode(10);

		// Get the biggest sized complete binary sub-tree

		returnType ans = finCompleteBinaryTree(root);

		System.out.println("Size :" + ans.size);
		// Print the inOrder traversal of the found sub-tree

		System.out.println("InOrder traversal :");
		inOrderPrint(ans.rootTree);
	}
}
