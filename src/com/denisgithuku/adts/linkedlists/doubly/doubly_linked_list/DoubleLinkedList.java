package com.denisgithuku.adts.linkedlists.doubly.doubly_linked_list;

import com.denisgithuku.adts.linkedlists.doubly.DoubleNode;

public class DoubleLinkedList {
    public DoubleNode doubleNode;
    public DoubleNode head;
    public DoubleNode tail;
    public int size = 0;
    
    public static void main(String[] args) { 
        DoubleLinkedList dll = new DoubleLinkedList();
        System.out.println(dll.createDoubleLinkedList(5));
        System.out.println(dll.head.value);
        dll.insertIntoDoublyLinkedList(9, 0);
        dll.insertIntoDoublyLinkedList(10, 1);
        dll.insertIntoDoublyLinkedList(11, 2);
        System.out.println(dll.head.value);
        System.out.println(dll.head.next.value);
        System.out.println(dll.tail.value);
        dll.traverseDoublyLinkedList();
        dll.reverseTraversal();
        dll.searchNode(10);
        
        dll.traverseDoublyLinkedList();
        dll.deleteNodeFromDll(1);
        dll.traverseDoublyLinkedList();
        dll.deleteDll();
    }
    
    
    //creation method
    public DoubleNode createDoubleLinkedList(int nodeValue) {
        DoubleNode node = new DoubleNode();
        node.value = nodeValue;
        node.prev = node.next = null;
        head = node;
        tail = node;
        size = 1;
        return node;
    }
    
    //insertion method
    public void insertIntoDoublyLinkedList(int nodeValue, int location) {
        DoubleNode newNode = new DoubleNode();
        newNode.value = nodeValue;
        
        if (head == null) {
            createDoubleLinkedList(nodeValue);
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoubleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }
    
    //traversing a doubly linked list. Forward traversal
    public void traverseDoublyLinkedList(){
        if (head != null) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("Doubly linked list doesn't exist");
        }
        System.out.print('\n');
    }
    
    //reverse traversal
    public void reverseTraversal() {
        if (head != null) {
            DoubleNode tempNode = tail;
            for (int i = 0; i < size; i++){
                System.out.print(tempNode.value);
                if (i != size - 1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("Doubly linked list doesn't exist");
        }
        System.out.println();
    }
    
    //searching in a doubly linked list
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue){
                    System.out.println("Node found at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
            System.out.println("Node not found in list");
            return false;
    }
    
    //deletion of node from list
    public void deleteNodeFromDll(int location) {
        if (head == null) {
            System.out.println("Double linked list doesn't exist");
        } else if (location == 0){
            if (size == 1) {
                head = tail = null;
                size--;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        } else if (location >= size) {
            DoubleNode tempNode = tail.prev;
            if (size == 1) {
                head = tail = null;
                size--;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i <  location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }
    
    //deleting an entire doubly linked list
    public void deleteDll(){
        DoubleNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = tail = null;
        System.out.println("Doubly linked list successfully deleted");
    }
}
