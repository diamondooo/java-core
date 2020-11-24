package com.dm.leetcode;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }
        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right.left);
        return left+right;
    }

    public static void main(String[] args) {

    }
}

class TreeNode{
    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) {
        this.val = val;
    }
}
