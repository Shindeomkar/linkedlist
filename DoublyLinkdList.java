package linkedlist;
class Dnode
{
    int data;
    Dnode prev;
    Dnode next;
    Dnode(int d)
    {
        data=d;
    }
}

public class DoublyLinkdList {
    static Dnode insert(int d,Dnode head)
    {
        Dnode temp=new Dnode(d);
        temp.next=head;
        if(head!=null)
            head.prev=temp;
        return temp;
    }
    static void traverse(Dnode head)
    {
        Dnode curr=head;
        while (curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;

        }
    }
    static Dnode insertAtEnd(int d,Dnode head)
    {
        Dnode temp=new Dnode(d);
        Dnode curr=head;
        while(curr.next!=null)
        {curr=curr.next;}
        curr.next=temp;
        temp.prev=curr;
        return head;
    }
    static Dnode reverseDoublyLinkList(Dnode head)
    {
        Dnode curr=head;
        while (curr.next!=null)
        {
            curr=curr.next;
        }
        while (curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.prev;
        }
        return head;
    }
    static Dnode delHead(Dnode head){
        if(head==null)return null;
        if(head.next==null){
            return null;
        }
        else{
            head=head.next;
            head.prev=null;
            return head;
        }
    }
    static Dnode deleteLastNode(Dnode head)
    {
        if(head==null)
            return null;
        if (head.next==null)
            return null;
        Dnode curr=head;
        while (curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return head;
    }
    public static void main(String[] args) {
        Dnode head=null;
        head=insert(10,head);
        head=insert(20,head);
        head=insert(30,head);
        head=insert(40,head);
        head=insertAtEnd(50,head);
        traverse(head);
       // head=reverseDoublyLinkList(head);
        head=delHead(head);
     //   traverse(head);
        head=deleteLastNode(head);
            traverse(head);


    }
}
