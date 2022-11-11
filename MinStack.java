public class MinStack {
    public static void main(String[] args) {
        
    }

    class Node {
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    Node headNode = null;
    int size = 0;
    int min = Integer.MAX_VALUE;

    public void push(int x) {
        Node node = new Node(x);
        node.next = headNode;
        headNode = node;
        size++;
    }

    public void pop() {
        if(headNode == null){
            return;
        }
        headNode = headNode.next;
        size--;
    }

    public int top() {
        if(headNode == null){
            return -1;
        }
        return headNode.val;
    }

    public int getMin() {
        if(headNode == null){
            return -1;
        }
        Node current = headNode;
        while(current != null){
            if(current.val < min){
                min = current.val;
            }
            current = current.next;
        }
        return min;
    }
}
