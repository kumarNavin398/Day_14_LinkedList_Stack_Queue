package com.bridgelabz.LinkedLists;

public class LinkedList <G> {
    Node<G> head;
    Node<G> tail;

    public void push(G data) {
        Node<G> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void display() {
        Node<G> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void append(G data) {
        Node<G> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }  else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public G pop(){
        if(head == null)
            return null;
        G popData = head.data;
        head = head.next;
        return popData;
    }
    public G popLast(){
        if(head == null)
            return null;

        G popData = tail.data;
        Node<G> temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return popData;
    }

}
