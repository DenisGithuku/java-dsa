package com.denisgithuku.adts.linkedlists.interview_questions;

import java.util.HashSet;

public class RemoveDups {
    public static void main(String[] args) {
        RemoveDups removeDups = new RemoveDups();
    }
    
    void deleteNode(LinkedList linkedList) {
        HashSet<Integer> hashSet = new HashSet<>();
        Node current = linkedList.head;
        Node prev = null;
        while (current != null) {
            if (hashSet.contains(current.value)) {
                prev.next = current.next;
                linkedList.size--;
            } else {
                hashSet.add(current.value);
                prev = current;
            }
            current = current.next;
        }
    }
}
