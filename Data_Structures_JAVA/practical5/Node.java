package practical5;

public class Node {
    int data;
    Node prev; // previous node
    Node next; // next node

    // Contructor
    public Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }

}
