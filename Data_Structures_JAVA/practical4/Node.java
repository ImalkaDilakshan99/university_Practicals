package practical4;

public class Node {
    int data;
    Node next;

    //Constructor
    public Node(int data){
        this.data = data;
        this.next = null; 
    }

    //display a Node
    public void displayNode(){
        System.out.println(data);
    }
}
