package com.aak.blindsevenfive.linkedlist;

public class LinkedListCycle {

    //Maintain two pointers, runner and walker, initilize them to head, then move walker one step and runner two setps,
    //Then check if runner == walker, if a cycle exist, They will meet at some point.x

    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode head){
        ListNode walker = head;
        ListNode runner = head;
        while(runner!=null && runner.next!=null) {
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner) return true;
        }
        return false;
    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}