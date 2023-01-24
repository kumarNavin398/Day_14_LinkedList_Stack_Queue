package StacksAndQueues;


public class ToCreateAStack
{
    public Node head;
    public Node tail;

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }
    // pushing new data
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    // Display all Node with Value
    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        ToCreateAStack operationStack = new ToCreateAStack();
        operationStack.push(70);
        operationStack.push(30);
        operationStack.push(56);

        operationStack.display();
    }
}