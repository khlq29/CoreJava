package dSA;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Insert a new node at the end of the linked list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Display the elements of the linked list
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LInkedListPract {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert elements into the linked list
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);

        // Display the linked list
        System.out.println("Linked List elements:");
        linkedList.display();
    }
}
