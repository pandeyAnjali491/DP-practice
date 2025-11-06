package assg1;

public class ques8 {
    // inserting new node
    public static void addNode(Node head, int data) {
        Node temp = head;
        Node newNode = new Node();
        newNode.data = data;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // displaying list
    public static void displayList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // reversing list using recursion
    public static Node reverseList(Node head, Node curr, Node pre) {
        // base case - if current node is null
        if (curr == null) {
            head = pre;
            return head;
        }
        // logic
        Node next = curr.next;
        curr.next = pre;
        return reverseList(head, next, curr);
    }

    public static void main(String[] args) {
        Node head = new Node();
        addNode(head, 1);
        addNode(head, 2);
        addNode(head, 3);
        addNode(head, 4);
        displayList(head);
        head = reverseList(head, head, null);
        displayList(head);
    }
}

// node class for linkedlist
class Node {
    int data;
    Node next;
}