// find whther the element of the array is in increasing order after taking
// two adjacent element of the array and performin addition on bothe element and divide it by 2
public class replace{

    public static void main(String[] args){             //wrong code;
        int[] arr = {1,2,2};
        int[] arr1 = new int[arr.length];
        for(int i = 0; i < arr.length ; i++){
            arr1[i] = arr[i];
            System.out.println("element in the copied array"+ arr1[i]);

        }
        System.out.println();

        
        int temp = 0;
        int count = 0; 
        for(int i = 1 ;i < 3; i++){
            

            temp = (arr[i-1] + arr[i]) / 2 ;
            arr1[i] = temp;
            System.out.println("after performing operation " +arr1[i]);

               

        }
        
        for(int i = 1; i < arr.length ; i++){
            System.out.println("your elements are "+arr[i]);

            if(arr1[i - 1] < arr1[i]){

                count++;

            }
            
        }
        if(count == 2){                             //if correct then it is in increasing order
            System.out.println("yes");

        }
        else{

            System.out.println("no my nigga");
        }

    }
}