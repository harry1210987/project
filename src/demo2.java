public class demo2{
    public static void main(String[] args){
        int num1 = 6;
        int num2 = 15;
        int ans;
        
        for(int i = 0 ; i < Math.min(num1,num2); i++){

            if(num1 % i == 0 || num2 % i == 0 ){

                ans = i ;
                System.out.println("your answer is "+ans);
            }
        }
    }
    
}