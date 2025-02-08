import java.util.Scanner;
public class StarPattern2{
    public static void main(String[] args){
        int num = 5;
        for(int i = 1; i <= num ; i++){

            for(int j = 1; j <= num - 1 ; j++){
                System.out.print("");



            }
            for(int j = 1; j <= 2 * num - 1; j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }
    
}
class d{
    public static void stringTogether(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = 6;
       sc.close();

        System.out.println("your answer is "+n);
    }
}