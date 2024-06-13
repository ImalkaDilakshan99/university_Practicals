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

    //peek() method
    //return type
    //no parameter
    int peek(){
        int value=0;
        if(top==-1){
            System.out.println("Stack is empty.");
        }else{
            value = arr[top];
        }

        return value;
    }

    // get size() method
    // int return type
    // no parameters
    int getSize(){
        return top+1;
    }

    // is Empty() method
    // boolean type
    // no parameter
    Boolean isEmpty(){
        return top == -1;
    }

    // is Full() method
    // boolean type
    // no parameter
    Boolean isFull(){
        return top==uB;
    }

    // printStack() method
    // no return type
    // no parameter
    void printStack(){
        for(int i=0; i<=top; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args){

        //Create a Stack
        StackStructure stack1 = new StackStructure(5);
        //insert items
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);
        stack1.push(60);

        //print the stack1
        stack1.printStack();

        //remove itemss
        stack1.pop();

        
        //print the stack1
        stack1.printStack();

        //get the size of the stack
        System.out.println("Size = "+stack1.getSize());

    }

}
