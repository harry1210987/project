/*
  to find the repetition of the string  if and choose the string with the string with the highest repetition, but if there are more strings highest fresquency and then choose the one with the alphabetical order
 */
public class ModeString {
    public static void main(String[] args) {

        String[] arr = { "hello", "world", "crio", "crio" };
        int[] arr1 = {0,0,0,0};
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j] ){
                    arr1[i]++;

                
            
                }
            
               

            }
            
        }



    }
}