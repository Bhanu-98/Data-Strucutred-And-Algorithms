public class ReverseLinkedListBasic {
    static class Node {
        int val;
        Node next;
        public Node(int x){
            this.val = x;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        reverseLinkedList(node);
        
    }

    public static Node reverseLinkedList(Node node){
        Node rh = null;
        Node t = node;
        while(node!= null){
            t = node;
            node = node.next;
            t.next = rh;
            rh = t;
        }
        return rh;
    }
}
