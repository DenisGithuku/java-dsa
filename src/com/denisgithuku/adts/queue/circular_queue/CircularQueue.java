package com.denisgithuku.adts.queue.circular_queue;

public class CircularQueue {
    int [] arr;
    int beginningOfQueue, topOfQueue, size;
    
    public CircularQueue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = this.beginningOfQueue = -1;
        System.out.println("Queue with size " + size + " created successfully");
    }
    
    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(3);
        System.out.println("Queue is empty: " + circularQueue.isEmpty());
        System.out.println("Queue is full: " + circularQueue.isFull());
        circularQueue.enqueue(11);
        circularQueue.enqueue(12);
        circularQueue.enqueue(13);
        circularQueue.traverse();
        System.out.println(circularQueue.dequeue());
        circularQueue.traverse();
        circularQueue.enqueue(14);
        circularQueue.traverse();
        System.out.println(circularQueue.peek());
        circularQueue.delete();
        circularQueue.traverse();
    }
    
    //isEmpty
    public boolean isEmpty() {
        return arr == null || topOfQueue == -1;
    }
    
    //isFull
    public boolean isFull() {
        if (topOfQueue + 1 == beginningOfQueue) {
            return true;
        } else return (beginningOfQueue == 0) && (topOfQueue + 1 == size);
    }
    
    //enqueue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()){
            beginningOfQueue++;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println(value + " added successfully");
            
        } else {
            if (topOfQueue + 1 == size){
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println(value + " added successfully");
        }
    }
    
    //dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = Integer.MIN_VALUE;
            if (beginningOfQueue == topOfQueue) {
                beginningOfQueue = topOfQueue = -1;
            } else if (beginningOfQueue + 1 == size){
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            
            return result;
        }
    }
    //traversal
    public void traverse() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i]);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }
    
    //peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return arr[beginningOfQueue];
        }
    }
    
    //delete
    public void delete() {
        arr = null;
    }
}
