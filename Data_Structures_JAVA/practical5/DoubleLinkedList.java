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
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            newNode.prev = lastNode;
            lastNode.next = newNode;

        }
    }

    // InsertAfter() Method
    public void InsertAfter(int prevData, int data){
        if(isEmpty()){
            System.out.println("Double Linked List is empty. ");
        }else{
            Node prevNode = searchNode(prevData);
            if(prevNode == null){
                System.out.println("Given data is not available. ");
            }else{
                Node newNode = new Node(data);
                newNode.next = prevNode.next;
                newNode.prev = prevNode;
                prevNode.next.prev = newNode;
                prevNode.next = newNode;

            }
        }
    }

    // DeleteFirst() Method
    public Node deletFirst(){
        Node currentNode = null;
        if(isEmpty()){
            System.out.println("List is empty.");
        }else{
            currentNode = head;
            head = head.next;
            head.prev = null;
        }
        return currentNode;
    }

    //deleteEnd() Method
    public Node deletEnd(){
        Node lastNode = head;
        while(lastNode != null){
            lastNode = lastNode.next;
        }
        Node newLastNode = lastNode.prev;
        newLastNode.next = null;
        return lastNode;

    }

    // deleteAfter() Method
    public Node deletAfter(int prevData){
        Node delNode = null;
        if(isEmpty()){
            System.out.println("List Is Empty. ");
        }else{
            Node prevNode = searNode(prevData);
            if(prevNode == null){
                System.out.println("Given Data is Not available. ");      
            }else{
                delNode = prevNode.next;
                prevNode.next = prevNode.next.next;
                prevNode.next.next = prevNode.next.next.next;
                prevNode.next.next.prev = prevNode;
            }
            
        }
        return delNode;
    }


}
