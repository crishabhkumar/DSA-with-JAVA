package com.rishabh;

public class DLL {
    private Node head;
    private Node prev;
    private int size;
    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            node.prev = null;
        }

        Node last = head;
        while (last.next !=null){
            last = last.next;
        }

        last.next = node;
        node.next = null;
        node.prev = last;
        size++;
    }

    public void insertAtParticularIndex(int val,int index){
        if(index == 0){
            insertFirst(val);
        }
        if(index == size){
            insertLast(val);
        }
        Node temp = findNodeUsingIndex(index);
        Node node = new Node(val);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public void insertAfterParticularValue(int val,int after){
        Node temp = findNodeUsingValue(after);
        if(temp == null){
            System.out.println("Node doesn't exist.");
            return;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public Node findNodeUsingValue(int val){
        Node temp = head;
        while(temp!=null){
            if(temp.val == val){
                return temp;
            }
            temp= temp.next;
        }
        return null;
    }

    public void display () {
        Node node = head;
        Node last = null;
        System.out.println("Printing from start:");
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End point");

        System.out.println("Printing in reverse.");
        while (last != null) {
            System.out.print(last.val + " <- ");
            last = last.prev;
        }
        System.out.println("Start point");
    }


    public int deleteFirst(){
        int ele = head.val;
        if(head.next == null){
            head = null;
        }

        head = head.next;
        head.prev = null;
        return ele;
    }

    public int deleteLast(){
        Node temp = head;
        int ele = temp.val;
        if(temp.next == null){
            temp = null;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
        return ele;
    }

    public int deleteAtAnyIndex(int index){
        if(index == 0){
            deleteFirst();
        }
        if(index == size){
            deleteLast();
        }
        Node temp = findNodeUsingIndex(index);
        if(temp == null){
            System.out.println("Node doesn't exist");
        }
        int ele = temp.val;
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        temp = null;

        return ele;
    }

    public Node findNodeUsingIndex(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    private class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}

