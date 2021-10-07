
package com.denisgithuku.adts.linkedlists.singly_linked_list;

public class SinglyLinkedListOperations {
    public com.denisgithuku.adts.linkedlists.singly.Node head;
    public com.denisgithuku.adts.linkedlists.singly.Node tail;
    public int size;

    public static void main(String[] args) {
        SinglyLinkedListOperations singlyLinkedListOperations = new SinglyLinkedListOperations();

        singlyLinkedListOperations.insertInLinkedList(5, 0);
        singlyLinkedListOperations.insertInLinkedList(6, 1);
        singlyLinkedListOperations.insertInLinkedList(7, 2);
        singlyLinkedListOperations.insertInLinkedList(8, 3);
        singlyLinkedListOperations.insertInLinkedList(9, 4);
        singlyLinkedListOperations.insertInLinkedList(10, 5);
        singlyLinkedListOperations.insertInLinkedList(11, 0);
        System.out.println(singlyLinkedListOperations.head.value);
        System.out.println(singlyLinkedListOperations.head.next.value);
        System.out.println(singlyLinkedListOperations.head.next.next.value);
        singlyLinkedListOperations.traverseSinglyLinkedList();
        singlyLinkedListOperations.searchNode(7);
        singlyLinkedListOperations.deleteNode (3);
//        singlyLinkedListOperations.traverseSinglyLinkedList();
        singlyLinkedListOperations.deleteSinglyLinkedList();
        singlyLinkedListOperations.traverseSinglyLinkedList();
    }
    public com.denisgithuku.adts.linkedlists.singly.Node createSinglyLinkedList(int nodeValue) {
        com.denisgithuku.adts.linkedlists.singly.Node node = new com.denisgithuku.adts.linkedlists.singly.Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList(int nodeValue, int nodeLocation) {
        //create a new node
        com.denisgithuku.adts.linkedlists.singly.Node node = new com.denisgithuku.adts.linkedlists.singly.Node();
        node.value = nodeValue;

        //list contains no nodes so start by creating
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
            //insert at the head
        } else if (nodeLocation == 0) {
            node.next = head;
            head = node;
        } else if (nodeLocation >= size) {
            node.next = null; //last nodes reference
            tail.next = node; //set the next reference of the tail reference to node
            tail = node; //set the node to be the tail
        } else {
            com.denisgithuku.adts.linkedlists.singly.Node tempNode = head; //temporary node holder to be used in the loop
            int index = 0;
            while (index < nodeLocation - 1) { //loop till we reach the specified node
                tempNode = tempNode.next; //go to the next node everytime
                index++;
            }
            com.denisgithuku.adts.linkedlists.singly.Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("The single linked list does not exit");
            return;
        } else {
            com.denisgithuku.adts.linkedlists.singly.Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }


    //searching for a node in a linked list
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            com.denisgithuku.adts.linkedlists.singly.Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if(tempNode.value == nodeValue) {
                    System.out.print("Found node at: " + i + "\n");
                    return true;
                }
                tempNode  = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }
    
    //deleting from a single linked list
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println ("Linked list empty!!");
        } else if (location == 0) {
            head = head.next;  //more than one node
            size--;
            if (size == 0) { //only one node
                tail = null;
            }
        } else if (location >= size) {
            com.denisgithuku.adts.linkedlists.singly.Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
           if (tempNode == head) { //node at the head. Only one node
               tail = head = null;
               size--;
           }
           tempNode.next = null;
           tail = tempNode;
           size--;
        } else {
            com.denisgithuku.adts.linkedlists.singly.Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
        }
    }
    
    public void deleteSinglyLinkedList() {
        head = null;
        tail = null;
        System.out.println("Singly linked list deleted");
    }
}
