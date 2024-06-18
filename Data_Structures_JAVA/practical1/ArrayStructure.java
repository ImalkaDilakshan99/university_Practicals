package practical1;

public class ArrayStructure{


        //Delete array element in given location
        void deleteArrayLocation(int arr[],int location){
            
            int uB = arr.length-1;
            if(arr[location]==0){
                System.out.println("Location element is null");
            }else{
                int i=location;
                while(i<uB){
                    arr[i]=arr[i+1];
                    i++;
                }
                arr[uB]=0;
            }
        }
    
        //delete array in given element
        void deleteArray(int arr[],int key){
            ArrayStructure object = new ArrayStructure();
            int location = object.searchArray(arr, key);
    
            int uB = arr.length-1;
            if(location==-1){
                System.out.println("Not availble this element");
            }else{
                int i=location;
                while(i<uB){
                    arr[i]=arr[i+1];
                    i++;
                }
                arr[uB]=0;
            }
        }
        
        //Search Array
        int searchArray(int arr[],int key){
            int lB=0;//Lower bound
            int uB = arr.length-1;
            int i = lB, found =0, location=-1;
            while(i<=uB && found==0){
                if(arr[i]==key){
                    found=1;
                    location=i;
                }else{
                    i++;
                }
            }
            if(found==0){
                System.out.println(key+" is not found");
            }else{
                System.out.println(key+" is found");
            }
    
            return location;
        }
    
        //Traverse Array
        void traverseArray(int arr[]){
            int size =arr.length;
            for(int i=0; i<size;i++){
                System.out.printf("array[%d]= %d \n",i,arr[i]);
            }
        }
    
        //Insert Array
        void insertArray(int arr[],int location,int key){
            int uB = arr.length-1;//upper bound
            if(arr[uB]!=0){
                System.out.println("The array is full");
            }else{
                int i =uB;
                while(i>location){
                    arr[i]=arr[i-1];
                    i--;
                }
                arr[location]=key;
            }
        }
    
        public static void main(String[]args){
            
            //Create a new array
            int array1[] = new int[10];
            //Access elements in array
            array1[0]=10;
            array1[1]=20;
            array1[2]=30;
            array1[3]=40;
            array1[4]=50;
            array1[5]=60;

            ArrayStructure object = new ArrayStructure();
    
            object.traverseArray(array1); //Traverse the array
            object.insertArray(array1, 6, 60); //Insert the new element to array
            object.searchArray(array1, 30); //Search the element in array
            object.deleteArray(array1, 60); //Delete the given element in array
            object.deleteArrayLocation(array1, 6); //Delete the array by it location
    
        
        }

}