package com.denisgithuku.adts.trees.binary_tree.array;

public class Main {
    public static void main(String[] args) {
        ArrayBinaryTree arrayBinaryTree = new ArrayBinaryTree(5);
        arrayBinaryTree.insert("N1");
        arrayBinaryTree.insert("N2");
        arrayBinaryTree.insert("N3");
        arrayBinaryTree.insert("N4");
        arrayBinaryTree.insert("N5");
        arrayBinaryTree.insert("N6");
        
        arrayBinaryTree.preOrder(1);
        System.out.println();
        arrayBinaryTree.inOrder(1);
        System.out.println();
        arrayBinaryTree.postOrder(1);
    }
}
