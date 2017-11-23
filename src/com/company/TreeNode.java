package com.company;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode parent;
    boolean visited;

    public TreeNode(int val) {
        this.val = val;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public static TreeNode createLeftChild(TreeNode temp, int val) {
        if(temp != null) {
            TreeNode node = new TreeNode(val);
            temp.setLeft(node);
            node.setParent(temp);
            return node;
        }
        return null;
    }

    public static TreeNode createRightChild(TreeNode temp, int val) {
        if(temp != null) {
            TreeNode node = new TreeNode(val);
            temp.setRight(node);
            node.setParent(temp);
            return node;
        }
        return null;
    }

}
