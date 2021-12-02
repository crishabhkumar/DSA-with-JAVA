package com.rishabh;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }

    private class Node{
        private int val;
        private Node next;
        public Node(int value){
            this.val = value;
        }

        public Node(int value,Node next){
            this.val = value;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    public void printLL(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtParticularIndex(int value,int index){

        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
        }

        Node temp = head;
        for (int i = 1; i < index;i++){
            temp = temp.next;
        }

        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }


    public int deleteFirst(){
        int value = head.val;
        if(head == tail){
            head = null;
            tail = null;
            return value;
        }
        head = head.next;
        size--;
        return value;
    }

    public Node getIndexValue(int index){
        Node node = head;
        for (int i = 0; i< index;i++){
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = getIndexValue(size-2);
        int val = tail.val;
        tail = secondLast;
        secondLast.next = null;
        return val;
    }

    public int deleteAtAnyIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev_node = getIndexValue(index-1);
        int val = prev_node.next.val;
        prev_node.next = prev_node.next.next;
        size--;
        return val;
    }

    public Node firn(int value){
        Node node  = head;
        while (node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

}
