package com.denisgithuku.adts.linkedlists.singly.singly_linked_list;

public class SinglyLinkedListExample {

    public com.denisgithuku.adts.linkedlists.singly.Node head;
    public com.denisgithuku.adts.linkedlists.singly.Node tail;
    public int size;
    
    public static void main(String[] args) {
        SinglyLinkedListExample sll = new SinglyLinkedListExample();
        sll.createSinglyLinkedList(5);
        System.out.println(sll.head.value);

    }

    public com.denisgithuku.adts.linkedlists.singly.Node createSinglyLinkedList(int nodeValue) {
        new com.denisgithuku.adts.linkedlists.singly.Node();
        com.denisgithuku.adts.linkedlists.singly.Node node = new com.denisgithuku.adts.linkedlists.singly.Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}
