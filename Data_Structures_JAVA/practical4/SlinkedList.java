package practical4;

public class SlinkedList {
    Node head;

    //Constructor
    public SlinkedList(){
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
        System.out.println("Node (first-->last)");
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println("");
    }

    //InsertEnd() method

    //searchNode method to search a Node

    //InsertAfter()method

    //Deletion operation
    //deleteFirst()
    //deleteEnd
    //deleteAfter

    
    
    
    

}
