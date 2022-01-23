package com.sanu.ds.tree;

public class BasicOperations {

    static TreeNode root;
    public static void main(String[] args) {

        BasicOperations operations = new BasicOperations();
        operations.add(4);
        operations.add(1);
        operations.add(1);
        operations.add(6);
        operations.traverseInOrder(root);

        System.out.println(operations.containsNode(1));
        operations.delete(1);
        System.out.println(operations.containsNode(1));


    }

    public boolean containsNode(int value) {
        return findAnElement(root, value);
    }


    public void add(int value) {
        root = addNodeRecursively(root, value);
    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    public static TreeNode addNodeRecursively(TreeNode current,int value){
        if(current==null){
            return new TreeNode(value);
        }

        if(value<current.value){
            current.left=addNodeRecursively(current.left,value);

        } else if (value>current.value){
            current.right=addNodeRecursively(current.right,value);
        }
        else {
            // value already exists
            return current;
        }

        return current;
    }

    public static boolean findAnElement(TreeNode current,int value){
        if(current==null)
            return false;

        if(current.value==value)
            return true;

        if(current.value<value){
           return findAnElement(current.right,value);
        }
          return findAnElement(current.left,value);
    }

    public static TreeNode deleteNode(TreeNode current,int value){
        if(current==null)
            return null;

        if(current.value==value) {
            if(current.left==null && current.right==null){
                return null;
            }
            if(current.left==null){
                return current.right;
            }
            if(current.right==null){
                return current.left;
            }
            int smallestValue = findSmallestValue(current.right);
            current.value=smallestValue;
            current.right=deleteNode(current.right,smallestValue);
            return current;
        }
        if(value>current.value){
            current.right=deleteNode(current.right,value);
            return current;
        }
        current.left=deleteNode(current.left,value);
        return current;



    }

    public void traverseInOrder(TreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    public void traversePreOrder(TreeNode node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(TreeNode node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    private static int findSmallestValue(TreeNode root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }
}
