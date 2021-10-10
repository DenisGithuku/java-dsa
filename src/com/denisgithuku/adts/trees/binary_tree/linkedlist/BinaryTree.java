package com.denisgithuku.adts.trees.binary_tree.linkedlist;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
    public BinaryNode root;
    
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BinaryNode N1 = new BinaryNode();
        N1.data = "N1";
        BinaryNode N2 = new BinaryNode();
        N2.data = "N2";
        BinaryNode N3 = new BinaryNode();
        N3.data = "N3";
        BinaryNode N4 = new BinaryNode();
        N4.data = "N4";
        BinaryNode N5 = new BinaryNode();
        N5.data = "N5";
        BinaryNode N6 = new BinaryNode();
        N6.data = "N6";
        BinaryNode N7 = new BinaryNode();
        N7.data = "N7";
        BinaryNode N8 = new BinaryNode();
        N8.data = "N8";
        BinaryNode N9 = new BinaryNode();
        N9.data = "N9";
        
        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;
        binaryTree.root = N1;
        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        binaryTree.postOrder(binaryTree.root);
        System.out.println();
        binaryTree.levelOrder();
        binaryTree.binarySearch("N2");
        binaryTree.insertNode("N10");
        binaryTree.levelOrder();
        
    }
    
    //tree creation
    public BinaryTree() {
        this.root = null;
        System.out.println("Binary tree created");
    }
    
    //preorder traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    //inorder traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }
    
    //postorder traversal
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
    
    //levelOrder traversal
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.data + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }
    
    //search
    public void binarySearch(String value) {
        Queue<BinaryNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            BinaryNode presentNode = nodeQueue.remove();
            if (presentNode.data.equals(value)) {
                System.out.println("\nThe value - " + value + " is found in Tree");
                return;
            } else {
                if (presentNode.left != null) {
                    nodeQueue.add(presentNode.left);
                }
                if (presentNode.right != null) {
                    nodeQueue.add(presentNode.right);
                }
            }
        }
        System.out.println("The value - " + value + " is not found in Tree");
    }
    
    //insertion
    public void insertNode(String value) {
        BinaryNode binaryNode = new BinaryNode();
        binaryNode.data = value;
        if (root == null) {
            root = binaryNode;
            System.out.println("Inserted root");
            return;
        }
        Queue<BinaryNode> binaryNodeQueue = new LinkedList<>();
        binaryNodeQueue.add(root);
        while (!binaryNodeQueue.isEmpty()) {
            BinaryNode presentNode = binaryNodeQueue.remove();
            if (presentNode.left == null) {
                presentNode.left = binaryNode;
                System.out.println("Successfully inserted node at the left");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = binaryNode;
                System.out.println("Successfully inserted node at the right");
                break;
            } else {
                binaryNodeQueue.add(presentNode.left);
                binaryNodeQueue.add(presentNode.right);
            }
        }
    }
    
}
