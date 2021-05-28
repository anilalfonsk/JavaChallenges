package com.aak.blindsevenfive.linkedlist;

public class MergeTwoSortedLinkedList {

    /**
     * For a given linkedList, do the basic check like null and either is null etc. Then,
     * Join both list using <= check, all the while maintaing the head in a variable to be retured, using tempnode to
     * iterate.
     * @param args
     */

    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead ;
        if(l1 == null && l2 == null) return null;
        else if(l1 == null) return l2;
        else if(l2 == null) return l1;
        if(l1.val <= l2.val){
            newHead = l1;
            l1 = l1.next;
        }else{
            newHead = l2;
            l2 = l2.next;
        }
        ListNode tempNode = newHead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                tempNode.next = l1;
                l1 = l1.next;
            }else{
                tempNode.next = l2;
                l2 = l2.next;
            }
            tempNode = tempNode.next;
        }
        if(l1 != null){
            while(l1 != null){
                tempNode.next = l1;
                tempNode = tempNode.next;
                l1 = l1.next;
            }
        }else if(l2 != null){
            while(l2 != null){
                tempNode.next = l2;
                tempNode = tempNode.next;
                l2 = l2.next;
            }
        }
        return newHead;
    }
}
