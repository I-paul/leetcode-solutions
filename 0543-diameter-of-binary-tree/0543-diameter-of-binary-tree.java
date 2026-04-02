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
    int d=0;
    int FH(TreeNode root){
        if(root==null)return 0;
        int LH = FH(root.left);
        int RH = FH(root.right);
        d=Math.max(d,LH+RH);
        return 1+Math.max(LH,RH);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        FH(root);
        return d;
    }
}