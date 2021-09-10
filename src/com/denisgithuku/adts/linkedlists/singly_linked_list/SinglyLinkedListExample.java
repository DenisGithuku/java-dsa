package com.denisgithuku.adts.linkedlists.singly_linked_list;

import com.denisgithuku.adts.linkedlists.Node;

public class SinglyLinkedListExample {

    public Node head;
    public Node tail;
    public int size;
    
    public static void main(String[] args) {
        SinglyLinkedListExample sll = new SinglyLinkedListExample();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.head.value);

    }

    public Node createSinglyLinkedList(int nodeValue) {
        new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
