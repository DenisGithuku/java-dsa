package com.denisgithuku.adts.trees.binary_tree.array;

public class ArrayBinaryTree {
    String [] arr;
    int lastUsedIndex;
    
    public ArrayBinaryTree(int size) {
        this.arr = new String[size + 1];
        this.lastUsedIndex = 0;
        System.out.println("Blank binary tree of size " + size + " created!");
    }
    
    public boolean isFull() {
        if (arr.length - 1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }
    
    //insert
    public void insert(String value) {
        if (!isFull()) {
            arr[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("Inserted " + value + " successfully!");
        } else {
            System.out.println("Binary tree is full");
        }
    }
    //preorder
    public void preOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
    
        System.out.print(arr[index] + " ");
        preOrder(index * 2);
        preOrder(index * 2 + 1);
    }
    
    //inorder
    public void inOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        inOrder(index * 2);
        System.out.print(arr[index] + " ");
        inOrder(index * 2 + 1);
    }
    
    //postorder
    public void postOrder(int index) {
        if (index > lastUsedIndex) {
            return;
        }
        postOrder(index * 2);
        postOrder(index * 2 + 1);
        System.out.print(arr[index] + " ");
    }
}
