package practical4;

public class SLinkedList {
    Node head;

    //Constructor
    public SLinkedList(){
        this.head = null;
    }

    //isEmpty() method to check if a LinkedList empty
    public boolean isEmpty(){
        return (head == null);
    }

    //Insert Operation
    
    //InsertFirst() method
    public void insertFirst(int new_data){

        //check if linkedList is empty or not
        if(isEmpty()){
             head = new Node(new_data);
             return;
        }
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    //desplay() method to print all data in the LinkedList
    public void display(){
        Node current = head;
        System.out.println("Node (first-->last): ");
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }

    //InsertEnd() method
    public void insertEnd(int new_data){

        //check if linkedList is empty or not
        if(isEmpty()){
            head = new Node(new_data);
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = null;
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;


    }

    //searchNode method to search a Node
    public Node searchNode(int data) {

        //check if linked list empty or not
        if(isEmpty()){
            head = new Node(data);
            return null;
        }

        Node prev_node = null;
        Node current = head;
        while(current != null){
            if(current.data == data){
                prev_node = current;
                System.out.println("Found the Node");
                break;
            }
            current = current.next;
        }
        return prev_node;
    }

    //InsertAfter()method
    public void insertAfter(Node prev_node, int new_data){
        // assumed list is not empty
        if(prev_node == null){
            System.out.println("The given node is null.");
            return;
        }
    

    Node new_node = new Node(new_data);
    new_node.next = prev_node.next;
    prev_node.next = new_node;
    }

    //Deletion operation

    //deleteFirst()
    public Node deleteFirst(){
        Node currentHNode = head;
        if(isEmpty()){
            System.out.println("Linked list is Empty");
        }
        else{
            head = head.next;
        }
        return currentHNode;
    }

    //deleteEnd
    //deleteAfter

    
    
    
    

}
