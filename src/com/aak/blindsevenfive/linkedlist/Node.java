package com.aak.blindsevenfive.linkedlist;

public class Node {
    public int val;
    public Node nextNode;
    Node(){
        //Default Constructor
    }

    Node( int val){
        this.val = val;
    }

    Node(int val, Node nextNode){
        this.val = val;
        this.nextNode = nextNode;
    }

    @Override
    public String toString(){
        return " NodeVal : "+ val + " NodeNextVal " + nextNode.val;
    }
}
