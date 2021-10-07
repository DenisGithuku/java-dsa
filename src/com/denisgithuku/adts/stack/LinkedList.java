package com.denisgithuku.adts.stack;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    
    public void insertInLinkedList(int nodeValue, int nodeLocation) {
        //create a new node
        Node node = new Node();
        node.value = nodeValue;
        
        //list contains no nodes so start by creating
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else if (nodeLocation == 0) { //insert at the head
            node.next = head;
            head = node;
        } else if (nodeLocation >= size) {
            node.next = null; //last nodes reference
            tail.next = node; //set the next reference of the tail reference to node
            tail = node; //set the node to be the tail
        } else {
            Node tempNode = head; //temporary node holder to be used in the loop
            int index = 0;
            while (index < nodeLocation - 1) { //loop till we reach the specified node
                tempNode = tempNode.next; //go to the next node everytime
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
    
    //deletion of node
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("Linked list if empty");
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = tail = null;
                size--;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            int index = 0;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
}
