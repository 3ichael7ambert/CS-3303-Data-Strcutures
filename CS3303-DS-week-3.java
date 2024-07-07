import jeliot.io.*;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

class Stack {
    private Node top;

    // Push method to add items to the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop method to remove items from the stack
    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int value = top.value;
        top = top.next;
        return value;
    }

    // Print stack elements as they are popped off
    public void printAndPopAll() {
        while (top != null) {
            System.out.println("Popped value: " + pop());
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(1);
        stack.push(0);

        stack.printAndPopAll();
    }
}
