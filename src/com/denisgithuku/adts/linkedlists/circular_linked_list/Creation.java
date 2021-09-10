package com.denisgithuku.adts.linkedlists.circular_linked_list;

import com.denisgithuku.adts.linkedlists.Node;

public class Creation {
    public Node head;
    public Node tail;
    public int size;
    
    public static void main(String[] args) {
        Creation creation = new Creation();
        creation.createCircularLinkedList(9);
        System.out.println(creation.head.value);
        creation.createCircularLinkedList(8);
        System.out.println(creation.head.next.value);
        creation.createCircularLinkedList(11);
        System.out.println(creation.head.next.next.value);
        creation.insertIntoCircularSinglyLinkedList(8, 0);
        creation.insertIntoCircularSinglyLinkedList(23, 1);
        creation.insertIntoCircularSinglyLinkedList(34, 2);
        System.out.println(creation.head.next.next.value);
        creation.traverseCircularSinglyLinkedList();
    }
    
    public Node createCircularLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = node;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    
    public void insertIntoCircularSinglyLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCircularLinkedList(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }
    
    public void traverseCircularSinglyLinkedList() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.print("\n");
    }
}
