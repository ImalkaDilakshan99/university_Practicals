package practical4;

public class TestLinkedList {
    public static void main(String[] args){
        SLinkedList list = new SLinkedList();

        list.insertFirst(50);
        list.insertFirst(40);
        list.insertEnd(10);
        list.display();

        //search 50 is available
        Node newnNode = list.searchNode(50);

        newNode.displayNode();

        //insert 200 after 10
        Node data10_node = list.searchNode(10);
        list.insertAfter(data10_node,200);
        list.display();

        //delete from first
        Node deletedNode = list.deleteFirst();
        deletedNode.displayNode();
        System.out.println("is Deleted");
        list.display();
       

    }
   
}
