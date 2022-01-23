package com.sanu.ds.tree;

import java.util.Stack;

public class FlattenTreeToLinkedList {

    public static void main(String[] args) {

    }


    /**
     *
     * 1. From node store left node and right node in temp vars.
     * 2. Make left node as null.
     * 3. Flatten (Recursively Flatten left and right tree)
     * 4. Attach left part to right side.
     * 5. Traverse till the bottom most part and attach the right to it.
     *
     *
     *
     */

    public void flattenRecursively(TreeNode root){

        if(root==null)
            return;

        TreeNode temp_left = root.left;
        TreeNode temp_right = root.right;

        root.left=null;

        flatten(temp_left);
        flatten(temp_right);

        root.right=temp_left;

        TreeNode current = root;
        while(current.right!=null)current=current.right;

        current.right=temp_right;


    }

    public void flatten(TreeNode root) {

        if(root==null)
            return;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            if(current.right!=null){
                stack.push(current.right);
            }
            if(current.left!=null){
                stack.push(current.left );
            }

            if(!stack.isEmpty()){
                current.right=stack.peek();
            }

            current.left=null;
        }

    }
}
