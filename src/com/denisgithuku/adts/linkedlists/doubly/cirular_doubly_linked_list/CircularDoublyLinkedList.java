package com.denisgithuku.adts.linkedlists.doubly.cirular_doubly_linked_list;

import com.denisgithuku.adts.linkedlists.doubly.DoubleNode;
public class CircularDoublyLinkedList {
    public DoubleNode head, tail;
    public int size;
    
    public static void main(String[] args) {
        CircularDoublyLinkedList cDll = new CircularDoublyLinkedList();
        cDll.createCircularDll(10);
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
}
