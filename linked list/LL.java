

class Node {
    
    int data;
    Node next;

    
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
};


public class LL {
    public static void main(String[] args) {
        int[] ar = {2, 5, 8, 7};
        Node x = new Node(ar[3]);
        System.out.println(x.data);
    }
}
