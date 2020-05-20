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
     int cnt, ans;
    public int kthSmallest(TreeNode root, int k) {
        cnt = 0;
        inOrder(root, k);
        return ans;
    }
    
    void inOrder(TreeNode root, int k){
        if(root == null) return;
        inOrder(root.left, k);
        cnt++;
        if(cnt == k){
            ans = root.val;
            return;
        }
        inOrder(root.right, k);
    }

}
