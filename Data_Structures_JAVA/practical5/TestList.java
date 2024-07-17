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
    }
}

