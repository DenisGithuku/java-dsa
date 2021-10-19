package com.denisgithuku.adts.trees.binary_search_tree;

public class BinarySearchTree {
    public BinarySearchNode root;
    
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
    }
    
    public BinarySearchTree() {
        this.root = null;
        System.out.println("Created binary search tree");
    }
}
