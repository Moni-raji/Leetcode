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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        /*preorder(root,al);
        return al;*/
        Stack<TreeNode> stack=new Stack<>();
        if(root==null) return al;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode a=stack.pop();
            if(a.right!=null) stack.push(a.right);
            if(a.left != null) stack.push(a.left);
            al.add(a.val);
        }
        return al;
    }
    /*public void preorder(TreeNode node,List<Integer> al){
        if(node == null) return;
        al.add(node.val);
        preorder(node.left,al);
        preorder(node.right,al);
    }*/
}