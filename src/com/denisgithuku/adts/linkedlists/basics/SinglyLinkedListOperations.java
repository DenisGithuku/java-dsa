package com.denisgithuku.adts.linkedlists.basics;

public class SinglyLinkedListOperations {
    public Node head;
    public Node tail;
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
    }
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
            //insert at the head
        } else if (nodeLocation == 0) {
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

    public void traverseSinglyLinkedList() {
        if (head == null) {
            System.out.println("The single linked list does not exit");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size -1) {
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
            Node tempNode = head;
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
}
