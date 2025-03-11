public class Length{
    public static void main(String[] args){
        int[] arr = {14,735,3333,223232};
        int count = 0;
        int evenCount = 0;
        int oddCount = 0;
        
        for(int i = 0;i < arr.length; i++){
            int temp = arr[i];
            while( temp > 0){
                
                temp = temp  / 10;
                count++;
                
                
            }
            if (count % 2 == 0){        //to verify whether string is even or not 
                evenCount++;
            
            }
            else{

                oddCount++;
            }
            count = 0;

        }
        //your final answer

        System.out.println("total even no. of strings is "+evenCount);
        System.out.println("your odd no. of element is "+oddCount);
    }
}