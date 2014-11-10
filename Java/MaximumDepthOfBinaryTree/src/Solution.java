import javax.swing.tree.TreeNode;

/**
 * 
 * @author ThiGod
 *Given a binary tree, find its maximum depth.
 *The maximum depth is the number of nodes along the longest 
 *path from the root node down to the farthest leaf node.
 */

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxDepth(TreeNode root) {
		if(root == null)
			return 0;
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		if(leftDepth >= rightDepth)
			return leftDepth + 1;
		else
			return rightDepth + 1;
	}
	
	public int maxDepthFail(TreeNode root) {
		return root ? 1 + max(maxDepth2(root.left), maxDepth2(root.right)) : 0;
	}
}
