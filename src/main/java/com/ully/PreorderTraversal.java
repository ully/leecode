package com.ully;

import java.util.*;

/**
 * Given a binary tree, return the preorder traversal of its nodes’ values.
 * For example: Given binary tree {1,#,2,3},
 * 1
 * \
 * 2
 * /
 * 3
 * return [1,2,3].
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class PreorderTraversal {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);

        node.right = node1;
        node1.left = node2;

        postOrderTraversal(node);

    }


    public static List<Integer> preorderTraversal(TreeNode root) {
        Queue<TreeNode> stack = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        while (node != null) {
            list.add(node.val);
            if(node.left != null){
                stack.add(node.left);
            }
            if(node.right != null){
                stack.add(node.right);
            }

            if(!stack.isEmpty()){
                node = stack.remove();
            }else{
                node = null;
            }

        }
        return list;

    }



    public static List<Integer> inOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {

            if(node != null) {
                stack.push(node);
                node = node.left;
            }else{

                TreeNode n =stack.pop();
                list.add(n.val);
                if(n.right!=null){
                   node = n.right;
                }

            }
        }
        return list;

    }

    public static List<Integer> postOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        TreeNode node = root;

        TreeNode preNode  = null;

        stack.push(node);
        while(!stack.isEmpty()){
            TreeNode cur = stack.peek();
            if(cur.left == null && cur.right == null || preNode!= null &&(preNode == cur.left || preNode == cur.right)){
                list.add(cur.val);
                stack.pop();
                preNode = cur;
            }else{

                if(cur.right !=null){
                    stack.push(cur.right);
                }

                if(cur.left !=null) {
                    stack.push(cur.left);
                }


            }


        }

        return list;

    }


}



