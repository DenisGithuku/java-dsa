package com.denisgithuku.adts.stack;

public class StackWithLinkedList {
    LinkedList linkedList;
    
    //constructor
    public StackWithLinkedList() {
        linkedList = new LinkedList();
    }
    
    public static void main(String[] args) {
        StackWithLinkedList stackWithLinkedList = new StackWithLinkedList();
        stackWithLinkedList.push(1);
        stackWithLinkedList.push(2);
        stackWithLinkedList.push(3);
        stackWithLinkedList.push(4);
        int result = stackWithLinkedList.pop();
        System.out.println(result);
        int result2 = stackWithLinkedList.pop();
        System.out.println(result2);
        System.out.println(stackWithLinkedList.peek());
        stackWithLinkedList.deleteStack();
        System.out.println(stackWithLinkedList.isEmpty());
    }
    
    //push
    public void push(int nodeValue) {
        linkedList.insertInLinkedList(nodeValue, 0);
        System.out.println("Inserted " + nodeValue + " in stack");
    }
    
    //isEmpty
    public boolean isEmpty() {
        return (linkedList.head == null);
    }
    
    //pop
    public int pop() {
        int result = -1;
        if (!isEmpty()) {
            result = linkedList.head.value;
            linkedList.deletionOfNode(0);
        } else {
            System.out.println("The stack is empty");
        }
        return result;
    }
    
    //peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return linkedList.head.value;
        }
    }
    
    //delete
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("Stack is deleted");
    }
}