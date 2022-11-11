public class LinkedList {
    
    static class ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
    
    
    public static void main(String[] args) {
        int[][] A = {
            {0, 13, -1},
            {2, 10, 0},
            {2, 7, 0},
            {2, 4, 3},
            {1, 20, -1},
            {0, 4, -1},
            {0, 15, -1},
            {2, 9, 3},
            {3, 5, -1},
            {0, 11, -1},
            {3, 1, -1},
            {1, 20, -1},
            {1, 8, -1},
            {3, 5, -1},
            {1, 14, -1},
            {2, 4, 1},
            {0, 9, -1},
            {0, 13, -1},
            {1, 5, -1},
            {3, 8, -1},
            {2, 5, 0},
            {3, 7, -1},
            {0, 14, -1},
            {1, 19, -1},
            {2, 3, 10},
            {1, 3, -1},
            {1, 18, -1},
            {0, 13, -1},
            {3, 16, -1},
            {3, 0, -1},
            {1, 4, -1},
            {2, 1, 13},
            {0, 5, -1},
            {2, 17, 5},
            {2, 17, 3},
            {2, 7, 21},
            {3, 15, -1},
            {0, 15, -1},
            {1, 19, -1},
            {1, 4, -1},
            {0, 7, -1},
            {1, 4, -1},
            {3, 5, -1},
            {1, 11, -1},
            {2, 15, 24},
            {2, 17, 8},
            {2, 15, 18},
            {3, 2, -1},
            {3, 17, -1},
            {3, 21, -1},
            {0, 15, -1},
            {0, 13, -1},
            {0, 11, -1},
            {3, 7, -1},
            {1, 16, -1},
            {1, 4, -1},
            {1, 7, -1},
            {0, 20, -1},
            {1, 11, -1},
            {2, 1, 6},
            {2, 8, 9},
            {0, 3, -1},
            {3, 25, -1},
            {3, 9, -1}
        };
        ListNode res = solve(A);
        while(res.next !=null){
            System.out.print(res.val + "->");
            res = res.next;
        }
        System.out.println(res.val);
    }
    
    private static ListNode headNode = null;
    private static int size = 0;
    
    public static ListNode solve(int[][] A) {
        for(int i = 0; i < A.length; i++){
            if(A[i][0] == 0){
                insert_node(0, A[i][1]);
            } else if(A[i][0] == 1){
                insert_node(size, A[i][1]);
            } else if(A[i][0] == 3){
                delete_node(A[i][1]);
            } else {
                insert_node(A[i][2], A[i][1]);
            }
        }
        return headNode;
    }
    
    public static void insert_node(int position, int value) {
        ListNode node = new ListNode(value);
        if(position == 0){  
            node.next = headNode;
            headNode = node;
            size++;
            return;
        }
        
        if(position > size){
            return;
        }
        
        size++;
        ListNode current = headNode;
        for(int i = 1; i < position; i++){
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
    }
    
    public static void delete_node(int position) {
        if(headNode == null || position > size){
            return;
        }
        
        if(position == 0){
            headNode = headNode.next;
            size--;
            return;
        }
        
        size--;
        ListNode current = headNode;
        for(int i = 1; i < position; i++){
            current = current.next;
        }
        
        current.next = current.next.next;
    }
}


