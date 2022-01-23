package com.sanu.ds.tree;

public class MaxDepthBinaryTree {

    public static void main(String[] args) {

    }

    //runtime O(n)
    public static int findMaxDepthOfBinaryTree(TreeNode head){
        if(head==null)
            return 1;

        return Math.max(findMaxDepthOfBinaryTree(head.left) , findMaxDepthOfBinaryTree(head.right));
    }
}
