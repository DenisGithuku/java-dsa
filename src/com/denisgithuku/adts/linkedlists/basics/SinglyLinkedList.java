package com.denisgithuku.adts.linkedlists.basics;

public class SinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
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
