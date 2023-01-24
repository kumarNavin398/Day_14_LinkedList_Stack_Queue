package com.bridgelabz.LinkedLists;


public class LinkedListMain {
    public static void main(String[] args) {
        //uc2
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.display();

        //uc3
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.append(56);
        linkedList2.append(30);
        linkedList2.append(70);
        linkedList2.display();

        //uc5
        linkedList1.pop();
        linkedList1.display();

        //uc6
        linkedList2.popLast();
        linkedList2.display();

        //uc7
        linkedList2.search(30);

        //uc8
        linkedList2.insertDataAfter(30,40);
        linkedList2.display();
    }
}