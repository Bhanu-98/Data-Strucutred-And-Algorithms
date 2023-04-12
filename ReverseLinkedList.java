
//  * Definition for singly-linked list.
 class ListNode {
     public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
 }
 
public class ReverseLinkedList {

    public static void main(String[] args)
    {
        ListNode node = new ListNode(0);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        node.next.next.next = new ListNode(3);
        node.next.next.next.next = new ListNode(4);
        node.next.next.next.next.next = new ListNode(5);
        node.next.next.next.next.next.next = new ListNode(6);
        node.next.next.next.next.next.next.next = new ListNode(7);
        reverseBetween(node,2, 5);
          
    }
    
    public static ListNode reverseBetween(ListNode A, int B, int C) {
        
        ListNode prev = null;
        ListNode curr = A;
        int i;
        for(i = 1; i < B; i++){
            prev = curr;
            curr = curr.next;
        }

        ListNode rtail = curr;
        ListNode rhead = null;
        while(i <= C){
            ListNode next = curr.next;
            curr.next = rhead;
            rhead = curr;
            curr = next;
            i++;
        }

        if(prev != null){
            prev.next = rhead;
        } else {
            A = rhead;
        }

        rtail.next = curr;

        return A;

    }


    public static ListNode reverseList(ListNode A) {
        ListNode rh = null;
        ListNode t = A;
        while(A!= null){
            t = A;
            A = A.next;
            t.next = rh;
            rh = t;
        }
        return rh;
    }
}
