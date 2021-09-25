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
        Question question = new Question();
        question.deleteNode(linkedList);
        linkedList.traversalLL();
        Node n = linkedList.NthToLast(linkedList, 3);
        System.out.println(n.value);
        linkedList.traversalLL();
        LinkedList ll = linkedList.partition(linkedList, 12);
        ll.traversalLL();
        
        LinkedList linkedListA = new LinkedList();
        linkedListA.insertNode(7);
        linkedListA.insertNode(1);
        linkedListA.insertNode(6);
        
        LinkedList linkedListB = new LinkedList();
        linkedListB.insertNode(5);
        linkedListB.insertNode(9);
        linkedListB.insertNode(2);
        
        LinkedList result = linkedList.sumList(linkedListA, linkedListB);
        result.traversalLL();
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
    
    //Question 2: Nth to last
    public Node NthToLast(LinkedList linkedList,int n) {
        Node p1 = linkedList.head;
        Node p2 = linkedList.head;
        for (int i = 0; i < n; i++) {
            if (p2 == null) return null;
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    
    //Question 4 - Partition
    LinkedList partition(LinkedList linkedList, int x){
        Node currentNode = linkedList.head;
        linkedList.tail = linkedList.head;
        while (currentNode != null) {
            Node next = currentNode.next;
            if (currentNode.value < x) {
                currentNode.next = linkedList.head;
                linkedList.head = currentNode;
            } else {
                linkedList.tail = currentNode;
            }
            currentNode = next;
        }
        linkedList.tail.next = null;
        return linkedList;
    }
    
    //Question 5 - sum list
    LinkedList sumList(LinkedList A, LinkedList B) {
        Node node1 = A.head;
        Node node2 = B.head;
        int carry = 0; //carries the excess value over
        LinkedList resultList = new LinkedList();
        while (node1 != null || node2 != null) {
            int result = carry;
            if (node1 != null) {
                result += node1.value;
                node1 = node1.next;
            }
            if (node2 != null) {
                result += node2.value;
                node2 = node2.next;
            }
            resultList.insertNode(result % 10);
            carry = result / 10;
        }
        return resultList;
    }
    
}