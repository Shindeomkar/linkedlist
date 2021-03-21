package linkedlist;

public class insertatbeginofsinglyll {
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
    public static void main(String[] args) {
        Node head=null;
        head=insert(11,head);
        head=insert(22,head);
        head=insert(33,head);
        traverse(head);
    }
}
