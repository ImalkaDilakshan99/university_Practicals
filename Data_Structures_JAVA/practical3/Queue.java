package practical3;

public class Queue {
    // Create Variables
    int front;
    int rear;
    int size;
    int arr[];

    // Constructor
    public Queue(int size){
        arr = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }

    // isFull method
    Boolean isFull(){
        // if queue is full
        if(rear == size-1){
            return true;
        }else{
            return false;
        }
    }

    // isEmpty method
    Boolean isEmpty(){
        //if queue is empty
        if(front == -1)
            return true;
        else
            return false;
    }

    // enqueue method
    void enqueue(int value){
        // if full
        if (isFull()) {
            System.out.println("Queue is full");
        }else{
            //is first element is empty
            if(isEmpty()){
                front=rear=0;
                arr[rear] = value;
                System.out.println("item "+value+ " inserted");
                
            }
            // queue is not empty
            else{
                rear++;
                arr[rear] = value;
                System.out.println("item "+value+ " inserted");

            }
        }
    }

    // dequeue method
    int dequeue(){
        int value=0;
        // if empty
        if(isEmpty()){
            System.out.println("Queue is empty.");
        }else{
            value = arr[front];
            arr[front] = 0;
            front++;
            System.out.println("item "+value+" removed");
        }

        return value;
    }

    //peek method
    int peek(){
        return arr[front];
    }

    //display method
    void display(){
        for(int i=front; i<=rear; i++){
            System.out.println("item "+i+ " = " +arr[i] );
        }
    }

    //main method to test
    public static void main(String[]args){
        //Create a queue
        Queue q1 = new Queue(5);

        // add items to the queue
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);

        //add items to a full queue
        System.out.println("\nAdd items to full queue");
        q1.enqueue(60);

        System.out.println("\nPrint all the items in the queue.");
        q1.display();

        //remove the items
        System.out.println("\nRemove two items from the queue.");
        q1.dequeue();
        q1.dequeue();

        System.out.println("\nPrint the new queue.");
        q1.display();

        Queue q2 = new Queue(5);
        // Remove items in the empty queue
        System.out.println("\nRemove items in the empty queue");
        q2.dequeue();

    }

}
