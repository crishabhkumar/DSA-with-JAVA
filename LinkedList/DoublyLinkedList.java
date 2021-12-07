package com.rishabh;

public class DLL {
    private Node head;
    private Node prev;
    private int size;

    public DLL(){this.size = 0;}


    private class Node{
        private int val;
        private Node next;
        private Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next,Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
//
//    public void insertLast(int val){
//        Node node = new Node(val);
//        node.prev =
//    }

    public void display(){
        Node node = head;
        Node last = null;
        while (node != null){
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End point");

        System.out.println("Printing in reverse.");
        while (last != null){
            System.out.print(last.val + " <- ");
            last = last.prev;
        }
        System.out.println("Start point");
    }


}
