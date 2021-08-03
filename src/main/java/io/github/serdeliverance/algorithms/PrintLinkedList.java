package io.github.serdeliverance.algorithms;

public class PrintLinkedList {

    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode currentNode = head;
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            return newNode;
        }

        SinglyLinkedListNode curr = head;

        while(curr.next != null) curr = curr.next;

        curr.next = newNode;
        return head;
    }

    static class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }
    }
}
