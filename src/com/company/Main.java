package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree tree = new Tree(5); //root


        TreeNode node4 = TreeNode.createLeftChild(tree.root, 4);
        TreeNode node1 = TreeNode.createRightChild(tree.root, 1);


        TreeNode node8 = TreeNode.createLeftChild(node1, 8);
        TreeNode node11 = TreeNode.createLeftChild(node8, 11);
        TreeNode node5 = TreeNode.createRightChild(node8, 5);
        TreeNode node4_2 = TreeNode.createLeftChild(node11, 4);
        TreeNode node5_2 = TreeNode.createRightChild(node11, 5);

        TreeNode node7 = TreeNode.createLeftChild(node4, 7);
        TreeNode node3 = TreeNode.createRightChild(node4, 3);

        TreeNode node8_2 = TreeNode.createLeftChild(node7, 8);
        TreeNode node1_2 = TreeNode.createRightChild(node7, 1);

        TreeNode node9 = TreeNode.createRightChild(node3, 9);
        TreeNode node2 = TreeNode.createLeftChild(node9, 2);
        TreeNode node12 = TreeNode.createRightChild(node2, 12);

       //tree.preorder(tree.root);

        TreeNode n = tree.dfs(node11, 12);





    }
}
