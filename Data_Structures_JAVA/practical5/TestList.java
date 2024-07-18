package practical5;

public class TestList {
    public static void main(String []args){
        DoubleLinkedList list1 = new DoubleLinkedList();

        // Insert First
        list1.InsertFirst(10);
        list1.InsertFirst(20);
        list1.InsertFirst(30);
        list1.InsertFirst(40);
        list1.InsertFirst(50);

        //display list1
        list1.display();

        // Print the head Node
        System.out.println("Head Node is: ");
        list1.head.displayNode();

        // Print the next node to head node
        System.out.println("Next node to head node: ");
        list1.head.next.displayNode();

        // After insert
        System.out.println("after inserting node after node 40: ");
        list1.InsertAfter(40, 100);
        list1.display();

        // Delete last node
        System.out.println("Delete last node: ");
        list1.deletEnd();
        list1.display();
    }
}

