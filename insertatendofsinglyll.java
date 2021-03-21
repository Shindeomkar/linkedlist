package linkedlist;

public class insertatendofsinglyll {
    static Node insert(int x,Node head)
    {
        Node temp=new Node(x);
        if(head==null)
            return temp;
        Node curr=head;
        while (curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
        return head;
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
    public static void main(String[] args) {
        Node head=null;
        head=insert(11,head);
        head=insert(22,head);
        head=insert(33,head);
        traverse(head);
    }
}
