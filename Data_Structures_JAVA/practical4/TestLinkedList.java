package practical4;

public class TestLinkedList {
    public static void main(String[]args){
        SLinkedList list = new SLinkedList();

        //insertFirst method() check
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);

        //insertEnd Method() check
        list.insertEnd(50);
        list.insertEnd(60);

        list.display();

        // Search 50 is available
        Node newNode = list.searchNode(50);
        if (newNode != null) {
            newNode.displayNode();
            System.out.println("");
            
        }

        // Insert 200 after 10
        Node data10_node = list.searchNode(10);
        if (data10_node != null) {
            list.insertAfter(data10_node, 200);
            System.out.println("Inserted");
        }
        list.display();

        // Delete from first
        Node deletedNode = list.deleteFirst();
        if (deletedNode != null) {
            System.out.println("is Deleted");
            deletedNode.displayNode();
            
        }
        list.display();

        //Delete from End
        Node deletedEndNode = list.deleteEnd();
        if(deletedEndNode != null){
            System.out.println("is Deleted");
            deletedEndNode.displayNode();
        }
        list.display();

        //Delete 200 after 10
        list.deleteAfter(data10_node);

        list.display();
    }   

}
