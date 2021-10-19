package com.denisgithuku.adts.trees.binary_search_tree;

import java.util.*;

public class BinarySearchTree {
    public BinarySearchNode root;
    
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(70);
        binarySearchTree.insert(50);
        binarySearchTree.insert(90);
        binarySearchTree.insert(30);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.insert(100);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        
        binarySearchTree.preOrder(binarySearchTree.root);
        System.out.println();
        binarySearchTree.inOrder(binarySearchTree.root);
        System.out.println();
        binarySearchTree.postOrder(binarySearchTree.root);
        System.out.println();
        binarySearchTree.levelOrder();
    }
    
    public BinarySearchTree() {
        this.root = null;
        System.out.println("Created binary search tree");
    }
    
    //insert method
    private BinarySearchNode insertNode(BinarySearchNode currentNode, int value) {
        if (currentNode == null) {
            BinarySearchNode newNode = new BinarySearchNode();
            newNode.value = value;
            System.out.println("Successfully inserted node");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insertNode(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insertNode(currentNode.right, value);
            return currentNode;
        }
    }
    
    public void insert(int value) {
        root = insertNode(root, value);
    }
    
    //preorder traversal
    public void preOrder(BinarySearchNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
    
    //inorder
    public void inOrder(BinarySearchNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
    
    //postorder traversal
    public void postOrder(BinarySearchNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
    
    //level-order traversal
    public void levelOrder() {
        Queue<BinarySearchNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinarySearchNode currentNode = queue.remove();
            System.out.print(currentNode.value + " ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }
}
