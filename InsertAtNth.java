package linkedlist;

public class InsertAtNth {
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
    static Node insertAtNth(Node head,int x ,int n)
    {
        Node temp=new Node(x);
        Node curr=head;
        int i=0;
        while (i!=n-1)
        {
            curr=curr.next;
            i++;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }
    public static void main(String[] args) {
        Node head=null;

        head=insert(11,head);
        head=insert(22,head);
        head=insert(33,head);
        head=insert(44,head);
        head=insertAtNth(head,55,2);
        traverse(head);
    }
}
