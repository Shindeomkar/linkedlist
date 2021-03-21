package linkedlist;

public class DetectLoop {
    static boolean detectLoop(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node temp1=new Node(20);
        Node temp2=new Node(30);
        head.next=temp1;
        temp1.next=temp2;
        temp2.next=head;
        if (detectLoop(head))
        System.out.println("yes");
        else
            System.out.println("no");
    }
}
