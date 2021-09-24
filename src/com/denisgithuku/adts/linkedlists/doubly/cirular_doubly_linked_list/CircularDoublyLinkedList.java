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
        cDll.insertNodeIntoCircularDll(6, 1);
        cDll.insertNodeIntoCircularDll(7, 3);
        cDll.insertNodeIntoCircularDll(8, 9);
        System.out.println(cDll.head.value);
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
            tail.next = node;
            head.prev = node;
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
}
