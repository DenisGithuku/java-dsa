package com.denisgithuku.adts.queue.queue_array;

public class QueueArray {
    int[] arr;
    int topOfQueue, beginningOfQueue;
    
    
    //creation
    public QueueArray(int size) {
        arr = new int[size];
        topOfQueue = beginningOfQueue = -1;
        System.out.println("Queue successfully created with size of " + size);
    }
    
    public static void main(String[] args) {
        QueueArray array = new QueueArray(6);
        System.out.println(array.isFull());
        System.out.println(array.isEmpty());
        array.enqueue(1);
        array.enqueue(2);
        array.enqueue(3);
        array.enqueue(4);
        array.enqueue(5);
        array.enqueue(6);
        array.enqueue(7);
        System.out.println(array.dequeue());
    }
    
    //isFull
    public boolean isFull() {
        return (this.topOfQueue == this.arr.length - 1);
    }
    
    //isEmpty
    public boolean isEmpty() {
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }
    
    //enqueue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else if (isEmpty()) {
            this.beginningOfQueue = 0;
            this.topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in queue");
        } else {
            this.topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in queue");
        }
    }
    
    //dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }
}
