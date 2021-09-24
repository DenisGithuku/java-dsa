package com.denisgithuku.adts.linkedlists.doubly.cirular_doubly_linked_list;

import com.denisgithuku.adts.linkedlists.doubly.DoubleNode;
public class CircularDoublyLinkedList {
    public DoubleNode head, tail;
    public int size;
    
    public static void main(String[] args) {
        CircularDoublyLinkedList cDll = new CircularDoublyLinkedList();
        cDll.createCircularDll(10);
        System.out.println(cDll.head.value);
        cDll.insertNodeIntoCircularDll(5, 0);
        cDll.insertNodeIntoCircularDll(6, 2);
        cDll.insertNodeIntoCircularDll(7, 5);
        cDll.insertNodeIntoCircularDll(9, 4);
//        System.out.println(cDll.head.value);
        cDll.forwardTraversalCircularDll();
        System.out.println();
        cDll.backwardTraversalCircularDll();
        cDll.searchNode(7);
        cDll.searchNode(3);
    }
    
    //creation of a circular linked list
    public void createCircularDll(int nodeValue) {
        DoubleNode node = new DoubleNode();
        node.value = nodeValue;
        node.next = node.prev = node;
        head = tail = node;
        size = 1;
        System.out.println("Circular doubly linked list created!");
    }
    
    public void insertNodeIntoCircularDll(int nodeValue, int location) {
        DoubleNode node = new DoubleNode();
        node.value = nodeValue;
        if (head == null) {
            createCircularDll(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            head = node;
        } else if (location >= size) {
            node.next = head;
            node.prev = tail;
            head.prev = node;
            tail.next = node;
            tail = node;
        } else {
            DoubleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            tempNode.next = node;
            node.prev = tempNode;
            node.next = tempNode.next;
            node.next.prev = node;
        }
        size++;
    }
    
    
    //forward traversal
    public void forwardTraversalCircularDll() {
        if (head != null) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next; //traversal to the next node
            }
        } else {
            System.out.println("Circular doubly linked list doesn't exist");
        }
    }
    
    //backward traversal
    public void backwardTraversalCircularDll() {
        if (head != null) {
            DoubleNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.prev; //traversing in reversal
            }
            System.out.println();
        } else {
            System.out.println("Doubly circular linked list doesn't exist");
        }
    }
    
    //searching of a given node
    public boolean searchNode(int targetNode) {
        if (head != null) {
            DoubleNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == targetNode) {
                    System.out.println("Node " + targetNode + " found at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
            System.out.println("Node " + targetNode +  " not found in list");
            return false;
        }
}
