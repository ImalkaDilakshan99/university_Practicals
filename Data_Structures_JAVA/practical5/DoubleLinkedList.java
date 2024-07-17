package practical5;

public class DoubleLinkedList {
    Node head;

    // Constructor
    public DoubleLinkedList(){
        this.head = null; //initial the linked list is empty
    }

    // Operations

    // IsEmpty Method
    public boolean IsEmpty(){
        return (head == null);
    }

    // InsertFirst() Method
    public void InsertFirst(int data){
        if(IsEmpty()){
            Node newNode = new Node(data);
            head = newNode;
        }else{
            Node newNode = new Node(data);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // display() method
    public void display(){
        Node currentNode = head;
        while(currentNode != null){
            currentNode.displayNode();
            currentNode = currentNode.next;
        }
    }

    // Search() Method
    public Node searNode(int data){
        Node foundNode = null;
        Node current = head;
        while(current != null){
            if(current.data == data){
                foundNode = current;
            }else{
                System.out.println("Node not found. ");
            }
            current = current.next;
        }
        return foundNode;
    }
   
    // InsertEnd() Method
    public void InsertEnd(int data){
        if(IsEmpty()){
            head = new Node(data);
        }else{
            Node newNode = new Node(data);
            Node lastNode = head;
            while(lastNode.next != head){
                lastNode = lastNode.next;
            }
        }
    }

}
