/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int cameras;

    public int minCameraCover(TreeNode root) {
        cameras = 0;
        // Add a dummy node as the parent of the root to simplify the logic
        TreeNode dummy = new TreeNode(-1);
        dummy.left = root;
        
        // Perform DFS starting from the dummy node
        dfs(dummy);
        
        return cameras;
    }
    
    private int dfs(TreeNode node) {
        // Base case: if the node is null, return 0 (covered)
        if (node == null) {
            return 0;
        }
        
        int left = dfs(node.left);
        int right = dfs(node.right);
        
        // If either of the child nodes needs a camera, place a camera at this node
        if (left == 0 || right == 0) {
            cameras++;
            return 1; // Node is covered but not monitored
        }
        
        // If both child nodes are covered but not monitored, mark this node as covered
        if (left == 1 || right == 1) {
            return 2; // Node is covered and monitored
        }
        
        // If both child nodes are covered and monitored, mark this node as not covered
        return 0;
    }
}
