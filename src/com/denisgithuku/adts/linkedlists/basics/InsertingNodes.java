package com.denisgithuku.adts.linkedlists.basics;

public class InsertingNodes {
    public Node head;
    public Node tail;
    public int size;

    public static void main(String[] args) {
        InsertingNodes insertingNodes = new InsertingNodes();
//        insertingNodes.createSinglyLinkedList(5);
//        System.out.println(insertingNodes.head.value);
//        insertingNodes.insertInLinkedList(5, 0);
        insertingNodes.insertInLinkedList(6, 1);
        insertingNodes.insertInLinkedList(7, 2);
        System.out.println(insertingNodes.head.value);
        System.out.println(insertingNodes.head.next.value);
        System.out.println(insertingNodes.head.next.next.value);
    }

    public Node createSinglyLinkedList(int nodeValue) {
        new InsertingNodes();
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
}

