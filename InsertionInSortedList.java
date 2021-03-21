package linkedlist;

public class InsertionInSortedList {
    static Node insert(int x,Node head)
    {
        Node temp=new Node(x);
        temp.next=head;
        return temp;
    }
    static void traverse(Node head)
    {
        Node curr=head;
        while (curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    static Node insertinsorted(int x,Node head)
    {
        Node temp=new Node(x);
        if (head.data>x)
            insert(x, head);
        if (head==null)
            return temp;
        Node curr=head;
        while (curr.next.data<x)
        {
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(33,head);
        head=insert(22,head);
        head=insert(11,head);
        //traverse(head);
        head= insertinsorted(25,head);
       traverse(head);
    }
}
