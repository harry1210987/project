import java.util.Scanner;

public class StarPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StarPattern st1 = new StarPattern();

        System.out.println("Enter the Number");
        int num = sc.nextInt();
        sc.close();

        st1.display(num);


    }
    public void display(int num){
        for(int i = 0 ; i <= num ;i++){     //intialization of the vertical array star pattern

            for(int j = 1; j <= num - 1; j++){      //in the inner loop  for spaces

                System.out.print("");

            }
            for(int j = 1; j <= 2 * i - 1;j++){     //in the inner loop for printing the stars for printing stras upto the 9th length
                System.out.print("*");

            }
            System.out.println();

        }
    }

}