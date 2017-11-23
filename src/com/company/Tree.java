package com.company;

public class Tree {
    public final TreeNode root;

    public Tree(int val) {
        this.root = new TreeNode(val);
    }

    public TreeNode dfs(TreeNode node, int target) {
        System.out.println(node.val);
        node.visited = true;

        if(node.val == target)
            return node;

        TreeNode[] nodes = {node.right, node.parent, node.left};

        for(TreeNode temp: nodes) {
            if(temp != null && !temp.visited) {
                TreeNode res = dfs(temp, target);
                if(res!= null)
                    return res;
            }
        }
        return null;
    }

    public void preorder(TreeNode root) {
        if(root == null) {
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
