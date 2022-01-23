package com.sanu.ds.tree;

public class SymmetricTree {

    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root){
        if(root==null)
            return true;

        return isSymmetric(root.left,root.right);
    }

    private static boolean isSymmetric(TreeNode left, TreeNode right) {

        if(left==null || right==null)
            return left==right;

        if(left.value!=right.value)
            return false;

        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);

    }
}
