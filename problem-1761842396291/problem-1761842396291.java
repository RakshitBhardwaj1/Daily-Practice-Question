// Last updated: 10/30/2025, 10:09:56 PM
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
    public int kthLargestPerfectSubtree(TreeNode root, int k) {
        List<Integer> sizes = new ArrayList<>();
        dfs(root, sizes);
        
        if (sizes.size() < k) return -1;
        
        // Sort in descending order
        sizes.sort(Collections.reverseOrder());
        return sizes.get(k - 1);
    }

    private int dfs(TreeNode node, List<Integer> sizes) {
        if (node == null) return 0; // Empty tree considered perfect of size 0
        
        int left = dfs(node.left, sizes);
        int right = dfs(node.right, sizes);
        
        if (left >= 0 && right >= 0 && left == right) {
            int currSize = left + right + 1;
            sizes.add(currSize);
            return currSize;
        }
        return -1; // Not a perfect subtree
    }
}