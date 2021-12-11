package com.rishabh;

public class CLL {

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void display(){
        Node temp = head;
        if(head!=null){
            do {
                System.out.print(temp.val + "->");
                temp=temp.next;
            }while (temp!=head);
        }
        System.out.println("head");
    }

    public void delete(int val){
        if(head == null){
            System.out.println("Empty list.");
        }
        Node temp = head;
        if(head.val == val){
            head = head.next;
            tail.next = head;
        }
        do {
            Node n = temp.next;
            if(n.val == val){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while (temp != head);



//        if(tail.val == val){
//
//        }
//        while(temp.next.val != val){
//            if(temp == head){
//                System.out.println("Element is not found.");
//                break;
//            }
//            if(temp.next.val == val){
//                temp.next = temp.next.next;
//                break;
//            }
//            temp = temp.next;
//        }

    }

    private class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }
}
