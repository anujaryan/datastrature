/**
04-May-2019
anuj

 * 
 */
package crackingcodeInterviewSolution;

/**
 * @author anuj
 *
 *         3:24:32 PM
 */
public class BstDemoTest {

	Bucket root;

	BstDemoTest() {
		root = null;
	}

	public static void main(String[] args) {
		BstDemoTest bt = new BstDemoTest();
		bt.addBucket(bt.root, bt.createNewBucket(10));
		bt.addBucket(bt.root, bt.createNewBucket(13));
		bt.addBucket(bt.root, bt.createNewBucket(17));
		bt.addBucket(bt.root, bt.createNewBucket(8));
		bt.addBucket(bt.root, bt.createNewBucket(6));
		bt.addBucket(bt.root, bt.createNewBucket(4));

		bt.search(8, bt.root);
		bt.search(81, bt.root);
		System.out.println("################Inorder traversal###################");
		bt.inorderTraversal(bt.root);

		System.out.println(" \n #################Pre-Order Traversal ###################");
		bt.preOrderTraversal(bt.root);
		System.out.println(" \n #################Post-Order Traversal ###################");
		bt.postOrderTraversal(bt.root);

		System.out.println(" \n Is there Binary tree is Balance..." + bt.isBalance(bt.root));

	}

	public boolean isBalance(Bucket root) {

		return (maxDepth(root) - minDepth(root) <= 1);

	}

	private int minDepth(Bucket root) {

		if (root == null)
			return 0;
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));

	}

	private int maxDepth(Bucket root) {
		if (root == null)
			return 0;
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

	}

	public void inorderTraversal(Bucket start) {

		if (start == null)
			return;
		inorderTraversal(start.left);
		System.out.print(start.value + "  ");
		inorderTraversal(start.right);

	}

	public void preOrderTraversal(Bucket start) {
		if (start == null)
			return;
		System.out.print(start.value + " ");
		preOrderTraversal(start.left);
		preOrderTraversal(start.right);

	}

	public void postOrderTraversal(Bucket start) {
		if (start == null)
			return;
		postOrderTraversal(start.left);
		postOrderTraversal(start.right);
		System.out.print(start.value + " ");
	}

	public Bucket createNewBucket(int value) {
		return new Bucket(value, null, null);

	}

	public void addBucket(Bucket start, Bucket newBucket) {

		if (root == null) {
			root = newBucket;
			return;
		}

		if (newBucket.value > start.value) {

			if (start.right == null) {
				start.right = newBucket;
			}
			addBucket(start.right, newBucket);

		}

		if (newBucket.value < start.value) {

			if (start.left == null) {
				start.left = newBucket;
			}
			addBucket(start.left, newBucket);

		}

	}

	public void search(int value, Bucket startbucket) {

		if (startbucket == null) {
			System.out.println("Element not found in BST..");
			return;
		}

		if (value == startbucket.value) {
			System.out.println("Element Found here...");
			return;
		}

		if (value > startbucket.value) {
			search(value, startbucket.right);
		}

		if (value < startbucket.value) {
			search(value, startbucket.left);
		}
	}

}

class Bucket {

	int value;
	Bucket right;
	Bucket left;

	public Bucket(int value, Bucket left, Bucket right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

}