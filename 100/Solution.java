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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean isEq = true;
        Integer 
            amountNodes1 = p.getClass().getDeclaredFields().length,
            amountNodes2 = q.getClass().getDeclaredFields().length,
            root1 = p.val,
            root2 = q.val,
            left1 = 1,
            right1 = 1,
            left2 = 1,
            right2 = 1;
        

        if (p.left == null) {
            left1 = 0;
        } else {
            left1 = p.left.val;
        }

        if (p.right == null) {
            right1 = 0;
        } else {
            right1 = p.right.val;
        }

        if (q.left == null) {
            left2 = 0;
        } else {
            left2 = q.left.val;
        }

        if (q.right == null) {
            right2 = 0;
        } else {
            right2 = q.right.val;
        }

        if (amountNodes1 != amountNodes2) {
            isEq = false;
        } else if (root1 != root2) {
            isEq = false;
        } else if (!((left1 == left2) && (right1 == right2))) {
            isEq = false;
        }

        return isEq;
    }
}