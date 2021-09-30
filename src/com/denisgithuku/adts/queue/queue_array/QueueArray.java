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
        array.enqueue(10);
        array.enqueue(20);
        array.enqueue(30);
        array.enqueue(40);
        array.enqueue(50);
        array.enqueue(60);
        array.enqueue(70);
        System.out.println(array.dequeue());
        System.out.println(array.dequeue());
        array.traverse();
        System.out.println(array.beginningOfQueue);
        System.out.println(array.peek());
        array.delete();
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
            arr[beginningOfQueue] = Integer.MIN_VALUE;
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }
    
    //traverse
    public void traverse() {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]);
            if (j != (arr.length - 1)) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
    
    //peek
    public int peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        }else {
            return -1;
        }
    }
    
    //delete
    public void delete() {
        arr = null;
        System.out.println("Queue successfully deleted");
    }
}
