package tree;

import java.util.Comparator;

/**
 * @author Anuj Pachauri
 *
 *         10:18:48 pm
 */
public class BstSimulation implements Comparator<Object> {

	Bucket root;

	public static void main(String[] args) {

		BstSimulation bst = new BstSimulation();
		int arr[] = { 10, 3, 5, 7, 15, 20 };
		for (int i = 0; i < arr.length; i++) {
			bst.doInsert(arr[i]);
		}
		System.out.println("PreOrder Traversal...");
		bst.preOrderTraversal();
	}

	public void preOrderTraversal() {

		preOrderTraversal(root);
	}

	/**
	 * @param root2
	 */
	private void preOrderTraversal(Bucket p) {

		if (p == null) {
			return;
		}
		System.out.println(p.val + " ");
		preOrderTraversal(p.left);
		preOrderTraversal(p.right);

	}

	public void doInsert(int val) {

		doInsert(root, val);

	}

	/**
	 * @param root2
	 * @param val
	 */
	private Bucket doInsert(Bucket p, int val) {

		if (p == null) {
			return p = new Bucket(val);
		} else if (compare(p.val, val) > 0) {
			p = doInsert(p.left, val);
		} else if (compare(p.val, val) < 0) {

			p = doInsert(p.right, val);
		}
		return p;
	}

	private class Bucket {
		int val;
		Bucket left;
		Bucket right;

		Bucket(int val) {
			this.val = val;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object o3, Object o4) {

		Integer o1 = (Integer) o3;
		Integer o2 = (Integer) o4;
		if (o1 > o2) {
			return 1;
		} else if (o1 < o2) {
			return -1;
		} else {

			return 0;
		}

	}

}
