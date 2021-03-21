package linkedlist;

public class DeleteFirstNode {

        static Node deleteFirst(Node head)
        {
            if(head==null)
                return null;
            else
                return head.next;
        }

        static Node insert(int x,Node head)
        {
            Node temp=new Node(x);
            temp.next=head;
            return temp;
        }
    static Node delTail(Node head){
        if(head==null)return null;
        if(head.next==null)return null;
        Node curr=head;
        while(curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
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
            head=insert(44,head);
            traverse(head);
            head=deleteFirst(head);
            traverse(head);
            head=delTail(head);
            traverse(head);
        }
    }


