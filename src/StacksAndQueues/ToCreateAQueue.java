package StacksAndQueues;

public class ToCreateAQueue
{
    public Node head;
    public Node tail;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    // Append data One By One
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    // Display all the Node with value
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is Empty");
        }
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        ToCreateAQueue operationQueue = new ToCreateAQueue();
        operationQueue.append(70);
        operationQueue.append(30);
        operationQueue.append(56);

        operationQueue.display();
    }
}
