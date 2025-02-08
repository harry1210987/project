public class Equal{
    public static void main(String[] args){
        int[] arr = {1,2,3,4};      // to count odd and even is equal or not 
        int evenCount = 0;
        int oddCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }

        }
        System.out.println("the odd number is "+oddCount);  //even and odd count
        System.out.println("the even no. is "+evenCount);

        if(oddCount == evenCount){
            System.out.println("yes");


        }
        else{
            for(int i = 0; i <= arr.length; i++){
                if(arr[i] % 2 == 0){
                    while(arr[i] > 0){
                        arr[i] = arr[i] / 2;


                        
                    }
                    

                }
                if(arr[i] % 2 ==0){
                    System.out.println("yes");

        
                }
                else{

                    System.out.println("no");
                    System.out.println("the count of the odd element is "+oddCount);
                    System.out.println("the count of the odd element is  "+evenCount);
                }
            }

        }


    }


}