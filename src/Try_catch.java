import java.util.Scanner;
public class Try_catch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : \t");
        int num = sc.nextInt();
        int result = 0;

        try{
            result = 5 / num ;
            sc.close();


        }
        catch(ArithmeticException e){
            System.out.println("your cannot put 0 in the denominator");

        }
        finally{
            System.out.println("your answer is "+result);
        }

    }
}