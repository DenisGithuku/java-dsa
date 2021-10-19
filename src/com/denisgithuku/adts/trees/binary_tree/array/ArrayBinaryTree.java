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
    
    //levelorder
    public void levelOrder() {
        for (int i = 1; i <= lastUsedIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    //search
    public int search(String value) {
        for (int i = 1; i <= lastUsedIndex; i++) {
            if (arr[i].equals(value)) {
                System.out.println(value + " exists at location " + i);
                return i;
            }
        }
        System.out.println("Value doesn't exist in tree");
        return -1;
    }
    
    //delete
    public void delete(String value) {
        int location = search(value);
        if (location == -1) {
            return;
        } else {
            arr[location] = arr[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("Successfully deleted " +  value);
        }
    }
    
    //delete tree
    public void deleteTree() {
        try {
            this.arr = null;
            System.out.println("Successfully deleted tree");
        } catch (Exception e) {
            System.out.println("An error occurred!");
        }
    }
}
