package linkedlist;

public class MiddleOfLinkList {
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
    static void middleOfList(Node head)
    {
        int n=0;
        Node curr=head;
        while (curr!=null)
        {
            curr=curr.next;
            n++;
        }
        int m=n/2;
        curr=head;
        n=0;
        while (n<m)
        { curr=curr.next;n++;}
        System.out.println(curr.data);
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
        middleOfList(head);
    }
}
