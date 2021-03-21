package linkedlist;

public class CirclularLinkList {
    public static void printlist(Node head){
        if(head==null)return;
        Node r=head;
        do{
            System.out.print(r.data+" ");
            r=r.next;
        }while(r!=head);
    }

    static Node insertBegin(Node head,int x){
        Node temp=new Node(x);
        if(head==null)
            temp.next=temp;
        else{
            Node curr=head;
            while(curr.next!=head)
                curr=curr.next;
            curr.next=temp;
            temp.next=head;
        }
        return temp;
    }
    static Node insertEnd(Node head,int x){
        Node temp=new Node(x);
        if(head==null){
            temp.next=temp;
            return temp;
        }
        else{
            Node curr=head;
            while(curr.next!=head)
                curr=curr.next;
            curr.next=temp;
            temp.next=head;
            return head;
        }
    }
    static Node delHead(Node head){
        if(head==null)return null;
        if(head.next==head)
            return null;
        Node curr=head;
        while(curr.next!=head)
            curr=curr.next;
        curr.next=head.next;
        return (curr.next);
    }

    static Node deleteKth(Node head,int k){
        if(head==null)return head;
        if(k==1)return delHead(head);
        Node curr=head;
        for(int i=0;i<k-2;i++)
            curr=curr.next;
        curr.next=curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head=null;
        head=insertBegin(head,1);
        head=insertBegin(head,2);
        head=insertBegin(head,3);
        printlist(head);
        head=insertEnd(head,4);
        head=delHead(head);
        head=deleteKth(head,2);
    }
}
