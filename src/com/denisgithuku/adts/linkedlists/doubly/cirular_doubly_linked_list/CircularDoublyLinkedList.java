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
//        cDll.insertNodeIntoCircularDll(12, 3);
//        cDll.insertNodeIntoCircularDll(14, 4);
//        System.out.println(cDll.head.value);
        cDll.forwardTraversalCircularDll();
        cDll.backwardTraversalCircularDll();
        cDll.searchNode(7);
        cDll.searchNode(3);
        cDll.forwardTraversalCircularDll();
        cDll.deleteNode(0);
        cDll.forwardTraversalCircularDll();
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
        System.out.println();
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
        System.out.println("Node " + targetNode + " not found in list");
        return false;
    }
    
    //deletion from circular linked list
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Circular doubly linked list doesn't contain any node");
        } else if (location == 0) {
            if (size == 1) {
                head.next = head.prev = null;
                head = tail = null;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            size--;
        } else if (location >= size) {
            if (size == 1) {
                head.next = head.prev = null;
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
            size--;
        } else {
            DoubleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next; //node that comes after the next node
            tempNode.next.prev = tempNode; //reverse link between the node that comes after the current node and the next node
            size--;
        }
    }
}
