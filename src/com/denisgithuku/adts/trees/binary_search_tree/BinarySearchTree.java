package com.denisgithuku.adts.trees.binary_search_tree;

public class BinarySearchTree {
    public BinarySearchNode root;
    
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(70);
        binarySearchTree.insert(80);
        binarySearchTree.insert(90);
        binarySearchTree.insert(30);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.insert(100);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
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
        insertNode(root, value);
    }
}
