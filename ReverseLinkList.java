package linkedlist;

public class ReverseLinkList {
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
    static Node reverseLinkList(Node head)
    {
        Node curr=head;
        Node prev=null;
        Node next1=curr.next;
        while (curr!=null)
        {
            next1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next1;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insert(11,head);
        head=insert(22,head);
        head=insert(33,head);
        head=insert(44,head);
        head=insert(55,head);
        head=insert(66,head);
        traverse(head);
       head= reverseLinkList(head);
        System.out.println();
        traverse(head);
    }
}
