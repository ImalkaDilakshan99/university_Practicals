public class StackStructure {

    /**
     * integer array arr
     * integer variable uB
     * integer variable top
     */
    
    int[] arr;
    int top;
    int uB;

    //Contructor
    //initial condition when creating a stack
    public StackStructure(int size){
        arr = new int[size];
        uB = size - 1;
        top = -1;
    }

    //push() method to insert items to stack
    //not return type
    //one parameter
    void push(int value){
        //check the stack is full or not
        if(top == uB){
            System.out.println("Stack is Overflow");
        }else{
            top++;
            arr[top] = value;
            System.out.println(value +" Inserted.");
        }
    }

    //pop() method to remove items from the Stack
    //return type
    //no parameter
    int pop(){
        int value = 0;
        //Check if Stack is empty or not
        if(top == -1){
            System.out.println("Stack Underflow");
        }else{
            value = arr[top];
            arr[top] = 0;
            top--;
            System.out.println(value + " removed.");
        }

        return value;
    }

    public static void main(String[] args){

        //Create a Stack

    }

}
