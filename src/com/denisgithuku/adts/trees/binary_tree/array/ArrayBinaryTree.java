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
}
