package linkedlist;

public class RemoveDuplicatesFromSortedArray {
    static Node insert(int x, Node head) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    static void traverse(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    static void removeDuplicates(Node head) {
        Node curr = head;
        while (curr.next != null) {
            if (curr.data == curr.next.data)
                curr.next = curr.next.next;
            else
                curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        head = insert(11, head);
        head = insert(11, head);
        head = insert(22, head);
        head = insert(22, head);
        head = insert(33, head);
        traverse(head);
        removeDuplicates(head);
        System.out.println();
        traverse(head);
    }
}
