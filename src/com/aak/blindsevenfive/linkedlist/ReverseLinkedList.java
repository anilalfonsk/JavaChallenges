package com.aak.blindsevenfive.linkedlist;

import java.util.Optional;

public class ReverseLinkedList {
    public static void main(String[] args) throws InterruptedException {
        Node node = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);
        node.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;
        node4.nextNode = null;
        Node revNode = reverseList(node);
        while(revNode != null){
            System.out.println("NodeVal::"+revNode.val);
            Thread.sleep(1000);
            revNode = revNode.nextNode;
        }
    }

    public static Node reverseList(Node node) {
        Node prevhead = null;
        while(node != null){
            Node next = node.nextNode;
            node.nextNode = prevhead;
            prevhead = node;
            node = next;
        }
        return prevhead;
    }

    public static Node iterativeReverse(Node head, Node newHead){
        if(head == null){
            return newHead;
        }
        Node next = head.nextNode;
        head.nextNode = newHead;
        return iterativeReverse(next, head);
    }

}
