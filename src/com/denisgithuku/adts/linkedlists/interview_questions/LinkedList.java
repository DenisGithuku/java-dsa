package com.denisgithuku.adts.linkedlists.interview_questions;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;
    
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.createLL(23);;
        linkedList.insertNode(4);
        linkedList.insertNode(6);
        linkedList.insertNode(8);
        linkedList.insertNode(10);
        linkedList.insertNode(4);
        linkedList.traversalLL();
        RemoveDups removeDups = new RemoveDups();
        removeDups.deleteNode(linkedList);
        linkedList.traversalLL();
    }
    
    public void createLL(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        head = tail = newNode;
        size = 1;
    }
    
    public void insertNode(int nodeValue) {
        if (head == null) {
            createLL(nodeValue);
            return;
        }
        
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    
    public void traversalLL() {
        Node tempNode = head;
        for (int i =0; i<size; i++) {
            System.out.print(tempNode.value);
            if (i != size -1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }
    
    
}