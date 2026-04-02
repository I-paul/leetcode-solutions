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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()){
            List<Integer> lvl = new ArrayList<>();
            int s= q.size();
            for(int i=0; i<s; i++){
                TreeNode curr = q.poll();
                if(flag)lvl.add(curr.val);
                else lvl.add(0,curr.val);
                if(curr.left!= null)q.offer(curr.left);
                if(curr.right!= null)q.offer(curr.right);
            }
            res.add(lvl);
            flag=!flag;
        }
        return res;
    }
}