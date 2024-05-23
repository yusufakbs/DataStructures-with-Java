package org.datastructures.LinkedList.Node;

public class LinkedListStructure {
    private Node head;
    private Node tail;

    void add(int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = null;
        if (head == null) {
            head = newNode;
            tail = newNode;
            System.out.println("List is created and added first node");
        } else {
            tail.next = newNode;
            tail = newNode;
            System.out.println("Added last node");
        }
    }

    void addFirstNode(int x) {
        Node current = new Node();
        current.data = x;
        current.next = head;
        head = current;
        if (tail == null) {
            tail = current;
        }
        System.out.println("List is created and added first node");
    }

    void addLastNode(int x) {
        Node current = new Node();
        current.data = x;
        if (head == null) {
            current.next = null;
            head = current;
            tail = current;
            System.out.println("List is created and added last node");
        } else {
            current.next = null;
            tail.next = current;
            tail = current;
            System.out.println("Added last node");
        }
    }

    void addIndexOf(int x, int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            addFirstNode(x);
            return;
        }

        Node newNode = new Node();
        newNode.data = x;

        int i = 0;
        Node temp = head;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        System.out.println("Element " + x + " added at index " + index);
    }

    void deleteIndexOf(int index) {
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        } else if (head == null) {
            System.out.println("Index out of bounds");
            return;
        } else if (index == 0) {
            deleteFirstNode();
            return;
        }

        int i = 0;
        Node temp = head;
        Node temp2 = head;
        while (temp != null && i < index) {
            temp2 = temp;
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        } else {
            temp2.next = temp.next;
            if (temp.next == null) {
                tail = temp2;
            }
            System.out.println("The list element has been deleted");
        }
    }

    void deleteFirstNode() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            System.out.println("The list element has been deleted");
        }
    }

    void printAllData() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node current = head;
            System.out.print("[");
            while (current != null) {
                System.out.print(current.data);
                current = current.next;
                if (current != null) {
                    System.out.print(",");
                }
            }
            System.out.print("]");
        }

    }
}
