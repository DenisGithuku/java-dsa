package com.denisgithuku.adts.linkedlists.singly.circular_singly_linked_list;

import com.denisgithuku.adts.linkedlists.singly.Node;

public class Creation {
    public Node head;
    public Node tail;
    public int size;
    
    public static void main(String[] args) {
        Creation creation = new Creation();
        creation.createCircularLinkedList(9);
        System.out.println(creation.head.value);
        creation.createCircularLinkedList(8);
        System.out.println(creation.head.value);
        creation.createCircularLinkedList(11);
        System.out.println(creation.head.next.next.value);
        creation.insertIntoCircularSinglyLinkedList(12, 0);
        creation.insertIntoCircularSinglyLinkedList(23, 1);
        creation.insertIntoCircularSinglyLinkedList(34, 2);
        creation.insertIntoCircularSinglyLinkedList(42, 3);
        System.out.println(creation.head.next.next.next.value);
        creation.searchNode(45);
        creation.searchNode(42);
        creation.traverseCircularSinglyLinkedList();
        creation.deleteNode(0);
        creation.deleteNode(9);
        creation.traverseCircularSinglyLinkedList();
        creation.deleteList();
//        creation.traverseCircularSinglyLinkedList();
    }
    
    public Node createCircularLinkedList(int nodeValue) {
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
    
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Node found at index: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found in list");
        return false;
    }
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("Circular singly linked doesn't exist");
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            
            if (size == 0){
                tail = null;
                head.next = null;
                head = null;
            }
        }  else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
    public void deleteList() {
        if (head == null) {
            System.out.println("Circular singly linked list doesn't exist");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("Circular singly linked list deleted successfully");
        }
    }
}
