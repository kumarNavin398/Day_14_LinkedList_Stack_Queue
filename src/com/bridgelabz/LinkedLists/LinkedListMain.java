package com.bridgelabz.LinkedLists;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.append(89);
        linkedList1.display();

        System.out.println("After pop");
        linkedList1.pop();
        linkedList1.display();


    }
}