package com.denisgithuku.adts.queue.queue_linkedlist;

import com.denisgithuku.adts.linkedlists.singly.singly_linked_list.SinglyLinkedListOperations;
public class QueueWithLinkedList {
    public SinglyLinkedListOperations linkedList;
    
    
    public static void main(String[] args) {
        QueueWithLinkedList queue = new QueueWithLinkedList();
        queue.enqueue(9);
        queue.enqueue(23);
        queue.enqueue(34);
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        queue.delete();
    }
    
    //init the queue
    public QueueWithLinkedList() {
        linkedList = new SinglyLinkedListOperations();
        System.out.println("Queue created");
    }
    
    //enqueue method
    public void enqueue(int nodeValue) {
        linkedList.insertInLinkedList(nodeValue, linkedList.size);
        System.out.println("Inserted element");
    }
    
    //isEmpty
    public boolean isEmpty() {
        return linkedList.head == null;
    }
    
    //peek
    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return linkedList.head.value;
        }
    }
    
    //dequeue
    public int dequeue() {
        if (isEmpty()) {
            return -1;
        } else {
            int element = linkedList.head.value;
            linkedList.deleteNode(0);
            return element;
        }
    }
    
    //delete queue
    public void delete() {
        linkedList.head = linkedList.tail = null;
        System.out.println("Queue deleted successfully");
    }
    
}
