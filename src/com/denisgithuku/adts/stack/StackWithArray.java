package com.denisgithuku.adts.stack;

public class StackWithArray {
    int[] arr;
    int topOfStack;
    
    public static void main(String[] args) {
        StackWithArray stackWithArray = new StackWithArray(4);
        System.out.println(stackWithArray.isEmpty());
        System.out.println(stackWithArray.isFull());
        stackWithArray.push(3);
        stackWithArray.push(5);
        stackWithArray.push(7);
        stackWithArray.push(9);
        stackWithArray.push(12); //will return stackWithArray is full
        System.out.println(stackWithArray.pop());
        System.out.println(stackWithArray.pop());
        System.out.println(stackWithArray.peek());
        stackWithArray.delete();
        System.out.println(stackWithArray.peek());
    }
    
    public StackWithArray(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("StackWithArray created with size of: " + size);
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
            System.out.println("StackWithArray is already full");
        }
    }
    
    public int pop() {
        int topStack = arr[topOfStack];
        if (isEmpty()) {
            System.out.println("StackWithArray is empty");
        } else {
            topOfStack--;
        }
        return topStack;
    }
    
    //peek
    public int peek() {
        int topStack = arr[topOfStack];
        if (isEmpty()) {
            System.out.println("StackWithArray is empty");
            return -1;
        } else {
            return topStack;
        }
    }
    
    //delete
    public void delete() {
        arr = null;
        System.out.println("StackWithArray deleted successfully");
    }
}
