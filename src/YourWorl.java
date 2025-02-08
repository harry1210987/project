import java.util.Scanner;
public class YourWorl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = sc.nextInt();
        sc.close();
        YourWorl yw1 = new YourWorl();
        int num = yw1.addition(input);
        yw1.display(num);




    }
    public  int addition(int input){

        int num = input + 12;
        return num;

    }
    public void display(int num){
        System.out.println("Your answer is "+num);

    }

}