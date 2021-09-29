package com.denisgithuku.adts.stack;

public class Stack {
    int[] arr;
    int topOfStack;
    
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        System.out.println(stack.isEmpty());
    }
    
    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack created with size of: " + size);
    }
    
    //isEmpty
    public boolean isEmpty() {
        return (topOfStack == -1);
    }
}
