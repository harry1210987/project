import java.util.Scanner;
public class Pointer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num2 = sc.nextInt();
        sc.close();


        int num = 12;
        int num1 = 13;
        int ans = num + num1 + num2;
        
        System.out.println("ypur answer is "+ans);

    }
    
}