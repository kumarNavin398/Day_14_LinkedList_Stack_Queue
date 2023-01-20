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


}
