package tree;

/**
 * @author Anuj Pachauri
 *
11:37:01 pm
 */
public class PathSum {

	public int pathSum(TreeNode root,int sum) {
		
		
		if(root==null)
			return 0;
		return dfs(root, sum) +

				dfs(root.left, sum) + dfs(root.right, sum);
	}

	/**
	 * @param left
	 * @param sum
	 * @return
	 */
	private int dfs(TreeNode root, int sum) {
		
		if(root==null)
			return 0;
		return (root.val == sum ? 1 : 0) + dfs(root.left, sum - root.val) + dfs(root.right, sum - root.val);

	}

	public static void main(String[] args) {

	}
}
