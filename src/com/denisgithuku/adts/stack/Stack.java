package com.denisgithuku.adts.stack;

public class Stack {
    int[] arr;
    int topOfStack;
    
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(12); //
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
    
    //isFull
    public boolean isFull() {
        return (topOfStack == arr.length - 1);
    }
    
    //
    public void push(int value) {
        if (!isFull()) {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Value inserted successfully");
        } else {
            System.out.println("Stack is already full");
        }
    }
}
