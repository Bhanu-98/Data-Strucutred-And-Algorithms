public class DeleteMiddleNode {
    
    static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
    public static void main(String[] args) {
        ListNode headNode = new ListNode(1);
        headNode.next = new ListNode(2);
        headNode.next.next = new ListNode(3);
        headNode.next.next.next = new ListNode(4);
        headNode.next.next.next.next = new ListNode(5);
        ListNode node = solve(headNode);
        while(node != null){
            System.out.println(node.val + "->");
            node = node.next;
        }
    }
    public static ListNode solve(ListNode A) {
        int size = 0;
        ListNode current = A;
        while(current != null){
            size = size + 1;
            current = current.next;
        }
        
        current = A;
        int count = 0;
        while(current != null){
            if((count == size / 2) || (count == (size + 1) / 2)){
                A.next = A.next.next;
            }
            count++;
        }
        return A;
    }
}
